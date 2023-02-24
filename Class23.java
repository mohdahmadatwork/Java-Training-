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
         
        boolean isArraySorted = HomeworkOfClass23.isArraySorted(arr2);
        System.out.print("is given array "+" sorted : "+ isArraySorted);
        int [] arr3 = {0,0,1,1,1,2,2,3,3,4};
        printArr(arr3);
        HomeworkOfClass23.removeDuplicatesApproach1(arr3);
        printArr(arr3);
        HomeworkOfClass23.findLeaderApproach1(arr3);
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
class HomeworkOfClass23{
    public static boolean isArraySorted(int[]arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean searchInList(ArrayList<Integer> list,int k){
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j)==k) {
                return false;
            }
        }
        return true;
    }
    public static int removeDuplicatesApproach1(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (searchInList(list, nums[i])) {
                list.add(nums[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
    public static boolean isLeader(int [] arr,int k) {
        for (int j = k+1; j < arr.length; j++) {
            if(arr[j]>arr[k]){
                return false;
            }
        }
        return true;
    }
    public static void findLeaderApproach1(int [] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isLeader(arr, i)) {
                if (searchInList(list, arr[i])) {
                    list.add(arr[i]);
                }
            }
        }
        System.out.println(list);
    }
}
