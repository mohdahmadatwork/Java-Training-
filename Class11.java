public class Class11 {
    public static void print_Space_p4(int i) {
        if(i<=0){
            return;
        }
        System.out.print(" ");
        print_Space_p4(i-1);
    }
    public static void print_Row_P4(int i) {
        if(i<=0){
            return;
        }
        print_Row_P4(i-1);
        System.out.print("* ");
    }
    public static void pattern4(int n,int copy) {
        if(n<=0){
            return;
        }
        pattern4(n-1,copy);
        print_Space_p4(copy-n);
        print_Row_P4(n);
        System.out.println();
    }
    // Armstrong Number
    public static int armstrongNumber(int number,int count) {
        if(number<=0){
            return 0;
        }
        int digit = number % 10;
        return (int)Math.pow(digit, count) + armstrongNumber(number/10, count);
    }
    public static int count(int num) {
        if (num<=0) {
            return 0;
        }
        return 1+count(num/10);
    }
    public static void print_Armstrong(int num) {
        if(num<=0){
            return;
        }
        print_Armstrong(num-1);
        if (num==armstrongNumber(num, count(num))){
            System.out.print(num+" ");
        }
    }
    // Prime Number
    public static boolean isPrime(int num,int sqrtofnum) {
        if(num%sqrtofnum==0 && num>3){
            return false;
        }
        if(sqrtofnum<=2){
            return true;
        }
        return isPrime(num, sqrtofnum-1);
    }
    // Prime Sieve Method
    public static boolean isPrime2(int num,int sqrtofnum,int copy) {
        if ((num%2==0 || num%3==0) && num>3 ) {
            return false;
        }
        if (sqrtofnum>=copy) {
            return true;
        }
        if (num % sqrtofnum ==0 || num%(sqrtofnum+2) == 0) {
            return false;
        }
        return isPrime(num, sqrtofnum+6);

    }
    public static void print_prime(int num) {
        if(num<=1){
            return;
        }
        print_prime(num-1);
        // if (isPrime(num, (int)Math.sqrt(num))) {
        //     System.out.print(num+" ");
        // }
        if (isPrime2(num,2,(int)Math.sqrt(num))) {
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        pattern4(10, 10);
        int n = 153;
        System.out.println(count(n));
        if (n == armstrongNumber(122, 3)){
            System.out.println("true");
        }
        else{
            System.out.println("false");

        }
        print_Armstrong(500);
        System.out.println();
        print_prime(100);
        System.out.println();
        HomeworkOfClass11.pattern1(5);
        HomeworkOfClass11.pattern2(5, 1, 65);
    }


}

class HomeworkOfClass11{
    // Pattern 1
    // a
    // ab
    // abc
    // abcd
    // abcde
    public static void print_row_p1(int n) {
        if(n<97){
            return;
        }
        print_row_p1(n-1);
        System.out.print((char)n);
    }
    public static void pattern1(int n) {
        if(n<0){
            return;
        }
        pattern1(n-1);
        print_row_p1(97+n);
        System.out.println();
    }
    // pattern2
    // A 
    // BC 
    // DEF 
    // GHIJ
    // KLMNO
    public static int print_row_p2(int row,int i) {
        if(row<=0){
            return i;
        }
        System.out.print((char)i+" ");
        return print_row_p2(row-1,i+1);
    }
    public static void pattern2(int row,int current_row,int i) {
        if(row<current_row){
            return;
        }
        i=print_row_p2(current_row,i);
        System.out.println();
        pattern2(row, current_row+1, i);
    }
}