public class Class13 {
    public static void main(String[] args) {
        replace_pi("3+pi*1-5*pi+6", 0);  
        String str = "3+pi*1-5*pi+6";
        System.out.println(replace(str, 0));
        System.out.println(adjacentStar("abbaaba", 0));
        adjacentStar2("abbaaba", 0);
        System.out.println(output);
        if (checkPower(16)) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        if(homeworkOfClass13.check_power_3(27)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if(homeworkOfClass13.check_power_4(64)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if(homeworkOfClass13.check_power_n(64,4)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
    // --Problem 1:- Replace pi value with 3.14{
    //     i/p:- "3+pi*1-5*pi+6"
    //     o/p:- "3+3.14*1-5*3.14+6"
    // }
    // function completed by me
    // Problem with this sol is it will not going to change the str in main
    public static void replace_pi(String str,int index) {
        if(index==str.length()-1){
            System.out.println(str);
            return;
        }
        int nextIndex = index+1;
        if(str.charAt(index)=='p'){
            nextIndex++;
            str=str.substring(0, index)+"3.14"+str.substring(index+2);
        }
        replace_pi(str, nextIndex);
    }
    // Function By ravi sir
    public static String replace(String str,int i) {
        if(i==str.length()){
            return "";
        }
        if (str.charAt(i)=='p'&&str.charAt(i+1)=='i') {
            return "3.14"+replace(str, i+2);
        } else {
            return str.charAt(i)+replace(str, i+1);
        }
        
    }
    // --Problem 2 :- Adjacent starts{
    //     i/p :- abbaaba
    //     o/p :- ab*ba*aba
    // }
    public static String adjacentStar(String str,int index) {
        if(index==str.length()-1){
            return str.substring(index, index+1);
        }
        if (str.charAt(index)==str.charAt(index+1)) {
            return str.charAt(index)+"*"+adjacentStar(str, index+1);
        } else {
            return str.charAt(index)+adjacentStar(str, index+1);
        }
    }
    // ravi sir sol
    static String output="";
    public static void adjacentStar2(String str,int i) {
        output = output + str.charAt(i);
        if(i==str.length()-1){
            return;
        }
        if(str.charAt(i)==str.charAt(i+1)){
            output =output+ "*";
        }
        adjacentStar2(str, i+1);
    }
    // --Problem 2 :- Check if a number is of power of 2 or not{
    //     i/p :- 16
    //     o/p :- True
    // }
    public static boolean checkPower(int number) {
        if(number==1){
            return true;
        }
        if(number%2==0){
            return checkPower(number/2);
        }
        return false;
    }
}
class homeworkOfClass13{
    public static boolean check_power_3(int number) {
        if (number==1) {
            return true;
        }
        if (number%3==0) {
            return check_power_3(number/3);
        }
        return false;
    }
    public static boolean check_power_4(int number) {
        if (number==1) {
            return true;
        }
        if (number%4==0) {
            return check_power_4(number/4);
        }
        return false;
    }
    public static boolean check_power_n(int number,int n) {
        if(n==0){
            return false;
        }
        if (number==1) {
            return true;
        }
        if (number%n==0) {
            return check_power_n(number/n,n);
        }
        return false;
    }
    
}
