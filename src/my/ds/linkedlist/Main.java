package my.ds.linkedlist;

public class Main {
    public static void main(String[] ar) {
        LinkedList linkedList = new LinkedList(2);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.printList();
        linkedList.removeLat();
        linkedList.printList();
    }
}