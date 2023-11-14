package array_all_revision;

public class TripletSum
{
    // method to find triplet sum
    public static int tripletSum(int []ar,int val)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                for(int k=j+1;k<ar.length;k++)
                {
                    if(ar[i]+ar[j]+ar[k]==val)
                        count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []ar={5,2,5,3,1,6,2};
        int val=12;
        System.out.println("Triplet sum nos are "+tripletSum(ar,val));
    }
}
