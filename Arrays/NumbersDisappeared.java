import java.util.*;

public class NumbersDisappeared {
    public static void printArr(int nums[]){
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        List<Integer> list = findDisappearedNumbers(nums);
        System.out.println(list);
        
    }
    public static List<Integer>  findDisappearedNumbers(int nums[]){
        List<Integer> list = new ArrayList<>();
        boolean[] seen = new boolean[nums.length + 1];

        for(int n : nums){
            seen[n] = true;
        }

        for(int i = 1; i <= nums.length; i++){
            if(!seen[i]){
                list.add(i);
            }
        }

        return list;
    }
}
