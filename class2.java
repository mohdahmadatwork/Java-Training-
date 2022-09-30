// Making Calculator
public class class2 {

    public static void main(String[] args) {
        int fnum = Integer.parseInt(args[0]);
        int snum = Integer.parseInt(args[2]);
        String opr = args[1];
        int res =0;
        if (opr.equals("+")) {
            res = fnum + snum ;
        }
        else if (opr.equals("-")) {
            res = fnum - snum ;
        }
        else if (opr.equals("X")) {
            res = fnum * snum ;
        }
        else if (opr.equals("/")) {
            res = fnum / snum ;
        }
        System.out.println("Result :: " + res); 

        Addition.add(args);

       }
    
}

class Addition{
    public static void add(String[] args){
        int res = 0;
        
        // traditional Fold 
        for (int i = 0; i < args.length; i++) {
            res += Integer.parseInt(args[i]);
            
        }
        // Enhanced Fold
        for (String i : args) {
            res += Integer.parseInt(i);
        }
        System.out.println("Result is ::" + res);
    }
}
