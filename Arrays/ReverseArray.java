public class ReverseArray {
    public static void printArray(int nums[]){
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int nums[] = {9,7,3,6,1,11,21,33,0,2};
        printArray(nums);
        reverse(nums);
        printArray(nums);

    }

    public static void reverse(int nums[]){
        // here, we will be applying a two pointer approach
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            // swapping values
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // updating variables
            start++;
            end--;
        }
    }
}
