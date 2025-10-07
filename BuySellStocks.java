// --------------------------------------------
// 🖥️ VERSION 1: For VS Code / Local Compilation
// --------------------------------------------
public class BuySellStocks {
    public static void main(String[] args) {
        Solution sol = new Solution();   // Create object
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = sol.maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}

// Must be in the same file, not separate
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice)
                minPrice = price;
            else if (price - minPrice > maxProfit)
                maxProfit = price - minPrice;
        }
        return maxProfit;
    }
}

/*--------------------------------------------
// 💡 VERSION 2: For LeetCode Submission
// (Copy only this part when submitting on LeetCode)
// --------------------------------------------
class Solution {
    public int maxProfit(int[] prices) {

        // Initialize variables
        int minPrice = Integer.MAX_VALUE; // very high initial value
        int maxProfit = 0;

        // Loop through all prices
        for (int price : prices) {
            // Update minimum price if we find a lower one
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit and update maxProfit if needed
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        // Return final answer
        return maxProfit;
    }
}
*/