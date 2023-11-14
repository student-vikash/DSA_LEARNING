package code_compete2;

public class MissingNo {
    public static void main(String[] args) {
        int []x={1,2,3,4,5,7,8,9};
        int sum1=0;
        for(int i=0;i<x.length;i++)
        {
            sum1=sum1+x[i];
        }
        System.out.println("Sum1="+sum1);

        int sum2=0;
        for(int i=1;i<=9;i++)
        {
            sum2=sum2+i;
        }
        System.out.println("Sum2="+sum2);

        System.out.println("Missing no = "+(sum2-sum1));
    }
}
