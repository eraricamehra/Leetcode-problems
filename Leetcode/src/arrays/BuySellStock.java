package arrays;

public class BuySellStock {
	
	public int maxProfit(int[] prices) {
        int min= Integer.MAX_VALUE;
        int max =0;
        System.out.println(prices.length);
        for(int i=0; i<prices.length; i++) {
            if(prices[i] < min)  {
                min= prices[i];
            } else if(prices[i] > max) {
                max = Math.max(prices[i]-min, max);
            }
        }
        return max;
         
        
    }
        
}

