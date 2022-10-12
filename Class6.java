/*
 * Date :- 12/10/2022
*/
import java.io.IOException;
import java.util.Scanner;
public class Class6 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your Name");
        // System.in.read reads one char at a time
        int name = System.in.read();
        System.out.println("Name is : "+name);

        //Scanner is a buffer    
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        System.out.println("Name is : "+name1);
        
        int roll_number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your name :");
        //scanner name = scanner.next();
        String NAME = scanner.nextLine();
        System.out.println("Enter your age");
        byte age=scanner.nextByte();
        System.out.println("Roll no :" + roll_number);
        System.out.println("Name:"+ NAME);
        System.out.println("Age :"+ age);
        ifelsedemo.imp(scanner);
        scanner.close();

    }
}
class ifelsedemo {
    public static void imp(Scanner sc) {
        System.out.println("ENter your Age : ");
        int x= sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();
        if(x>y && x>z){
            System.out.println(x+"is greater");    
        }
        else if (y>z){
            System.out.println(y+"is greater");
        }
        else{
            System.out.println(z+"is greater");
        }

        if((x & 1) == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd number");
        }

    }
    
}
