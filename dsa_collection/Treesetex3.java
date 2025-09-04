import java.util.TreeSet;
public class Treesetex3 {
    public static void main(String []args){
        TreeSet<Integer>ts=new TreeSet<Integer>();
        ts.add(10);
        ts.add(5);
        ts.add(2);
        ts.add(15);
        System.out.println(ts.lower(5));
        System.out.println(ts.higher(10));
        System.out.println(ts.floor(4));
        System.out.println(ts.ceiling(10));
        System.out.println(ts.first());
        System.out.println(ts.last());


    }
}
