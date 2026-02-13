public class LinearSearch {
    public static void main(String []args){
        int nums[] = {7,4,6,8,99};
        System.out.println(linearSearch(nums, 8));
    }

    public static boolean  linearSearch(int nums[], int target){
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
}
