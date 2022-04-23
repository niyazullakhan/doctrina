package dp;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 *
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 *
 * Hint: PEak-Valley approach
 */
public class BuySellStock {

    public static void main(String[] args) {
        int[] stockPrices = {1,2,3,4,5};

        System.out.println(computeStockProfit(stockPrices));
    }

    private static int computeStockProfit(int[] stockPrices) {
        int maxProfit=0;
        int dips=0;
        int peak=0;
        int index=0;
        for(int i = index; i< arrayLength(stockPrices)-1; i=i+index-1) {

            while(index< arrayLength(stockPrices) -1 && isDecreasingGraph(stockPrices, index))
                index++;
            dips=stockPrices[index];

            while(index< arrayLength(stockPrices) -1 && isIncreasingGraph(stockPrices, index))
                index++;
            peak=stockPrices[index];

            maxProfit=maxProfit+(peak-dips);
        }
        return maxProfit;

    }

    private static boolean isIncreasingGraph(int[] stockPrices, int indexToCaptureUpsAndDowns) {
        return stockPrices[indexToCaptureUpsAndDowns]<=stockPrices[indexToCaptureUpsAndDowns+1];
    }

    private static boolean isDecreasingGraph(int[] stockPrices, int indexToCaptureUpsAndDowns) {
        return stockPrices[indexToCaptureUpsAndDowns]>=stockPrices[indexToCaptureUpsAndDowns+1];
    }

    private static int arrayLength(int[] stockPrices) {
        return stockPrices.length ;
    }
}
