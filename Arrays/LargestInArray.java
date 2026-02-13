public class LargestInArray {
    public static void main(String[] args) {
        int nums[] = {-1,-9,-11,-2,0,-21};
        System.out.println(findLargestElement(nums));
    }

    public static int findLargestElement(int nums[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            largest = Math.max(largest, nums[i]);
        }

        return largest;
    }
}
