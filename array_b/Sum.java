package array_b;

public class Sum {
    // method to add all elements of the array
    public static int sumArray(int ar[])
    {
        int sum=0;
        for(int i=0;i<ar.length;i++)
        {
           sum=sum+ar[i];
        }
        return sum;
    }

    // method to multiply all array elements
    public static int multiArray(int ar[])
    {
        int prod=1;
        for(int i=0;i<ar.length;i++)
        {
            prod=prod * ar[i];
        }
        return prod;
    }
    public static void main(String[] args) {
        int ar[]={5,2,7,3,4,9,2,1};
        System.out.println("Sum = "+sumArray(ar));
        System.out.println("Prod = "+multiArray(ar));
    }
}
