public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        //Brute force
//        int maxProfit = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                int currentProfit = prices[j] - prices[i];
//                if (currentProfit > maxProfit) {
//                    maxProfit = currentProfit;
//                }
//            }
//        }
//        return maxProfit;

        //Only need to save the min value,rest of get max is as same as above
        int minProfit = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minProfit) {
                minProfit = prices[i];
            } else if (prices[i] - minProfit > maxProfit) {
                maxProfit = prices[i] - minProfit;
            }
        }
        return maxProfit;
    }
}
