/**
 * Date:- 07/10/2020
 */
public class class5 {
    public static void main(String[] args) {
        // StringBuffer is a legacy
        StringBuffer sb = new StringBuffer("Hello ");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("How are you I am fine mndjnsjdhjsdbhvbfhvbbdfhvbfjhvjdfhbvjfbvbjfbfbvjhbvhbvjhbdjbhfbhbfjhbherbkfk");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("Hiiii How are you I am fine mndjnsjdhjsdbhvbfhvbbdfhvbfjhvjdfhbvjfbvbjfbfbvjhbvhbvjhbdjbhfbhbfjhbherbkfk");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        // StringBuilder is a new version of StringBuffer
        StringBuilder sb1 = new StringBuilder("Hello again");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        // Problem.countDigit();
        Problem.printDigitsFromLast();
        Problem.printDigitsFromStart();
    }
    
}
/**
 * Count the Digit
 */
class Problem {
public static int countDigit(int num) {
    int count =0;
    // int num = 3456;
    while(num!=0){
        num/=10;
        count++;
    }
    return count;
    // System.out.println(count);
}
    public static void printDigitsFromLast() {
        int num = 78654;
        while(num>0){
            num/=10;
            System.out.println(num%10);
        }
    }

    public static void printDigitsFromStart() {
        int num = 1234;
        int copy = num;
        // Step 1 - Count the digit
        int count = countDigit(num);
        int divisor = 1;
        // Step 2 - Compute Power
        while(count>1){
            divisor *=10;
            count--;
        }
        //Step 3 - Print the digits from start of Number
        while(copy>0){
            System.out.println(copy/divisor);
            copy=copy%divisor;
            divisor=divisor/10;
        }
    }
}
