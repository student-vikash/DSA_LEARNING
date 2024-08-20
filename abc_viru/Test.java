package abc_viru;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N and M
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Read the array A
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(A);

        // Initialize the minimum difference to a high value
        int minDifference = Integer.MAX_VALUE;

        // Check each window of size M
        for (int i = 0; i <= N - M; i++) {
            // Calculate the difference between the maximum and minimum in the current window
            int maxInWindow = A[i + M - 1];
            int minInWindow = A[i];
            int currentDifference = maxInWindow - minInWindow;

            // Update the minimum difference found
            minDifference = Math.min(minDifference, currentDifference);
        }

        // Output the result
        System.out.println(minDifference);

        scanner.close();
    }
}
