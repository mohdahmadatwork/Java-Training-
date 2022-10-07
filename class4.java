import java.util.Scanner;

public class class4 {
    public static void main(String[] args) {
        // String name = "Amit";
        // name is a reference variable
        // String name2 = name; //Ref copy
        // int x=20;
        // int y = x;//value copy
        // y++;//Change in copy
        //String is an example of reference type
        // String is a java class
        //String has special behavior
        String a = "Amit";//String literal(1 or 0 obj)
        String b = "Amit";
        System.out.println(a==b);
        String c = new String("Amit");
        System.out.println(a==c);
        // String d = new String("ram");//Will create 2 objects one in pool one in outside
        //new is keyword used to allocate a memoru dynamically
        //new keyword will create new string outside the pool
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println(HomeworkOfClass4.Case(str)); 
        System.out.println("Enter the Email: ");
        String str2 = sc.nextLine();
        sc.close();
        if(HomeworkOfClass4.CheckEmailValidity(str2)){
            System.out.println(str +" is  a Valid Email.");
        }
        else
        System.out.println(str +" is not a Valid Email.");
    } 
}
class HomeworkOfClass4{
public static String Case(String str) {
    String words[] = str.split("\\s"); 
    String  newstr = "";
    for(String W:words){
        String firstWord = W.substring(0,1);
        String afterWord = W.substring(1);
        newstr += firstWord.toUpperCase()+afterWord.toLowerCase()+" ";
    } 
    return newstr;
}

public static Boolean CheckEmailValidity(String str) {
    Boolean rtr=false;
    int count = 0;
    for(int i=0;i<str.length();i++){
        
        if(str.substring(i,i+1)=="@"){
            rtr = true;
            count+=1;
        }
        if(count>1){
            return rtr = false;
        }
    }
    if(str.substring(str.length()-4)!=".com")
    rtr=false;
    return rtr;
}
}
