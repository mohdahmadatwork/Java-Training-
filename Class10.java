public class Class10 {
    public static void main(String[] args) {
        System.out.println(reverseStr("Hello World"));
        System.out.println(fib(6));
        fun(0);
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
