package Matrix;

public class SpiralMatrix {

    public static void printMatrix(int matrix[][]){
        for(int r = 0;r<matrix.length;r++){
            for(int c = 0;c<matrix[0].length;c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        printMatrix(matrix);
        System.out.println();
        printSpiralMatrix(matrix);
    }

    public static void printSpiralMatrix(int matrix[][]){
        int rows = matrix.length;
        int columns = matrix[0].length;

        int startRow = 0;
        int endRow = rows-1;
        int startColumn = 0;
        int endColumn = columns-1;
        
        while(startRow<=endRow &&  startColumn<=endColumn){
            // top
            for(int i = startColumn;i<=endColumn;i++){
                System.out.print(matrix[startRow][i] + " ");
            }

            // right
            for(int i = startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endColumn] + " ");
            }

            // bottom
            for(int i = endColumn-1;i>=startColumn;i--){
                if(startRow == endRow){
                    return;
                }
                System.out.print(matrix[endRow][i] + " ");
            }

            // left
            for(int i = endRow-1;i>=startRow+1;i--){
                if(startColumn == endColumn){
                    return;
                }
                System.out.print(matrix[i][startColumn] + " ");
            }

            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
    }
}
