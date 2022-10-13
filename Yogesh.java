import java.util.ArrayList;
import java.util.Scanner;
public class Yogesh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number do you want to enter:");
        int numOfElementOfArray = sc.nextInt();
        System.out.println("Enter numbers of array:");
        int arr [] = new  int [numOfElementOfArray];
        for(int i=0;i<numOfElementOfArray;i++){
            arr[i] = sc.nextInt();
            // int tempIndex =i;
            // while (tempIndex>0 && arr[tempIndex]<arr[tempIndex-1]) {
            //     int tempVar = arr[tempIndex];
            //     arr[tempIndex] = arr[tempIndex-1];
            //     arr[tempIndex-1] = tempVar;
            //     tempIndex = tempIndex-1;
            // }
        }
        System.out.println("Enter number to match: ");
        int num = sc.nextInt();
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        int sum =0;
        for(int i=0;i<(arr.length/2)+1;i++){
            sum = arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum += arr[j];
                if(sum == num){
                    System.out.println(num+" matched on index "+i+" "+j);
                }
                sum = arr[i];
            }
        }
        sum =0;
        // int tempIndex;
        for(int i = 0;i<arr.length-2;i++){
            int temp2 = sum += arr[i];
            // System.out.println(i+" "+sum);
            for(int j=i+1;j<arr.length;j++){
                int temp = sum += arr[j];
                // System.out.println(i+" "+j+" "+sum);
                for(int k=j+1;k<arr.length;k++){
                    sum += arr[k];
                    // System.out.println(i+" "+j+" "+k+" "+sum);
                    if(sum == num){
                        System.out.println(num+" matched on index "+i+" "+j+" "+k);
                    }
                    sum = temp;
                }
                sum =temp2;
            }
            sum =0;
        }
        sum = 0; 
        for(int l=0;l<arr.length-3;l++){
            int temp3 = sum += arr[l];
            // System.out.println(l+" "+sum);
            for(int i = l+1;i<arr.length-2;i++){
                int temp2 = sum += arr[i];
                // System.out.println(l+" "+i+" "+sum);
                for(int j=i+1;j<arr.length;j++){
                    int temp = sum += arr[j];
                    // System.out.println(l+" "+i+" "+j+" "+sum);
                    for(int k=j+1;k<arr.length;k++){
                        sum += arr[k];
                        // System.out.println(l+" "+i+" "+j+" "+k+" "+sum);
                        if(sum == num){
                            System.out.println(num+" matched on index "+l+" "+i+" "+j+" "+k);
                        }
                        sum = temp;
                    }
                    sum =temp2;
                }
                sum =temp3;
            }
            sum =0;
        }
        sum =0;
        for(int m=0;m<arr.length-4;m++){
            int temp4 = sum += arr[m];
            for(int l=m+1;l<arr.length-3;l++){
                int temp3 = sum += arr[l];
                // System.out.println(l+" "+sum);
                for(int i = l+1;i<arr.length-2;i++){
                    int temp2 = sum += arr[i];
                    // System.out.println(l+" "+i+" "+sum);
                    for(int j=i+1;j<arr.length;j++){
                        int temp = sum += arr[j];
                        // System.out.println(l+" "+i+" "+j+" "+sum);
                        for(int k=j+1;k<arr.length;k++){
                            sum += arr[k];
                            // System.out.println(l+" "+i+" "+j+" "+k+" "+sum);
                            if(sum == num){
                                System.out.println(num+" matched on index "+m+" "+l+" "+i+" "+j+" "+k);
                            }
                            sum = temp;
                        }
                        sum =temp2;
                    }
                    sum =temp3;
                }
                sum =temp4;
            }
            sum =0;
        }  
    }
}
