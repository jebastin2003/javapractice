import java.util.*;
public class Arraylisttraversemthod4 {
    public static void main(String [] args){
        ArrayList<Integer>al=new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(5);
        Iterator <Integer>it=al.iterator();
        while(it.hasNext()){
            int x=it.next();
            if(x<10){
                it.remove();
            }else{
                System.out.println(x);
            }

        }

    }
}
