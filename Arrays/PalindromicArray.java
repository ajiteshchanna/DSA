public class PalindromicArray {
    public static void main(String[] args) {
        int nums[] = {1,2,3,2,1};
        System.out.println(isPalindrome(nums));
    }

    public static boolean isPalindrome(int nums[]){
        boolean result = true;

        int i = 0;
        int j = nums.length-1;

        while(i<=j){
            if(nums[i]!=nums[j]){
                result = false;
                return result;
            }
            i++;
            j--;
        }

        return result;
    }
}
