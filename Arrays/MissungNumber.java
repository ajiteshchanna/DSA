import java.util.Arrays;

public class MissungNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int checker = 0;
        Arrays.sort(nums);

        for(int i = 0;i<n;i++){
            if(nums[i] != checker){
                return checker;
            }
            checker++;
        }
        return checker;
    }
}
