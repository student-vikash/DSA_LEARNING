package sorting_base;

public class UseSelection2 {
    public static void main(String[] args) {
        int ar[]={8,6,4,2,1,3};
        for(int i=0;i<ar.length-1;i++)
        { int smallest=i;
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[smallest]>ar[j])
                {
                    smallest=j;
                }
            }
            int temp=ar[smallest];
            ar[smallest]=ar[i];
            ar[i]=temp;
        }
        Selection2 s=new Selection2();
        s.printArray(ar);
    }
}
