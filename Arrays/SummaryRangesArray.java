
import java.util.ArrayList;
import java.util.List;

public class SummaryRangesArray {
    public static void main(String[] args) {
        int nums[] = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int nums[]){
        ArrayList<String> list = new ArrayList<>();

        if(nums.length == 0) return list;

        int p = 0;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i+1] != nums[i] + 1){
                if(p == i){
                    list.add("" + nums[p]);
                } else{
                    list.add(nums[p] + "->" + nums[i]);
                }
                p = i + 1;
            }
        }

        // 🔥 HANDLE LAST RANGE HERE
        if(p == nums.length - 1){
            list.add("" + nums[p]);
        } else{
            list.add(nums[p] + "->" + nums[nums.length - 1]);
        }

        return list;
    }

}
