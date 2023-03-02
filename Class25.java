import java.util.HashMap;

public class Class25 {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        Class25.buySellStock_Approach_1(arr);
        Class25.buySellStock_Approach_2(arr);
        Class25.buySellStock_Approach_3(arr);

        int arr1[] = {0,1,0,0,1,1,0,0,0,1,1};
        HomeworkOfClass25.sort_0_1(arr1);
        Class24.printArr(arr1);

        int [] arr2 = {0,1,1,1,0,0,2,2,1,0,1,0,2,2};
        HomeworkOfClass25.sort_0_1_2(arr2);
        Class24.printArr(arr2);

        int [] arr3 = {1,2,3,4};
        HomeworkOfClass25.runningSum(arr3);
        Class24.printArr(arr3);

        int [] arr4 = {2,2,1,1,1,2,2};
        System.out.println(HomeworkOfClass25.majorityElement_approach_1(arr4));

        int [] arr5 = {1,1,2,2,3,3,4,4,5,5,6,6,7};
        System.out.println(HomeworkOfClass25.oddElement(arr5));

        int arr6 [] = {1,2,3,5,6};
        System.out.println(HomeworkOfClass25.missingNumber_approach_1(arr6));
        System.out.println(HomeworkOfClass25.missingNumber_XOR_approach_2(arr6));

    }
    public static void buySellStock_Approach_1(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(max< -1*(arr[i]-arr[j])){
                    max = -1*(arr[i]-arr[j]);
                }
            }
        }
        System.out.println(max);
    }
    public static void buySellStock_Approach_2(int [] arr) {
        int[] result = new int[arr.length];
        result[0] = arr[0];
        for (int i = 1; i < result.length; i++) {
            result[i] = arr[i] < result[i-1] ? arr[i] : result[i-1];
        }
        int max = 0;
        for (int i = 0; i < result.length; i++) {
            if(max < arr[i] - result[i]){
                max = arr[i] - result[i];
            }
        }
        System.out.println(max);
    }
    public static void buySellStock_Approach_3(int arr[]) {
        int min = arr[0];
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if(min>Math.min(arr[i],min)){
                min = Math.min(arr[i],min);
            }
            if(max < arr[i] - min){
                max = arr[i] - min;
            }
        }
        System.out.println(max);
    }
}
class HomeworkOfClass25{
    public static void sort_0_1(int [] arr) {
        int count_0 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                count_0++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i>=count_0) {
                arr[i]=1;
            }   
            else{
                arr[i]=0;
            }
        }
    }
    public static void sort_0_1_2(int [] arr) {
        int count_0 = 0;
        int count_1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                count_0++;
            }
            if (arr[i]==1) {
                count_1++;
            }
        }
        count_1+=count_0;
        for (int i = 0; i < arr.length; i++) {
            if (i<count_0) {
                arr[i] = 0;
            }
            else if (i<count_1) {
                arr[i]=1;
            }
            else{
                arr[i] = 2;
            }
        }
    }
    public static void runningSum(int [] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1]+arr[i];
        }
    }
    public static int majorityElement_approach_1(int [] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i])==null){
                map.put(arr[i], 1);
            }
            else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            Integer el = map.get(arr[i]);
            if(el > arr.length/2 ){
                max = arr[i];
            }
        }
        return max;
    }
    public static int oddElement(int [] arr) {
        int oddElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            oddElement = oddElement^arr[i];
        }
        return oddElement;
    }
    public static int missingNumber_approach_1(int arr[]) {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int sum_without_missing_element = (arr[arr.length-1]*(arr[arr.length-1]+1))/2;
        return sum_without_missing_element-sum;
    }
    // Below approach of finding missing number is Not an Optimize approach just an example of XOR approach
    public static int missingNumber_XOR_approach_2(int arr[]) {
        int temp = oddElement(arr); //Finding the xor previous element to next element 
        int temp_arr[] = new int[arr[arr.length-1]]; // Creating an array copy of given array with no missing element
        for (int i = arr[0],j=0; i <= arr[arr.length-1]; i++,j++) {
            temp_arr[j] = i;
        }
        int temp2 = oddElement(temp_arr); //Finding the xor of element with previous element
        return temp2^temp;  //Finding the xor of xor of given array with missing element and xor of array with no missing element
    }
}
