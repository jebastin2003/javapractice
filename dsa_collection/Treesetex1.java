import java.util.TreeSet;
import java.util.Iterator;
public class Treesetex1 {
    public static void main(String[]args){
        TreeSet<String>ts=new TreeSet<String>();
        ts.add("jebastin");
        ts.add("course");
        ts.add("ide");
        System.out.println(ts);
        System.out.println(ts.contains("ide"));
        Iterator<String>it=ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
    }
}
