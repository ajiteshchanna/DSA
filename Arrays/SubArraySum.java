public class SubArraySum {
    public static void printArray(int nums[]){
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {1,-2,6,-1,3};
        // System.out.println(maxSubArraySum(nums));
        // System.out.println(minSubArraySum(nums));

        int res = prefixSumTechnique(nums);
        System.out.println("Max Sum: " + res);
    }

    // this is the brute force method
    public static int maxSubArraySum(int nums[]){
        /*
        Sabhi sub arrays ka sum nikalna hai and then we have to return the maximum sum that we have got.
        */

        int maxSum = Integer.MIN_VALUE;
        
        // Loops
        for(int i = 0;i<nums.length;i++){
            int start = i;
            for(int j = i;j<nums.length;j++){
                int end = j;
                int currSum = 0;
                for(int k = start;k<=end;k++){
                    currSum+=nums[k];
                }
                maxSum = Math.max(currSum, maxSum);
            }
        }

        return maxSum;
    }

    public static int minSubArraySum(int nums[]){
        /*
        Sabhi sub arrays ka sum nikalna hai and then we have to return the maximum sum that we have got.
        */

        int minSum = Integer.MAX_VALUE;
        
        // Loops
        for(int i = 0;i<nums.length;i++){
            int start = i;
            for(int j = i;j<nums.length;j++){
                int end = j;
                int currSum = 0;
                for(int k = start;k<=end;k++){
                    currSum+=nums[k];
                }
                minSum = Math.min(currSum, minSum);
            }
        }

        return minSum;
    }


    // now the efficient technique which is known as : prefix sum
    public static int prefixSumTechnique(int nums[]){
        // Here, time complexity is O(n^2)
        /*
            We will be creating a new array named Prefix Array, usme, jis index par aap hai, start se lekarke us index tak sare ka sum aayega...
            Mathematical formula to calculate sum = prefixArray[start] - prefixArray[start-1]
        */
        int maxSum = Integer.MIN_VALUE;
        int prefixArray[] = new int[nums.length];
        
        // lets first calculate the prefix array
        prefixArray[0] = nums[0];
        
        for(int i = 1;i<nums.length;i++){
            prefixArray[i] = nums[i] + prefixArray[i-1];
        }
        
        // calculating max sum
        for(int i = 0;i<nums.length;i++){
            int start = i;

            for(int j = i;j<nums.length;j++){

                int end = j;

                int currSum = start == 0 ? prefixArray[end] : (prefixArray[end] - prefixArray[start-1]); // ternery operator

                maxSum = Math.max(maxSum, currSum);

            }
            
        }
        return maxSum;
    }
}
