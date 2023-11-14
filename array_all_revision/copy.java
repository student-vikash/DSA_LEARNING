package array_all_revision;

public class copy
{
    // method to print array element
    public static void printAr(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
       int []ar={5,2,3,8,4};
        System.out.println("This is original array");
       printAr(ar);

        System.out.println();
        int []ar2=ar.clone();  // copy all ar data in ar2 array here
        ar2[0]=9;
        ar2[1]=6;
        System.out.println("This is Changed array 2");
        printAr(ar2);

        System.out.println();
        int []ar3=ar2.clone();  // copy all ar2 data in ar3 array here
        ar3[0]=8;
        ar3[1]=4;
        System.out.println("This is Changed array 3");
        printAr(ar3);
    }
}
