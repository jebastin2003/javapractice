import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class setmethod {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        ListIterator<Integer>it=list.listIterator(list.size());
        while(it.hasPrevious()){
            int x=it.previous();
            it.set(x*2);
        }
        list.set(1,80);
        System.out.println(list);
    }
}
