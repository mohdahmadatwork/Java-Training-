public class class4 {
    public static void main(String[] args) {
        String name = "Amit";
        // name is a reference variable
        String name2 = name; //Ref copy
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

    } 
}    //iobhb
