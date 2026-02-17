public class SortingAlgo {
    public static void printArray(int nums[]){
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String []args){
        int nums[] = {8,9,3,1,10,4,6};
        printArray(nums);
        bubbleSort(nums);
        printArray(nums);
    }

    // logic behind bubble sort: largest ko end par bhejo
    public static void bubbleSort(int nums[]){
        for(int turn=0;turn<nums.length-1;turn++){
            for(int j = 0;j<nums.length-turn-1;j++){
                if(nums[j]>nums[j+1]){
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                } 
            }
        }
    }

    // logic behind selection sort: pick the smallest (from unsorted), put it at beginning
    public static void selectionSort(int nums[]){
        for(int i =0;i<nums.length-1;i++){

            // minimum position = current position
            int minPos = nums[i];

            for(int j = i+1;j<nums.length-1;j++){
                if(nums[minPos]>nums[j]){
                    minPos = j;
                }
            }

            // now swap
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }
}
