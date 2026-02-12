
import java.util.HashSet;

public class LongestBalanced {
    public static void main(String[] args) {
        int nums[] = {3,2,2,5,4};
        int ans = longestBalancedSubarray(nums);
        System.out.println(ans);
    }
    
    public static int longestBalancedSubarray(int nums[]){
        // first let me define an integer result = 0
        int result = 0;

        // loop for traversing the array
        for(int i = 0;i<nums.length;i++){
            // defining two hashsets to store even and odd unique elements
            HashSet<Integer> evenSet = new HashSet<>();
            HashSet<Integer> oddSet = new HashSet<>();

            // another loop for traversing from i to end
            for(int j = i;j<nums.length;j++){
                if(nums[j] % 2 == 0){
                    evenSet.add(nums[j]);
                } else {
                    oddSet.add(nums[j]);
                }

                // checking whether till this point evenUnique == oddUnique or not
                if(oddSet.size() == evenSet.size()){
                    result = Math.max(result, j-i+1); // j-i+1 = size of current sub array
                }
            }
        }

        return result;
    }
}
