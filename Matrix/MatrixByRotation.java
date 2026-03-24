package Matrix;

public class MatrixByRotation {

    public static void main(String[] args) {

        int A[][] = {
            {0,1},
            {1,0}
        };

        int B[][] = {
            {1,0},
            {0,1}
        };

        System.out.println(findRotation(A, B));
    }

    // Function to rotate matrix 90 degree clockwise
    public static void rotate(int[][] mat){

        int n = mat.length;

        // Step 1: Transpose
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for(int i = 0; i < n; i++){
            int left = 0, right = n - 1;

            while(left < right){
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    // Function to check if two matrices are equal
    public static boolean isEqual(int[][] mat, int[][] target){

        int n = mat.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }

        return true;
    }

    // Main function
    public static boolean findRotation(int[][] mat, int[][] target){

        // Try 4 rotations (0°, 90°, 180°, 270°)
        for(int i = 0; i < 4; i++){

            if(isEqual(mat, target)){
                return true;
            }

            rotate(mat);
        }

        return false;
    }
}