public class BuySellStock {
    public static int Profit(int prices[]){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            if(buyPrice < prices[i]){
                int p = prices[i] - buyPrice;
                if(p > maxProfit){
                    maxProfit = p;
                }
            }   else if(buyPrice > prices[i]){
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        //int prices2[] = {7,6,5,4,3};
        System.out.println(Profit(prices));
    }
}
