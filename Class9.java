public class Class9 {
    public static void main(String[] args) {
        // int num = 3,num2=4;
        // System.out.println(mul(num, num2));
        // print(num2);
        // print2(num2);
        // print3(num2);
        // print4(5);
        System.out.println(fact(5));
        
    }
    public static int add(int x,int y) {
        return x+y;
    }
    public static int sub(int x,int y) {
        add(x, y);
        return x-y;
    }
    public static int mul(int x,int y) {
        sub(x, y);
        return x*y;
    }
    // Tail Recursion
    public static void print(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    // Head Recursion
    public static void print2(int n) {
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
    // Tail Recursion
    public static void print3(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }
    public static void print4(int n) {
        if(n==1)
        {
            return;
        }
        if(n%2!=0)
        System.out.println(n);
        print4(n-1);
        if(n%2==0)
        System.out.println(n);
    }
    public static int fact(int n) {
        if(n==1 ){
            return n;
        }
        return n*fact(n-1);
    }
}
