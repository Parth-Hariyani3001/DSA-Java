import java.util.ArrayList;

public class mostWaterBruteForce {
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        for(int i = 0; i < height.size();i++){
            for(int j = i+1; j < height.size();j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        //1 8 6 2 5 4 8 3 7
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);

        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(18);
        height.add(17);
        height.add(6);
        System.out.println(storeWater(height));
    }
}
