import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target variable: ");
        int target = sc.nextInt();
        int nums[] = {7,8,9,10,11,12,13,14};
        System.out.println(binarySearch(nums, target));
    }

    public static boolean binarySearch(int nums[],int target){
        // for binary search, the array needs to be sorted

        int left = 0;
        int right = nums.length-1;
        
        while(left<=right){
            int mid = (left+right)/2; // we will be checking on this mid value always
            if(target==nums[mid]){
                return true;
            } else if(target>nums[mid]){
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }

        return false;
    }
}
