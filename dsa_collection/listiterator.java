import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class listiterator {

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        ListIterator<Integer>it=list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        ListIterator<Integer>it1=list.listIterator(list.size());
        while(it1.hasPrevious()){
            System.out.println(it1.previous()); 
        }
    }
}