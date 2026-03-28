package my.ds.windowmap;

import java.io.Serializable;
import java.util.*;

public class WindowedMap<K, V extends Number> {
    private final long windowSizeMillis;
    private final Map<K, List<TimestampedValue<V>>> map = new HashMap<>();

    public WindowedMap(long windowSizeMillis) {
        this.windowSizeMillis = windowSizeMillis;
    }

    public void put(K key, V value) {
        long currentTime = System.currentTimeMillis();
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(new TimestampedValue<>(value, currentTime));
        cleanUp(key);
    }

    public V get(K key) {
        cleanUp(key);
        List<TimestampedValue<V>> values = map.getOrDefault(key, Collections.emptyList());
        return values.isEmpty() ? null : values.get(values.size() - 1).value;
    }

    public double average(K key) {
        cleanUp(key);
        List<TimestampedValue<V>> values = map.getOrDefault(key, Collections.emptyList());
        if (values.isEmpty()) return 0.0;
        return values.stream().mapToDouble(v -> v.value.doubleValue()).average().orElse(0.0);
    }

    private void cleanUp(K key) {
        long currentTime = System.currentTimeMillis();
        map.computeIfPresent(key, (k, values) -> {
            values.removeIf(tv -> currentTime - tv.timestamp > windowSizeMillis);
            return values.isEmpty() ? null : values;
        });
    }

    private  static class TimestampedValue<V> {
        V value;
        long timestamp;
        TimestampedValue(V value, long timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }

    }

    public static void main(String[] args) throws InterruptedException {
        WindowedMap<String, Integer> windowedMap = new WindowedMap<>(5000); // 5-second window
        windowedMap.put("test", 10);
        Thread.sleep(2000);
        windowedMap.put("test", 20);
        System.out.println("Get: " + windowedMap.get("test")); // Should return last value within window
        System.out.println("Average: " + windowedMap.average("test")); // Should return average of values in window
        Thread.sleep(5000);
        System.out.println("Get after expiration: " + windowedMap.get("test")); // Should return null
    }
}
