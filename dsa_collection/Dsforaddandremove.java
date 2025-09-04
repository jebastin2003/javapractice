import java.util.Iterator;
import java.util.LinkedList;

public class Dsforaddandremove {
    LinkedList <Integer>list=new LinkedList<>();
    void add(int x){
        list.add(x);
    }
    void remove(int x){
        Iterator<Integer>it=list.iterator();
        while(it.hasNext()){
            Integer n=it.next();
            if(n.equals(x)){
                it.remove();
            }else{
                System.out.print(n+" ");
            }

        }
        System.out.println();

    }
    public static void main(String [] args){
        Dsforaddandremove obj=new Dsforaddandremove();
        obj.add(10);
        obj.add(20);
        obj.add(10);
        obj.add(30);
        obj.remove(10);
        obj.add(10);
        obj.add(20);
        obj.add(10);
        obj.add(30);
        obj.remove(10);

    }
}
