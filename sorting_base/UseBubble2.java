package sorting_base;

public class UseBubble2 {
    public static void main(String[] args) {
        int ar[]={2,4,6,1,9,3,5};
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=0;j<ar.length-i-1;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        Bubble2 b=new Bubble2();
        b.printArray(ar);
    }
}
