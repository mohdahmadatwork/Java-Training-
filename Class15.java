import java.util.ArrayList;

public class Class15 {
    public static void main(String[] args) {
        // System.out.println(dicePos(0, 100));  
        System.out.println(playerInMaze(0, 0, 2, 2));
    }
    static ArrayList<String>dicePos(int source,int target){
        if(source==target){
            ArrayList<String> per = new ArrayList<>();
            per.add("");
            return per;
        }
        if (source>target) {
            ArrayList<String> per = new ArrayList<>();
            return per;
        }
        ArrayList<String> finalResult = new ArrayList<>();
        for (int dice = 1; dice <=6; dice++) {
            int currentValue = dice+source;
            ArrayList<String> per = dicePos(currentValue, target);
            for (String temp : per) {
                finalResult.add(temp+dice);
            }
        }
        return finalResult;
    }
    static ArrayList<String> playerInMaze(int row,int col,int endRow,int endcol){
        if(row>endRow){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        if (col>endcol) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        if (row==endRow && col==endcol) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        ArrayList<String> finalResult = new ArrayList<>();
        // For Down Step
        ArrayList<String> list = playerInMaze(row+1, col, endRow, endcol);
        for (String temp : list) {
            finalResult.add(temp+"D");
        }
        // For Right Step
        list = playerInMaze(row, col+1, endRow, endcol);
        for (String temp : list) {
            finalResult.add(temp+"R");
        }
        // For DIagonal Step
        list = playerInMaze(row+1, col+1, endRow, endcol);
        for (String temp : list) {
            finalResult.add(temp+"g");
        }
        return finalResult;
    }
}
