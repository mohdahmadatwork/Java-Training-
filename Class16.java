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
