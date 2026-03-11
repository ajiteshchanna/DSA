package Matrix;

public class DiagonalSum {

    public static void printMatrix(int matrix[][]){
        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        printMatrix(matrix);
        System.out.println(diagonalSumMatrix(matrix));
    }

    public static int diagonalSumMatrix(int matrix[][]){
        int dSum = 0;

        for(int i = 0;i<matrix.length;i++){
            if(i == matrix[0].length-1-i){
                dSum+=matrix[i][i];
            } else {
                dSum+=matrix[i][i];
                dSum+=matrix[i][matrix[0].length-1-i];
            }
        }

        
        return dSum;
    }
}
