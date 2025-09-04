import java.util.*;
public class lessnumusingarrlist {
    static List<Integer> getsmaller(int []arr,int k){
        List<Integer>small=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(k>arr[i]){
                small.add(arr[i]);
            }
        }
        return small;

    }
    public static void main(String []args){
        int [] arr={10,20,30,40,50,60};
        List <Integer> al=getsmaller(arr,30);
        for(int x:al){
            System.out.println(x);

        }

    }
}
