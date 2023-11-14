package array_5th_round;

public class Occurance {
    public static int countOccurance(int []ar,int x)
    {
        int count=0;
        for(int a:ar)
        {
            if(a==x)
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int ar[]={4,8,6,8,1,0,8};
        int x=8;
        System.out.println("Occurance of "+x+" is "+countOccurance(ar,x));
    }
}
