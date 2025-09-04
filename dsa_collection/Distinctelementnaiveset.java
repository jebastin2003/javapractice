public class Distinctelementnaiveset {
    static void dst(int arr1[],int arr2[]){
        for(int i=0;i<arr1.length;i++){
            boolean flag=false;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                System.out.println(arr1[i]);

            }

        }

    }
    public static void main(String args[]){
        int arr1[]={10,15,20,25,30,50};
        int arr2[]={30,5,15,80};
        dst(arr1,arr2);

    }
}
