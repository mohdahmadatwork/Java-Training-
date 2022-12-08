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
class HomeworkOfClass19{
      //Combination sum LeetCode 39
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> realoutput = new ArrayList<>();
        backTrackSol(candidates,target,0,"",0);
        for(int i=0;i<output.size();i++){
            realoutput.add(output.get(i));
        }
        output.clear();
        return realoutput;
    }
    static List<List<Integer>> output= new ArrayList<>();
public static void backTrackSol(int arr[],int element,int index,String reqArr,int sum) {
        if(sum>element){
            return;
        }
        if (element==sum) {
            // System.out.println(reqArr+" ")
            ArrayList<Integer> newArr=new ArrayList<>();
            String newreqArr [] =  reqArr.split(" ");
            // for (int i = 0; i < newreqArr.length; i++) {
            //     System.out.print(newreqArr[i]+" ");
            // }
            // System.out.println();
            for(int i=0;i<newreqArr.length;i++){
                int index1=Integer.parseInt(newreqArr[i], 10);
                newArr.add(arr[index1]);
            }
            output.add(newArr);
            return;
        }
        if (index>=arr.length) {
            return;
        }
        backTrackSol(arr, element, index, reqArr+index+" ", sum+arr[index]);
        //backTrackSol(arr,element,index+1,reqArr+index,sum+arr[index]);
        //backTrackSol(arr, element,index,reqArr,sum);
       backTrackSol(arr, element, index+1, reqArr, sum);
    }
}

