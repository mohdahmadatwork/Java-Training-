import java.util.ArrayList;
import java.util.List;
public class Class16 {
    public static void main(String[] args) {
        System.out.println(countNumberOfWays(0));
    }
    static int n = 8;
    static boolean board [][] = new boolean[n][n]; 
    public static int countNumberOfWays(int row) {
        int count =0;
        if (row==board.length) {
            return 1;
        }
        for (int col = 0; col < board.length; col++) {
            if(canWePlaceQueen(row,col)){
                board[row][col] = true;
                count = count + countNumberOfWays(row+1);
                board[row][col]=false;
            }
        }
        return count;
    }
    public static boolean canWePlaceQueen(int row,int col) {
        for (int i = row; i >=0; i--) {
            if (board[i][col]) {
                return false;
            }
        }
        for (int i = row,j=col; i >=0 && j>=0; i--,j--) {
            if (board[i][j]) {
                return false;
            }
        }
        for (int i = row,j=col; i >=0 && j<board.length; i--,j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;

    }
}
class HomeworkOfClass16{
    public static void solveNQueens(int n) {
        ArrayList<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String temp = "";
            for (int j = 0; j < n; j++) {
                temp+=".";
            }
            board.add(temp);
        }
        // System.out.println(board);
        List<List<String>> finalResult = nQueens(board, 0, n);
        System.out.println(finalResult);
    }

    public static List<List<String>> nQueens(ArrayList<String> board,int row,int n) {
        List<List<String>> finalResult = new ArrayList<>();
        if(row==n){
            ArrayList<String> ArrList2= (ArrayList<String>)board.clone();
            finalResult.add(ArrList2);
            return finalResult;
        }
        for (int i = 0; i < n; i++) {
            if(isSafe(board, row, i,n)){
                String temp = board.get(row).substring(0,i)+"Q"+board.get(row).substring(i+1);
                board.set(row,temp);
                List<List<String>> finalResult1= nQueens(board, row+1,n);
                for (int j = 0; j < finalResult1.size(); j++) {
                    finalResult.add(finalResult1.get(i));
                }
                board.set(row,board.get(row).substring(0,i)+"."+board.get(row).substring(i+1));
                // board[row][i] = 'X';
            }
        }
        return finalResult;
    }
    public static boolean isSafe(ArrayList<String> board,int row,int col,int n) {
        // Vertical up
        for (int i=row-1; i >=0; i--) {
            // [i][col]
            if (board.get(i).charAt(col)=='Q') {
                return false;
            }
        }
        // right diagonal
        for (int i=row-1, j = col+1; i >=0 && j <n; i--,j++) {
            // for (; ; ) {
                // [i][j]
            if (board.get(i).charAt(j)=='Q') {
                return false;
            }
        }
        // left Diagonal
        for (int i=row-1,j = col-1; i >=0 && j >= 0; i--,j--) {
            // [i][j]
            if (board.get(i).charAt(j)=='Q') {
                return false;
            }
        }

        return true;
        
    }
}
