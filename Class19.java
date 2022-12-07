import java.util.ArrayList;

public class Class19 {
    public static void main(String[] args) {
        int [][] maze ={
            {1,1,1,1},
            {1,1,0,1},
            {0,1,1,1},
            {0,1,1,1},
        };
        System.out.println(RatInMaze.getCount(maze, 0, 0));
        System.out.println(MazeCount.count(0,0,2,2));
    }
    
}
class RatInMaze{
    public static int getCount(int [][] maze,int row,int col) {
        if(row==maze.length-1&&col==maze.length-1){
            return 1;
        }
        if(row>maze.length -1||col >maze.length-1 || maze[row][col] ==0 ){
            return 0;
        }
        return getCount(maze, row, col+1)+getCount(maze, row+1, col);
    }
}
class MazeCount{
    static int count(int row,int col,int endRow,int endcol){
        if(row>endRow){
            return 0;
        }
        if (col>endcol) {
            return 0;
        }
        if (row==endRow && col==endcol) {
            return 1;
        }
        return count(row+1, col, endRow, endcol)+count(row, col+1, endRow, endcol);
    }
}

