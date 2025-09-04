import java.util.ArrayList;

public class arraylistmethods {
    public static void main(String[] args) {
        ArrayList<String>al=new ArrayList<String>();
        al.add("geeks");
        al.add("ide");
        al.add("courses");
        System.out.println(al);
        al.add(1,"practice");
        System.out.println(al);
        System.out.println(al.contains("ide"));
        al.remove(0);
        System.out.println(al.contains("geeks"));
        al.remove("courses");
        System.out.println(al.contains("courses"));
        ArrayList<Integer>al1=new ArrayList<Integer>();
        al1.add(10);
        al1.add(20);
        al1.add(10);
        al1.add(30);
        System.out.println(al1.get(1));
        al1.set(1,90);
        System.out.println(al1.get(1));
        System.out.println(al1.indexOf(10));
        System.out.println(al1.lastIndexOf(10));
        System.out.println(al1.indexOf(50));
        System.out.println(al1.isEmpty());
        al1.clear();
        System.out.println(al1.isEmpty());
    }
}
