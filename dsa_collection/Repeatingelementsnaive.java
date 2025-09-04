public class Repeatingelementsnaive {
    static void repeat(int arr[]){
        for(int i=1;i<arr.length;i++){
            boolean flag=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String []args){
        int arr[]={10,8,10,8};
        repeat(arr);

    }
}
