import java.util.ArrayList;

public class Class15 {
    public static void main(String[] args) {
        // System.out.println(dicePos(0, 100));  
        System.out.println(playerInMaze(0, 0, 2, 2));
    }
    static ArrayList<String>dicePos(int source,int target){
        if(source==target){
            ArrayList<String> per = new ArrayList<>();
            per.add("");
            return per;
        }
        if (source>target) {
            ArrayList<String> per = new ArrayList<>();
            return per;
        }
        ArrayList<String> finalResult = new ArrayList<>();
        for (int dice = 1; dice <=6; dice++) {
            int currentValue = dice+source;
            ArrayList<String> per = dicePos(currentValue, target);
            for (String temp : per) {
                finalResult.add(temp+dice);
            }
        }
        return finalResult;
    }
    static ArrayList<String> playerInMaze(int row,int col,int endRow,int endcol){
        if(row>endRow){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        if (col>endcol) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        if (row==endRow && col==endcol) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        ArrayList<String> finalResult = new ArrayList<>();
        // For Down Step
        ArrayList<String> list = playerInMaze(row+1, col, endRow, endcol);
        for (String temp : list) {
            finalResult.add(temp+"D");
        }
        // For Right Step
        list = playerInMaze(row, col+1, endRow, endcol);
        for (String temp : list) {
            finalResult.add(temp+"R");
        }
        // For DIagonal Step
        list = playerInMaze(row+1, col+1, endRow, endcol);
        for (String temp : list) {
            finalResult.add(temp+"g");
        }
        return finalResult;
    }
}
class HomeworkOfClass15{
    // Question :- Find the ways of climbing a stair of n step where person can take 1 or 2 step at a time
    public static int leetcode70(int n) {
        // Recursive Solution
        // if(n==2||n==3){
        //     return n;
        // }
        // if(n==0){
        //     return 1;
        // }
        // if(n<0){
        //     return 0;
        // }
        // return climbStairs(n-1)+climbStairs(n-2);
        // iterative Solution Accepted by leet code
        int x = 1,m=1;
        for(int i=2;i<=n;i++){
            int temp = x;
            x +=m;
            m=temp;
        }
        return x;
    }
    // Question:- Find nth Fibonacci number 
    public static int leetcode509(int n) {
        if(n==0||n==1){
            return n;
        }
        if(n<0){
            return 0;
        }
        return leetcode509(n-1)+leetcode509(n-2);
    }
    public static void subSeq(String str,int index,String newStr) {
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }
        subSeq(str, index+1, newStr);  
        subSeq(str, index+1, newStr+str.charAt(index));  
    }
    public static void permutation(String str,String reqStr) {
        if (str.length()==0) {
            System.out.println(reqStr);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            permutation(newStr, reqStr+curr);
        }
    }
}