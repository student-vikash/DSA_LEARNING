package abc_viru;

import java.util.Scanner;

public class MaximumVoucherValue
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the budget
        int budget = scanner.nextInt();
        int N = scanner.nextInt(); // Number of items

        int[] prices = new int[N];
        int[] values = new int[N];

        // Read the prices and voucher values
        for (int i = 0; i < N; i++) {
            prices[i] = scanner.nextInt(); // Read the price of the item
        }

        for (int i = 0; i < N; i++) {
            values[i] = scanner.nextInt(); // Read the voucher value of the item
        }

        // Calculate maximum voucher value that can be attained with the given budget
        int maxVoucherValue = maximizeVoucherValue(N, budget, prices, values);

        // Output the result
        System.out.println("Maximum possible voucher value is: " + maxVoucherValue);
        scanner.close();
    }

    private static int maximizeVoucherValue(int N, int budget, int[] prices, int[] values) {
        int[] dp = new int[budget + 1];

        // Fill the DP array based on price and values
        for (int i = 0; i < N; i++) {
            int price = prices[i];
            int value = values[i];

            // Make sure to loop backward to avoid double counting
            for (int j = budget; j >= price; j--) {
                dp[j] = Math.max(dp[j], dp[j - price] + value);
            }
        }

        return dp[budget]; // Return the maximum value at the given budget
    }
}
