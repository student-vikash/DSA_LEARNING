package abc_viru;

import java.util.Scanner;

public class FashionHavenShopping
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N and K
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // Read gift voucher values
        int[] G = new int[N];
        for (int i = 0; i < N; i++) {
            G[i] = scanner.nextInt();
        }

        // Read item prices
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = scanner.nextInt();
        }

        // Call the method to calculate maximum gift vouchers within the budget
        int maxGiftVouchers = maxGiftVouchers(N, K, G, P);

        // Output the result
        System.out.println(maxGiftVouchers);

        scanner.close();
    }

    private static int maxGiftVouchers(int N, int K, int[] G, int[] P) {
        // Create a DP array
        int[] dp = new int[K + 1];

        // Fill the DP array
        for (int i = 0; i < N; i++) {
            int price = P[i];
            int giftVoucher = G[i];
            // Traverse backwards to ensure we don't use the same item more than once
            for (int j = K; j >= price; j--) {
                dp[j] = Math.max(dp[j], dp[j - price] + giftVoucher);
            }
        }

        return dp[K]; // The maximum gift voucher value with budget K
    }
}
