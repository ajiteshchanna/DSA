package Matrix;

public class SpiralMatrix {

    // Function to print matrix normally
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
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        printMatrix(matrix);

        System.out.println("Spiral Order:");
        printSpiralMatrix(matrix);
    }


    public static void printSpiralMatrix(int matrix[][]){

        int rows = matrix.length;
        int columns = matrix[0].length;

        // boundaries of current layer
        int startRow = 0;
        int endRow = rows - 1;
        int startColumn = 0;
        int endColumn = columns - 1;

        // continue until boundaries cross
        while(startRow <= endRow && startColumn <= endColumn){

            // 1️⃣ Print top row (left → right)
            for(int i = startColumn; i <= endColumn; i++){
                System.out.print(matrix[startRow][i] + " ");
            }

            // 2️⃣ Print right column (top → bottom)
            for(int i = startRow + 1; i <= endRow; i++){
                System.out.print(matrix[i][endColumn] + " ");
            }

            // 3️⃣ Print bottom row (right → left)
            if(startRow != endRow){   // avoid duplicate row
                for(int i = endColumn - 1; i >= startColumn; i--){
                    System.out.print(matrix[endRow][i] + " ");
                }
            }

            // 4️⃣ Print left column (bottom → top)
            if(startColumn != endColumn){ // avoid duplicate column
                for(int i = endRow - 1; i > startRow; i--){
                    System.out.print(matrix[i][startColumn] + " ");
                }
            }

            // move boundaries inward for next layer
            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
        }
    }
}