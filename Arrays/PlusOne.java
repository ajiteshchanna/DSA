public class PlusOne {
    public static void printArr(int nums[]){
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {9,9,9};
        int res[] = plusOneArray(nums);
        printArr(res);
    }

    public static int[] plusOneArray(int nums[]){
        for(int j = nums.length-1;j>=0;j--){
            if(nums[j]  < 9){
                nums[j] = nums[j] + 1;
                break;
            } else {
                nums[j] = 0;
            }
        }
        if(nums[0] == 0){
            nums = new int[nums.length+1];
            nums[0] = 1;
            for(int i = 1;i<nums.length;i++){
                nums[i] = 0;
            }
        }
        return nums;
    }
}
