package array_b_revi;

public class TripletSum {
    // method to find triplet sum
    public static int tripletSum(int[] ar, int x) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                for (int k = j + 1; k < ar.length; k++) {
                    if (ar[i] + ar[j] + ar[k] == x)
                        count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] ar = {3, 2, 5, 1, 7, 6};
        int x = 12;
        System.out.println("Total count is " + tripletSum(ar, x));
    }
}




