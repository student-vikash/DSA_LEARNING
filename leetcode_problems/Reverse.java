package leetcode_problems;

public class Reverse {

    public static void reverse(char []ar)
    {
        int start=0;
        int end=ar.length-1;
        while (start<=end)
        {
            char temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start+=1;
            end-=1;
        }
    }

    public static void main(String[] args) {
        char []ar={'v','i','k','a','s','h'};

        System.out.println("*** Before Reverse ****");
        System.out.println();
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }

        System.out.println();
        reverse(ar);
        System.out.println("*** After Reverse ***");
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}
