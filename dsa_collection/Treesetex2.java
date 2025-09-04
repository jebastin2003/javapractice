import java.util.TreeSet;
public class Treesetex2 {
    public static void main(String []args){
        TreeSet<Integer>ts=new TreeSet<Integer>();
        ts.add(10);
        ts.add(5);
        ts.add(2);
        ts.add(15);
        ts.remove(5);
        for(Integer x:ts){
            System.out.println(x+" ");

        }


    }
}
