import java.util.HashSet;
import java.util.Iterator;

public class Hashsetex1 {
    public static void main(String[]args){
        HashSet<String>h=new HashSet<String>();
        h.add("gfg");
        h.add("courses");
        h.add("ide");
        System.out.println(h);
        System.out.println(h.contains("ide"));
        Iterator<String>it=h.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");

        }

    }
}
