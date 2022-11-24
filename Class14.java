import java.util.ArrayList;

public class Class14 {
    public static void main(String[] args) {
        // fun(3);
        // subSeq("amit", 0, "");
        // System.out.println(subSeq("amit"));
        // HomeworkOfClass14.permutation("abc", "");
        System.out.println(HomeworkOfClass14.perm("abc"));
    }
    public static void fun(int num) {
        if(num<=0){
            return;
        }
        System.out.println(num);
        fun(num-1);
        fun(num-2);

    }
    // my Sol
    public static void subSeq(String str,int index,String newStr) {
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }
        subSeq(str, index+1, newStr);  
        subSeq(str, index+1, newStr+str.charAt(index));  
    }
    // Amit Sir Sol
    public static ArrayList<String> subSeq(String Str) {
        if(Str.length()==0){
            ArrayList<String> newStr = new ArrayList<>();
            newStr.add("");
            return newStr;
        }
        char singleChar = Str.charAt(0);
        String subString = Str.substring(1);
        ArrayList<String> newStr = subSeq(subString);
        ArrayList<String> reqStr = new ArrayList<>();
        for (int i = 0; i < newStr.size(); i++) {
            reqStr.add(newStr.get(i));
            reqStr.add(singleChar+newStr.get(i));
        }
        return reqStr;
    }
}
class HomeworkOfClass14{
    public static void permutation(String str,String reqStr) {
        if (str.length()==0) {
            System.out.println(reqStr);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            permutation(newStr, reqStr+curr);
        }
    }
    public static ArrayList<String> perm(String Str) {
        if(Str.length()==0){
            ArrayList<String> newStr = new ArrayList<>();
            newStr.add("");
            return newStr;
        }
        char singleChar = Str.charAt(0);
        String subString = Str.substring(1);
        ArrayList<String> newStr = perm(subString);
        ArrayList<String> reqStr = new ArrayList<>();
        for (int i = 0; i < newStr.size(); i++) {
            int len = newStr.get(i).length();
            for (int j = 0; j <=len; j++) {
                reqStr.add(newStr.get(i).substring(0,j)+singleChar+newStr.get(i).substring(j));
            }

        }
        return reqStr;
    }
}
