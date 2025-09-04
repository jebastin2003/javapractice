import java.util.ArrayList;
import java.util.Scanner;
public class arratlistodddeven {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size of array:"+" ");
        int n=s.nextInt();
        int a []=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter number"+" "+(i+1)+":"+" ");
            a[i]=s.nextInt();
            
        }
        s.close();
        getevenodd(a);
    }
    public static void getevenodd(int a[]){
        ArrayList<Integer>even=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even.add(a[i]);
            }else{
                odd.add(a[i]);
            }

        }
        System.out.println("even num is"+even);
        System.out.println("odd num is"+odd);


    }
}
