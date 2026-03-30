package Matrix;

public class ProductMatrix {
    public static void main(String[] args) {
        int [][]grid = {{1,2},{3,4}};

    }

    public static int[][] constructProductMatrix(int grid[][]){
        int n = grid.length;
        int m = grid[0].length;
        int ans[][] = new int[n][m];

        int suffix = 1;
        for(int i = n-1;i>=0;i--){
            for(int j = m-1;j>=0;j--){
                ans[i][j] = suffix;
                suffix = suffix*grid[i][j];
            }
        }
        
        int prefix = 1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                ans[i][j] = prefix*ans[i][j];
                prefix = prefix*grid[i][j];
            }
        }

        return ans;
    }

}
