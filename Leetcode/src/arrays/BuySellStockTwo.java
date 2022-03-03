package arrays;

public class BuySellStockTwo {

	public int maxProfit(int[] prices) {
		int i = 0, j = 0;
		int max = 0, profit = 0;
		while (i < prices.length - 1) {
			j = i + 1;
			if (prices[i] < prices[j]) {
				while (j < prices.length - 1) {
					if (prices[j] < prices[j + 1])
						j++;
					else
						break;
				}
				max = prices[j - 1];
				profit = profit + (max - prices[i]);

				i = j;
			} else
				i++;
		}
		return profit;
	}

	public int maxProfitApproach2(int[] prices) {
		int profit = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1])
				profit += prices[i] - prices[i - 1];
		}
		return profit;
	}

}
