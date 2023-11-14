package array_b;

public class TripletSum {
    // triplet sum of an array
    public static int tripletSum(int []ar,int target)
    {
        int count=0;
        for(int i=0;i<ar.length;i++)  // first no x
        {
            for(int j=i+1;j<ar.length;j++)  // second no y
            {
                for(int k=j+1;k<ar.length;k++)  // third no z     finally x+y+z=target   i have to find
                {
                    if(ar[i]+ar[j]+ar[k]==target)
                        count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int ar[]={1,4,5,6,3};
        int x=12;
        System.out.println("Total nos are "+tripletSum(ar,x));
    }
}
