package array_demo;

public class TripletSum {
    // finding triplet sum in the given array
    public static int tripletSum(int []ar,int x)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                for(int k=j+1;k<ar.length;k++)
                {
                    if(ar[i]+ar[j]+ar[k]==x)
                        count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int []ar={5,2,3,7,1,8,4};
        int x=12;
        System.out.println("Triplet is "+tripletSum(ar,x));
    }
}
