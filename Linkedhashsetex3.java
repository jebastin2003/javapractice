import java.util.LinkedHashSet;

public class Linkedhashsetex3 {
    public static void main(String []args){
        int arr[]={4,8,5,8,7,5};
        LinkedHashSet <Integer> lh=new LinkedHashSet<Integer>();
        for(int x:arr){
            lh.add(x);
        }
        for(int x:lh){
            System.out.print(x+" ");

        }

    }
}
