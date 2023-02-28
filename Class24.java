public class Class24 {
    public static void rotate(int [] arr,int n) {
        int temp = arr[0];
        int i;
        for ( i = 0; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[i] = temp;
    }
    public static void printArr(int [] arr) {
        System.out.println("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] arrayAddition(int first[],int second[]) {
        int result[] = new int [first.length>second.length?first.length:second.length];
        int i = first.length-1;
        int j = second.length-1;
        int k = result.length-1;
        int carry = 0;
        int sum = 0;
        while (k>=0) {
            if(i>=0 && j>=0){
                sum = first[i]+second[j]+carry;
            }
            else if(i>=0 && j <0){
                sum = first[i]+carry;
            }
            else if(j>=0 && i<0){
                sum = second[j]+carry;
            }
            if(k==0){
                result[k] = sum;
                break; 
            }
            result[k] = sum %10;
            carry = sum/10;
            i--;
            j--;
            k--;
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {9,5,1,7,5,3};
        printArr(arr);
        rotate(arr, arr.length);
        printArr(arr);
        int arr2[] = {9,5,6,7,8,9,1};
        printArr(arrayAddition(arr, arr2));
        
        // Problem 10 
        int first[] = {9,5,1,7,5,3};
        int second[] = {9,5,6,7,8,9,1};
        HomeworkOfClass24.subtracionArr(first, second);

        // Problem 8
        int [] nums = {1,2,3,4,5,6,7};
        HomeworkOfClass24.RotateArrayByk_approach_1(nums, nums.length, 3);
        printArr(nums);
        // in approach 2 k is the last index means from 0 to ehich index do you want to rotate? while in approach 1 k is the number of element means how many element do you want to rotate
        HomeworkOfClass24.RotateArrayByk_approach_2(nums, nums.length, 3);
        printArr(nums);


    }    
}
class HomeworkOfClass24{
    public static void subtracionArr(int[]first,int[]second) {
        int [] result = new int[first.length>second.length?first.length:second.length];
        int i = first.length-1;
        int j = second.length-1;
        int k = result.length-1;
        // int borrow = 0;
        int diff = 0;
        while (k>=0) {
            if (i>j ) {
                if (i>=0 &&j>=0) {
                    if (first[i]>=second[j]) {
                        diff = first[i]-second[j];
                    }
                    else{
                        diff = 10 + first[i] - second [j];
                        first[i-1]--;
                    }
                }
                else{
                    diff = first[i];
                }
            }
            else{

                if (i>=0 &&j>=0) {
                    if (second[j]>=first[i]) {
                        diff = second[j]-first[i];
                    }
                    else{

                        diff = 10 + second [j] - first[i];
                        second[j-1]--;
                    }
                }
                else{
                    diff = second[j];
                }
            }
            result[k] = diff;
            i--;
            j--;
            k--;
        }
        Class24.printArr(result);
    }
    public static void reversePartArr(int[]arr,int start,int end) {
        for (int i = start , j = end ; i <=(end-start+1)/2 && j>=(end-start+1)/2; i++,j--) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void RotateArrayByk_approach_1 (int[]arr,int n,int k) {
        for (int i = 0; i < k; i++) {
            Class24.rotate(arr, n);
        }
    }
    // Optimize approach
    public static void RotateArrayByk_approach_2(int []arr,int n,int k) {
        reversePartArr(arr, 0, n-k-1);
        reversePartArr(arr,  n-k , n-1);
        reversePartArr(arr, 0, n-1);   
    }
}