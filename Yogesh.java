import java.util.ArrayList;
import java.util.Scanner;
public class Yogesh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfElementOfArray = sc.nextInt();
        int arr [] = new  int [numOfElementOfArray];
        for(int i=0;i<numOfElementOfArray;i++){
            arr[i] = sc.nextInt();
        }
        int number = sc.nextInt();
        int sum =0;
        int index[] = new int[numOfElementOfArray];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    sum += arr[k];
                }
                
            }
        }
    }
}
