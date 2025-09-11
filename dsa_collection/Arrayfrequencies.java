import java.util.*;
public class Arrayfrequencies {

    static void printFrequencies(int arr[])
    {
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry x : map.entrySet()) {
            System.out.println(x.getKey() + " "+ x.getValue());
        }
    }

    public static void main(String args[]){
        int arr[] = { 10, 5, 20, 5, 10, 5 };
        printFrequencies(arr);
}

}

