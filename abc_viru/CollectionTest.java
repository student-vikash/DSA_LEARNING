package abc_viru;

import java.util.ArrayList;

public class CollectionTest
{
    // method to separate even odd
    public static void evenOdd(int []ar)
    {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i] % 2 == 0)
            {
                even.add(i);
            }
            else
            {
                odd.add(i);
            }
        }
        System.out.println("Even elements are : "+even);
        System.out.println("Odd elements are : "+odd);
    }
    public static void main(String[] args) {
        int []ar={5,2,1,8,7,9,6,5,3};
        evenOdd(ar);
    }
}
