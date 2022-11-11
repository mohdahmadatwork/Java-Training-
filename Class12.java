import java.util.ArrayList;
import java.util.HashMap;
public class Class12 {
    public static void main(String[] args) {
        String str = "ram kumar";
        // Iterative Sol
        // HashMap< Character , Integer > map = new HashMap<>(); 
        // for (int i = 0; i < str.length(); i++) {
        //     char singleChar = str.charAt(i);
        //     if (map.get(singleChar)==null) {
        //         map.put(singleChar, 1);
        //     } else{
        //         int count = map.get(singleChar);
        //         map.put(singleChar, count+1);
        //     }
        // }
        HashMap< Character , Integer > map = fr(str, 0, str.length());
        System.out.println(map);
        int[] arr = {1,2,8,2,9,2,7,2};
        ArrayList <Integer> reqArr = search(arr, 0, arr.length,2);
        System.out.println(reqArr);
        int[] newArr = search1(arr, 0, arr.length, 2);
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i]==0) {
                continue;
            }
            System.out.print(newArr[i]+" ");
        }
    }
    // Recursive sol of :- 
    // Find the frequency of Every charecter of String
    static HashMap< Character , Integer >
    fr(String str,int index,int len) {
        if(len<=index){
            HashMap< Character , Integer > map = new HashMap<>();
            return map;
        }
        HashMap< Character , Integer > map = fr(str, index+1, len);
        char singleChar = str.charAt(index);
        if (map.get(singleChar)==null) {
            map.put(singleChar, 1);
        } else{
            int count = map.get(singleChar);
            map.put(singleChar, count+1);
        }
        return map;
    }
    // Problem 2
    // sol with Array list
    static ArrayList <Integer> search(int arr[],int index,int length,int element){
        if(index>=length){
            ArrayList <Integer> reqArr = new ArrayList<>();
            return reqArr;
        }
        ArrayList <Integer> reqArr = search(arr, index+1, length,element);
        if(arr[index]==element){
            reqArr.add(index);
        }
        return reqArr;
    }
    // sol with integer array
    static int[] search1(int arr[],int index,int length,int element){
        if (index>=length) {
            int[] newArr = new int[length];
            return newArr;
        }
        int[] newArr = search1(arr, index+1, length, element);
        if(arr[index]==element){
            newArr[index] = index;
        }
        return newArr;
    }
}
