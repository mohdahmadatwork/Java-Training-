public class Class10 {
    public static void main(String[] args) {
        System.out.println(reverseStr("Hello World"));
        System.out.println(fib(6));
        fun(0);
        int[] arr = {1,2,3,7,5,6};
        System.out.println(HomeworkOfClass10.isArrSorted(arr, 0));
        // Printing pattern 1 by method 1
        System.out.println("Printing pattern 1 by method 1: ");
        HomeworkOfClass10.pattern1("*****");
        // Printing pattern 1 by method 2
        System.out.println("Printing pattern 1 by method 2:");
        HomeworkOfClass10.pattern1(5);
        // Printing pattern 1 by method 3
        System.out.println("Printing pattern 1 by method 3:");
        HomeworkOfClass10.pattern1(5, 1);
        
        // Printing pattern 2 by method 1
        System.out.println("Printing pattern 2 by method 1:");
        HomeworkOfClass10.pattern2("*****");
        // Printing pattern 2 by method 2
        System.out.println("Printing pattern 2 by method 2:");
        HomeworkOfClass10.pattern2(5);
        // Printing pattern 2 by method 3
        System.out.println("Printing pattern 2 by method 3:");
        HomeworkOfClass10.pattern2(5, 1);

        // printing Pattern 3
        System.out.println("printing Pattern 3: ");
        HomeworkOfClass10.pattern3(5, 1, 1);
        
        
    }

    public static String reverseStr(String str) {
        if(str.length()==1){
            return str;
        }
        return reverseStr(str.substring(1))+str.charAt(0);
    }

    public static int fib(int n) {
        if(n==0 || n==1){
            return n;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void fun(int n) {
        System.out.println(n);
        if(n>=3){
            return;
        }
        fun(n+1);
        fun(n+2);
    }
}
class HomeworkOfClass10{
    public static boolean isArrSorted(int[]arr,int idx) {
        if(idx==arr.length-2){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }
        return isArrSorted(arr, idx+1);
    }
    // Pattern 1
    // *
    // **
    // ***
    // ****
    // *****
    // ******** Method 1 ********
    public static void pattern1(String str) {
        if(str.length()==0){
            return;
        }
        pattern1(str.substring(1));
        System.out.println(str);
    }
    // ******** Method 2 by head recursion *********
    // Func for row printing
    public static void rowpattern1(int column) {
        if(column==0){
            return;
        }
        rowpattern1(column-1);
        System.out.print("*");
    }
    //Func for pattern printing
    public static void pattern1(int n) {
        if (n==0) {
            return;
        }
        pattern1(n-1);
        System.out.println();
        rowpattern1(n);
    }
    // ******** Method 3 by tail recursion ********
    public static void print_row_p1(int row,int column) {
        if(row<column){
            return;
        }
        System.out.print("*");
        print_row_p1(row, column+1);
    }
    public static void pattern1(int n,int i) {
        if(i==n){
            return;
        }
        print_row_p1(i,1);
        System.out.println();
        pattern1(n, i+1);
    }
    // Pattern 2
    // *****
    // ****
    // ***
    // **
    // *
    // ******** Method 1 ********
    public static void pattern2(String str) {
        if(str.length()==0){
            return;
        }
        System.out.println(str);
        pattern2(str.substring(1));
    }
    // ******** Method 2 by tail recursion*********
    // Func for row printing
    public static void rowpattern2(int column) {
        if(column==0){
            return;
        }
        System.out.print("*");
        rowpattern2(column-1);
    }
    //Func for pattern printing
    public static void pattern2(int n) {
        if (n==0) {
            return;
        }
        rowpattern2(n);
        System.out.println();
        pattern2(n-1);
    }
    // ******** Method 3 by head Recursion********
    public static void print_row_p2(int row,int column) {
        if(row<column){
            return;
        }
        System.out.print("*");
        print_row_p1(row, column+1);
    }
    public static void pattern2(int n,int i) {
        if(i>n){
            return;
        }
        print_row_p2(n,i);
        System.out.println();
        pattern2(n, i+1);
    }
    //Pattern 3 
    // 1
    // 2 3
    // 4 5 6 
    // 7 8 9 10 
    // For row printing 
    public static int  rowpattern3(int count_column,int count_row,int i) {
        if(count_column>count_row){
            return i;
        }
        System.out.print(i);
        return rowpattern3(count_column+1, count_row, i+1);
    }
    public static void pattern3(int n,int count,int i) {
        if(count==n){
            return;
        }
        i=rowpattern3(1, count,i);
        System.out.println();
        pattern3(n, count+1, i);

    }
}