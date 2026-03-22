package arrays;
public class buysellstocks {
    public static void main(String args[])
    {
        int[] prices = {7,1,5,3,6,4}; // Example stock prices
        int maxProfit = 0; // Initialize maximum profit
        int buyprice = Integer.MAX_VALUE; // Initialize buy price to a large value
        for(int i = 0;i<prices.length;i++)
        {
            if(buyprice < prices[i])
            {
                int profit = prices[i] - buyprice; // Calculate profit if we had bought at buyprice and sold at sellprice
                maxProfit = Math.max(maxProfit,profit);
            }
            else
                buyprice = prices[i]; // Update buy price if current price is lower
       }
         System.out.println("Maximum profit: "+ maxProfit);
   }
}
