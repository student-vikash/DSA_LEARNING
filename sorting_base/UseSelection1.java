package sorting_base;

public class UseSelection1 {
    public static void main(String[] args) {
        int ar[]={5,2,4,1,6,9};
        for(int i=0;i<ar.length-1;i++)
        {
            int smallext=i;
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[smallext]>ar[j])
                {
                    smallext=j;
                }}
                int temp=ar[smallext];
                ar[smallext]=ar[i];
                ar[i]=temp;

        }
        Selection1 s=new Selection1();
        s.printArray(ar);
    }
}
