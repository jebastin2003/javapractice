import java.util.HashSet;
public class Sumpaireffmethodhashset {
    static boolean ispair(int arr[],int sum){
        HashSet <Integer>hs=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            if(hs.contains(sum-arr[i])){
                return true;
            }else{
                hs.add(arr[i]);
            }
        }
        return false;

    }
    public static void main(String args[]){
        int arr[]={3,2,8,15,-8};
        int sum=17;
        System.out.println(ispair(arr,sum)?"yes":"no");

    }
}
