import java.util.LinkedHashSet;
public class Linkedhashsetex2 {
    public static void main(String []args){
        int arr[]={30,20,20,10,30};
        LinkedHashSet<Integer>set=new LinkedHashSet<Integer>();
        for(int x:arr){
            set.add(x);
        }
        for(int x:set){
            System.out.print(x+" ");

        }

    }
}
