package array_6th_round;

public class TripletSum {
    // find triplet sum in the array which equal to target
    public static int tripletSum(int []ar,int target)
    {
        int count=0;
        for(int i=0;i<ar.length;i++) // first no x
        {
            for(int j=i+1;j<ar.length;j++)  // second no y
            {
                for(int k=j+1;k<ar.length;k++) // third no z
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
        int target=12;
        System.out.println("Total nos are "+tripletSum(ar,target));

    }
}
