public class Class7 {
    public static void main(String[] args) {
        
        //*****
        //*****
        //*****
        //*****
        //*****
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //00000
        //11111
        //22222
        //33333
        //44444
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(i);
            }
            System.out.println();
        }

        // 01234
        // 01234
        // 01234
        // 01234
        // 01234
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        // Matrix of i and j
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(i+""+j+" ");
            }
            System.out.println();
        }

        // *
        // **
        // ***
        // ****
        // *****
        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 1
        // 12
        // 123
        // 1234
        // 12345
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }

        // *****
        // ****
        // ***
        // **
        // *
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 54321
        // 5432
        // 543
        // 54
        // 5
        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print(j);
            }
            System.out.println();
        }

        // 1
        // 23
        // 456
        // 78910
        int temp =0;
        for(int i=0;i<4;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(++temp);
            }
            System.out.println();
        }

        //      *
        //     **
        //    ***
        //   ****
        //  *****
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //      *
        //     * *
        //    * * *
        //   * * * *
        //  * * * * *
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //      *
        //     ***
        //    *****
        //   *******
        //  *********
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //  *********
        //   *******
        //    *****
        //     ***
        //      *

        //method 1
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*(5-i))-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // method 2
        for(int i=5;i>0;i--){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // *****
        // *   *
        // *   *
        // *   *
        // *****
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==0 || j==0 || i==4||j==4) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // *****
        // *   *
        // * * *
        // *   *
        // *****
        int row =9,col=9;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i==0 || j==0 || i==row-1 || j==col-1  || i==row/2 && j==col/2) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
    }
}
