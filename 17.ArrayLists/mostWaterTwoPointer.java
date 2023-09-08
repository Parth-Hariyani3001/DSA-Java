import java.util.ArrayList;

public class mostWaterTwoPointer {
    public static int storeWater(ArrayList<Integer> height){
        int lp = 0;
        int rp = height.size() - 1;
        int maxWater = 0;

        while(lp < rp){
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
            if(rp > lp){
                lp++;
            }
            else if (lp > rp){
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
         ArrayList<Integer> height = new ArrayList<>();
        //1 8 6 2 5 4 8 3 7
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(18);
        height.add(17);
        height.add(6);
        // height.add(3);
        // height.add(7);
        System.out.println(storeWater(height));
    }
}
