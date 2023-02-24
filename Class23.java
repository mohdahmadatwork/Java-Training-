import java.util.ArrayList;
import java.util.HashMap;

public class Class23 {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        printArr(arr);
        reverseArr(arr);
        printArr(arr);
        int arr2[] = {2,1,5,6,3,7};
        pairSum_approach1(arr2, 11);
        pairSum_approach2(arr2, 11);
         
        
    }
    public static void printArr(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void reverseArr(int [] arr) {
        for (int i = 0,j=arr.length-1; i <= arr.length/2 && j>=arr.length/2; i++,j--) {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void pairSum_approach1(int [] arr,int k) {
        for (int i = 0; i <=arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==k){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    // Using Hashmap
    public static void pairSum_approach2(int []arr,int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i])==null) {
                map.put(k-arr[i], arr[i]);
            }
            else{
                System.out.print(map.get(arr[i]));
                System.out.print(" "+arr[i]);
            }
        }
    }
    public static void pairSum_approach3(int []arr,int k) {
        
    }
}
