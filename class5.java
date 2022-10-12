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
        HomeworkOfClass5.luckyNumber();
        HomeworkOfClass5.armStrongNumber();
        HomeworkOfClass5.reverseANumer();
        HomeworkOfClass5.rotateNumber();
        HomeworkOfClass5.checkPrimeNumberBetween1ToN();
        HomeworkOfClass5.checkPrimeNumberBetween2ToN();
        HomeworkOfClass5.checkPrimeNumberBetween2ToHalfOfN();
        HomeworkOfClass5.checkPrimeNumberBetween2ToSqrtOfN();
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
            copy%=divisor;
            divisor/=10;
        }
    }
}

/**
 * HomeworkOfClass5
 */
class HomeworkOfClass5 {
    public static void luckyNumber() {
        int number = 412345678;
        int copy = number;
        int count = Problem.countDigit(number);
        int sum = 0;
        for(int i=count;i>0;i--){
                if(i%2==0){
                   sum +=copy%10;
                   copy /=10; 
                }
                else{
                copy /=10;     
                }
        }
        if (sum%9==0) {
            System.out.println("number is lucky");
            
        }
        else{
            System.out.println("not lucky");
        }
    }
    public static void armStrongNumber() {
        int num=54748;
        int copy =num;
        int cop2 =copy;
        int count=Problem.countDigit(num);
        int sum =0;
        while(copy>0){
            int remainder = copy %10;
            copy/=10;
            sum += Math.pow(remainder, count);  
        }
        if(sum==cop2){
            System.out.println("Armstrong Number");
        }
        else
        System.out.println("Not Armstrong Number");
    }

    public static void reverseANumer() {
        int num = 12345;
        int sum = 0 ;
        while (num>0) {
            sum = sum*10 + num%10;
            num/=10;
        }
        System.out.println("Reverse number : "+sum);
    }
    

    public static void rotateNumber() {
        int num = 12345;
        int count = Problem.countDigit(num); 
        int rt = -7;
        if(rt >= 0 ){
            while (rt>count) {
                rt -= count;
            }
            int divisor = (int) Math.pow(10, rt);
            int newnumber = num%divisor;
            num/=divisor;
            int copy = num;
            newnumber = newnumber*(int) Math.pow(10, Problem.countDigit(copy)) + num;
            System.out.println(newnumber);
        }
        else{
            rt = -rt;
            while (rt>count) {
                rt -= count;
            }
            int divisor = (int) Math.pow(10, count-rt);
            int newnumber = num/divisor;
            num%=divisor;
            newnumber = num*(int) Math.pow(10, Problem.countDigit(newnumber)) + newnumber;
            System.out.println(newnumber);
        }
        
    }

    public static void checkPrimeNumberBetween1ToN() {
        int num = 97;
        boolean isPrime = true;
        for(int i=1;i<=num;i++){
            if(i==1 || i==num )
            continue;
            else if(num%i==0){
                System.out.println("Not a prime number");
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Is a prime Number");
        }
    }

    public static void checkPrimeNumberBetween2ToN() {
        int num = 99;
        boolean isPrime = true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println("Not a prime number");
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Is a prime Number");
        }
    }

    public static void checkPrimeNumberBetween2ToHalfOfN() {
        int num = 36;
        boolean isPrime = true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                System.out.println("Not a prime number");
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Is a prime Number");
        }
    }

    public static void checkPrimeNumberBetween2ToSqrtOfN() {
        int num = 36;
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println("Not a prime number");
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Is a prime Number");
        }
    }
}