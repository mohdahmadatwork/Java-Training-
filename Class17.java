import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class Class17 {
    static int [][] board = {{5,3,0,0,7,0,0,0,0},{6,0,0,1,9,5,0,0,0},{0,9,8,0,0,0,0,6,0},{8,0,0,0,6,0,0,0,3},{4,0,0,8,0,3,0,0,1},{7,0,0,0,2,0,0,0,6},{0,6,0,0,0,0,2,8,0},{0,0,0,4,1,9,0,0,5},{0,0,0,0,8,0,0,7,9}};
    public static void main(String[] args) {
        printBoard();
        System.out.println(HomeworkOfClass17.letterCombinations("23"));
    }
    public static void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean solveSudoku(int row,int col) {
        // if call reach to 9
        if (col==board.length) {
            row=row+1;
            col=0;
        }
        // row reach end
        if (row==board.length) {
            return true;
        }
        // Check cell is not empty then go to next cell 
        if(board[row][col]!=0){
            return solveSudoku(row, col+1);
        }
        // check if cell is empty
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(digit,row,col)) {
                board[row][col]=digit;
                if(solveSudoku(row, col+1)){
                    return true;
                }
                board[row][col]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(int digit,int row,int col) {
        // Checking Col
        for (int i = 0; i < board.length; i++) {
            if (board[i][col]==digit) {
                return false;
            }
        }
        // Checking Row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i]==digit) {
                return false;
            }
        }
        // Checking sub Grid
        int startRow = row-row%3;
        int startCol = col-col%3;
        for (int i = startRow; i < startRow+3; i++) {
            for (int j = startCol; j < startCol+3; j++) {
                if(board[i][j]==digit)
                return false;
            }
        }
        return true;
    }

}
class HomeworkOfClass17{
    public void solveSudoku(char[][] board) {
        solveSudoku(0,0,board);
    }
    public static boolean solveSudoku(int row,int col,char[][] board) {
        // if call reach to 9
        if (col==board.length) {
            row=row+1;
            col=0;
        }
        // row reach end
        if (row==board.length) {
            return true;
        }
        // Check cell is not empty then go to next cell 
        if(board[row][col]!='.'){
            return solveSudoku(row, col+1,board);
        }
        // check if cell is empty
        for (int digit = 49; digit <= 57; digit++) {
            if (isSafe(digit,row,col,board)) {
                board[row][col]=(char)(digit);
                if(solveSudoku(row, col+1,board)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }
    public static boolean isSafe(int digit,int row,int col,char[][] board) {
        // Checking Col
        for (int i = 0; i < board.length; i++) {
            if (board[i][col]==(char)(digit)) {
                return false;
            }
        }
        // Checking Row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i]==(char)(digit)) {
                return false;
            }
        }
        // Checking sub Grid
        int startRow = row-row%3;
        int startCol = col-col%3;
        for (int i = startRow; i < startRow+3; i++) {
            for (int j = startCol; j < startCol+3; j++) {
                if(board[i][j]==(char)(digit))
                return false;
            }
        }
        return true;
    }
    

    // Leet Code Q.17
    // Letter Combination of mobile phone
    public static List<String> letterCombinations(String digits) {
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"gfi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        return implement(digits);
    }
    static HashMap<Integer,String> map = new HashMap<>();
    public static ArrayList<String> implement(String digits){
        ArrayList<String> reqlist = new ArrayList<>();
        if(digits.length()==0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        int index = Integer.parseInt(digits.substring(0,1));
        ArrayList<String> reqlist1=implement(digits.substring(1));
        // System.out.println(reqlist1);
        ArrayList<String> reqlist2=implement1(map.get(index));
        // System.out.println(reqlist2);
        for(int k=0;k<reqlist2.size();k++){
            for(int j=0;j<reqlist1.size();j++){
                reqlist.add(reqlist2.get(k)+reqlist1.get(j));
            }
        }
        // System.out.println(reqlist);
        return reqlist;
    }
    public static ArrayList<String> implement1(String str){
        ArrayList<String> reqlist = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            reqlist.add(str.substring(i,i+1));
        }
        return reqlist;
    }

}