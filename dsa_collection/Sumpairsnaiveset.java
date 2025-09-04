public class Sumpairsnaiveset {
    static boolean sumpair(int arr[],int sum){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    return true;
                }
            }
            
            }
            return false;

        }
    
    public static void main(String []args){
        int arr[]={3,2,8,15,-8};
        int sum=17;
        System.out.println(sumpair(arr,sum)?"yes":"no");

    }
}
