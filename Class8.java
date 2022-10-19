/**
 * Date :- 19/10/2022
 */
public class Class8 {
    public static boolean isPrimemethod1(int num) {
        boolean isPrime = true;
        int itrr = 0;
        for (int i = 2; i < num; i++) {
            itrr++;
            if (num % i ==0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(itrr);
        return isPrime; 
    }
    public static boolean isPrimemethod2(int num) {
        boolean isPrime = true;
        int itrr = 0;
        for (int i = 2; i < num/2; i++) {
            itrr++;
            if (num % i ==0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(itrr);
        return isPrime; 
    }
    public static boolean isPrimemethod3(int num) {
        boolean isPrime = true;
        int itrr = 0;
        for (int i = 2; i*i < num/2; i++) {
            itrr++;
            if (num % i ==0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(itrr);
        return isPrime; 
    }

    // Prime Sieve Method
    public static boolean isPrimemethod4(int num) {
        boolean isPrime = true;
        int itrr = 0;
        if (num%2==0 || num%3==0) {
            return isPrime=false;
        }
        for (int i = 5; i*i < num/2; i+=6) {
            itrr++;
            if (num % i ==0 || num%(i+2) == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(itrr);
        return isPrime; 
    }

    //Function for counting Digit 
    public static void countDigit(int num) {
        int countdigit =0,copy=num;
        while (num!=0) {
            countdigit++;
            num/=10;
        }
        System.out.println("Number of Zeroes in "+copy+" is "+countdigit);
    }

    //Function for counting Zeroes
    public static void countZeroes(int num) {
        int countzeroes =0,copy=num;
        while (num!=0) {
            if(num%10==0){
                countzeroes++;
            }
            num/=10;
        }
        System.out.println("Number of Zeroes in "+copy+" is "+countzeroes);
    }

    // Function for reversing a number
    public static void reverseNumber(int num) {
        int copy=num,remainder,sum=0;
        while (num!=0) {
            remainder = num %10;
            sum=sum*10+remainder;
            num/=10;
        }
        System.out.println("Reverse of "+copy+" is "+sum);
    }

    // Function for finding GCD and LCM
    public static void GCDandLCM(int num1,int num2) {
        int greater=num1,smaller=num2;
        // Extra Code no requirement to do this  
        // if(num1>num2){
        //     greater=num1;
        //     smaller=num2;
        // }
        // else{
        //     smaller=num1;
        //     greater = num2;
        // }
        int remainder =1;
        while(remainder!=0){
            remainder = greater%smaller;
            greater = smaller;
            if (remainder!=0) {
                smaller=remainder;
            }
        }
        int LCM = (num1*num2)/smaller;
        System.out.println("HCF of "+num1 +" and "+num2+" "+smaller);
        System.out.println("LCM of "+num1 +" and "+num2+" "+LCM);
    }

    // Method 2 (Optimized Form) for finding for GCD and LCM
    public static void GCDandLCMmethod2(int num1,int num2) {
        int greater=num1,smaller=num2;
        
        while(greater-smaller!=0){
            if(greater>=smaller){
                greater=greater-smaller;
            }
            else{
                smaller = smaller - greater;
            }    
        }
        int LCM = (num1*num2)/greater;
        System.out.println("HCF of "+num1 +" and "+num2+" "+greater);
        System.out.println("LCM of "+num1 +" and "+num2+" "+LCM);
    }
    public static void main(String[] args) {
        int num = 100000007;
        System.out.println(isPrimemethod1(num));
        System.out.println(isPrimemethod2(num));
        System.out.println(isPrimemethod3(num));
        System.out.println(isPrimemethod4(num));
        countZeroes(10200500);
        reverseNumber(num);
        GCDandLCM(10, 7);
        GCDandLCMmethod2(10, 7);
    }
    
}