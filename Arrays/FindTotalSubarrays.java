public class FindTotalSubarrays {
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        System.out.println(countSubarrays(nums));
    }

    public static int countSubarrays(int nums[]){
        // Mathematically: totalSubarrays = (n*(n+1))/2
        int totalSubarrays = 0;
        // n^3 will be the time complexity as there will be three loops (nested)
        for(int i = 0;i<nums.length;i++){
            int start = i;
            for(int j = i;j<nums.length;j++){
                int end = j;
                for(int k = start;k<=end;k++){
                    System.out.print(nums[k] + " ");
                    totalSubarrays++;
                }
                System.out.println();
            }
            System.out.println("************");
        }

        return totalSubarrays;
    }
}
