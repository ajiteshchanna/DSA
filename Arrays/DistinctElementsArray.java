import java.util.*;

public class DistinctElementsArray {
    /*
    Check whether an aray consists distinct elements or not.
    */
    public static void printArr(int nums[]){
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void main(String []args){
        int nums[] = {65,3,7,9,12};
        printArr(nums);
        System.out.println(consistDistinct(nums));
    }
    public static boolean consistDistinct(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.add(nums[i]);
            }
        }                                             
        return set.size() == nums.length;
    }
}
