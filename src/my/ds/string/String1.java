package my.ds.string;

public class String1 {



    public static void main(String[] ar) {

        String s = "Vijay Kumar";
        String s1 = new String("Vijay Kumar");

        //System.out.println ( s.length());
        System.out.println ( s.charAt(6));
       s.toUpperCase();
       s.toLowerCase();
       System.out.println(s.contains("Aum"));
     //  s.startsWith();
       //s.endsWith();
        System.out.println(s.substring(7));

        StringBuilder sb = new StringBuilder("Vijay");
        sb.append("Kumar");
        System.out.println(sb);





    }


}
