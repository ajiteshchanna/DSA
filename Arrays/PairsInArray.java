public class PairsInArray {
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10,12};
        System.out.println(pairsInArray(nums));
    }

    public static int pairsInArray(int nums[]){
        // Mathematically: totalPairs = (n*(n-1))/2
        int n = nums.length;
        int toatlPairs = 0;
        // n^2 time complexity
        // we are using 2 loops (nested loop)
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                System.out.print("(" + nums[i] + "," + nums[j] + ")" + "  ");
                toatlPairs++;
            }
            System.out.println();
        }

        return toatlPairs;
    }
}
