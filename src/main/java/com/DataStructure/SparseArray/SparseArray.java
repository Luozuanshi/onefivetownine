package src.main.java.com.DataStructure.SparseArray;

public class SparseArray {
    public static void main(String[] args){


        //首先输出一个二维数组
        int[][] chessArr = new int[11][11];

        chessArr[3][4] = 1;
        chessArr[4][5] = 2;

        for (int[] row: chessArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }


/*      //二维数组转稀疏数组
        1.遍历原始的二维数组，得到有效数据的个数sum
        2.根据sum可以创建稀疏数组sparseArr int[sum+1][3];
        3.将二维数组的有效数据存入稀疏数组
*/      int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(chessArr[i][j] != 0){
                    sum++;
                }
            }
        }
        System.out.println(sum);

        int[][] sparseArr = new int[sum+1][3];

        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;

        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(chessArr[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr[i][j];
                }
            }
        }

        for (int[] row: sparseArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        //稀疏数组转原始的二维数组的思路
        /*
        1.先读取稀疏数组的第一行，根据第一行的行数吗，创建原始的二维数组，比如上面的chessArr[11][11];
        2.在读取稀疏数组的后面几行数据，并且赋值给原始的二维数组
         */
        int row = sparseArr[0][0];
        int column = sparseArr[0][1] ;
        int[][] restoreArr = new int[row][column];
        System.out.println(sparseArr.length);
        for (int i = 1; i < sparseArr.length; i++) {
                int rows = sparseArr[i][0];
                int colum = sparseArr[i][1];
                restoreArr[rows][colum]= sparseArr[i][2];
        }

        for (int[] rows: restoreArr) {
            for (int data : rows) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
    }
}
