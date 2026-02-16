public class TrappingRainWater {
    public static void main(String args[]){
        int levels[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(levels, 1));
    }

    public static int trappedRainwater(int levels[], int width){
        /*
            total_trapped_water = ((water_level-bar_level)*width)
        */

        int leftMax[] = new int[levels.length];
        int rightMax[] = new int[levels.length];

        leftMax[0] = levels[0];
        rightMax[levels.length-1] = levels[levels.length-1];

        // loop to fill leftMax
        for(int i = 1;i<levels.length;i++){
            leftMax[i] = Math.max(leftMax[i-1], levels[i]);
        }

        // loop to fill rightMax
        for(int i = levels.length-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1], levels[i]);
        }

        int totalTrappedWater = 0;
        for(int i=0; i<levels.length;i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            int barHeight = levels[i];
            totalTrappedWater+=((waterLevel - barHeight)*width);
        }

        return totalTrappedWater;
    }
}
