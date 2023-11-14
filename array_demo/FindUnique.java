package array_demo;

public class FindUnique {
    // method to find unique element in the array
    public static int uniqueElement(int []ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                {
                    ar[i]=-1;
                    ar[j]=-1;
                }
            }
        }
        int unique=-1;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>0)
                unique=ar[i];
        }
        return unique;
    }
    public static void main(String[] args) {
        int []ar={1,3,2,4,1,3,2};
        System.out.println("Unique element is "+uniqueElement(ar));
    }
}
