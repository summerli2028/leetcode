class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE; // Start with the largest possible integer

        for (int price : prices) {
            if (price < minPrice) {
                // Update the minimum price found so far
                minPrice = price;
            } else {
                // Calculate the profit if the stock was bought at minPrice and sold at current price
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }
}

