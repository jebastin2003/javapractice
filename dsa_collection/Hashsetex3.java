import java.util.HashSet;
public class Hashsetex3 {
    static void repeat(int arr[]){
        HashSet <Integer>hs=new HashSet <Integer>();
        for(int i=0;i<arr.length;i++){
        if(hs.contains(arr[i])){
            System.out.print(arr[i]+" ");
        }else{
            hs.add(arr[i]);
        }
    }

    }
    public static void main(String []args){
        int arr[]={10,8,10,8};
        repeat(arr);

    }
}
