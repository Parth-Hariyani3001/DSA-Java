import java.util.*;

public class FractionalKnapsack {
    public static void main(String args[]){
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        //0th col -> index; 1st Col -> ratio

        for(int i = 0; i < val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        //Sorting for col 1 (Ascending order sorting)
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        //but we want for descending order as we want less weight first so we loop backwards
        int capacity = W;
        int finalValue = 0;
        for(int i = ratio.length - 1; i >= 0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){ //incluse full item
                finalValue += val[idx];
                capacity -= weight[idx];
            } else { //include fractional item i.e the last item
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.print("Final max Value : " + finalValue);
    }
}
