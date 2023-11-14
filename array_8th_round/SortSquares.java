package array_8th_round;

public class
SortSquares {
    public static void sortSquares(int[] ar) {
        int left = 0;
        int right = ar.length - 1;
        int[] ans = new int[ar.length];
        int j = 0;

        while (left <= right) {
            if (Math.abs(ar[left]) > Math.abs(ar[right]))
            {
                ans[j++] = ar[left] * ar[left];
                left++;
            }
            else
            {
                ans[j++] = ar[right] * ar[right];
                right--;
            }

        }
        reverse(ans);
        printArray(ans);
    }

    public static void reverse(int[] ar)
    {
        int left = 0;
        int right = ar.length - 1;
        while (left < right) {
            int temp = ar[left];
            ar[left] = ar[right];
            ar[right] = temp;

            left++;
            right--;
        }

    }


    public static void printArray(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []ar={-3,4,-6,7,8};
        System.out.println("Squares in increasing order ");
        sortSquares(ar);

    }
}
