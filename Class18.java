import java.util.ArrayList;
import java.util.List;

public class Class18 {
    public static void main(String[] args) {
        System.out.println(WellFormParentheses.generate(3));
    }
    

}
class WellFormParentheses{
    public static List<String> generate(int n) {
        List<String> output = new ArrayList<>();
        helper(output,"",0,0,n);
        return output;
    }
    public static void helper(List<String> ans,String currentBracket,int open,int close,int max) {
        if(currentBracket.length()==max*2){
            ans.add(currentBracket);
            return;
        }
        if (open<max) {
            helper(ans, currentBracket+"(", open+1, close, max);
        }
        if (close<open) {
            helper(ans, currentBracket+")", open, close+1, max);
        }
    }
}
class WordSearch{
    static char board[][]={
        {'A','B','C','E'},
        {'S','F','C','S'},
        {'A','D','E','F'},
    };
    static boolean isValid = false;
    public static boolean isPresent(int row,int col,String word) {
        // word matched
        if(word.length()==0){
            return true;
        }
        if(row<0 || col<0 || row==board.length || col==board[0].length || board[row][col]!=word.charAt(0)){

        }
        int directions[][]={
            {0,1},//right
            {1,0},//down
            {0,-1},//left
            {-1,0}//top
        };
        for (int direction = 0; direction < directions.length; direction++) {
            int rowDirection = directions[direction][0];
            int colDirection = directions[direction][1];
            isPresent(row+rowDirection, col+colDirection, word.substring(1));
        }
        return isValid;
    }
}
