public class ProductExceptSelf{
    public static void main(String args[]){
        int nums[] = {-1,1,0,-3,3};
        int answer[] = function(nums);
        for(int i = 0;i<answer.length;i++){
            System.out.print(answer[i] + " ");
        }
    }

    public static int[] function(int nums[]){
        int answer[] = new int[nums.length];
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];

        prefix[0] = 1;
        suffix[nums.length-1] = 1;

        for(int i = 1;i<nums.length;i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }

        for(int i = nums.length-2;i>=0;i--){
            suffix[i] = suffix[i+1]*nums[i+1];
        }

        for(int i = 0;i<nums.length;i++){
            answer[i] = prefix[i]*suffix[i];
        }

        return answer;
    }
}