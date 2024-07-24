package array_b;

public class A_all
        {
            // method to reverse an array
            public static void reverseArray(int []ar)
            {
                int left=0,right=ar.length-1;
                while (left < right)
                {
                    int temp=ar[left];
                    ar[left]=ar[right];
                    ar[right]=temp;
                    left++;
                    right--;
                }
                printArray(ar);
            }

            // Method to print the array elements
            public static void printArray(int []ar) {
                for (int i = 0; i < ar.length; i++) {
                    System.out.print(ar[i] + " ");
                }

            }

            public static void main (String[]args)
            {
            int[] ar = {2, 3, 1, 6, 9, 4, 0, 5};
            reverseArray(ar);
            }
    }