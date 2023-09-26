import java.util.*;

public class IndianCoins {
    public static void main(String args[]){
        //In order to sort in descending manner it should be in 'Integer' and not in 'int'
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < coins.length; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    countOfCoins++;
                    amount -= coins[i];
                    ans.add(coins[i]);
                }
            }
        }

        System.out.println("Count of coins used : " + countOfCoins);
        System.out.println("List of currency used : " + ans);
    }
}
