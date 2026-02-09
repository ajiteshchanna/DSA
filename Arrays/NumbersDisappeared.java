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
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        // sorting the array
        Arrays.sort(nums);
        
        // Creating a Hashset for storing the unique elements
        Set<Integer> s = new HashSet<>();

        // storing the unique elements in the set
        for(int i = 0;i<n;i++){
            s.add(nums[i]);
        }
        System.out.println(s);
        return list;
    }
}
