public class TrappingWater {
    public static int trappedRainwater(int height[]){
        int maxNum = Integer.MIN_VALUE;

        //Calculate left max Boundary - array
        int leftMax[] = new int[height.length];
        for(int i = 0; i < height.length; i++){
            if(height[i] > maxNum){
                leftMax[i] = height[i];
                maxNum = height[i];
            }   else {
                leftMax[i] = maxNum;
            }
        }      
        maxNum = 0;

        //Calculate right max Boundary - array
        int rightMax[] = new int[height.length];
        for(int i = height.length-1; i >= 0; i--){
            if(height[i] > maxNum){
                rightMax[i] = height[i];
                maxNum = height[i];
            }   else {
                rightMax[i] = maxNum;
            }
        }
        
        //Calculate the water level
            //waterLevel = min(leftmax bound, rightmax bound)
            //trapped water = waterLevel - height[i]
        int trappedWater = 0;
        for(int i = 0 ; i < height.length; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel- height[i];
        }

        return trappedWater;
    }
    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int finalAns = trappedRainwater(height);
        System.out.println(finalAns);
    }
}
