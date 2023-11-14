package durgasoft_learning;

public class For1Each {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7,8};
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }


        System.out.println();
        for(int x:ar)
        {
            System.out.print(ar[x]+" ");
        }
    }
}
