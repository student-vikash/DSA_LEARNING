package array_learning;
import java.util.Scanner;
public class CodeChef1 {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter TestCases:");
        int t=s.nextInt();int ar[];
        for(int i=0;i<t;i++)
        {
            System.out.println("Enter NO of elements in rows: ");
            int r=s.nextInt();
            ar=new int[r];
            int count=0;
            for(int j=0;j<ar.length;j++)
            {
                System.out.println("Enter the elements: ");
                ar[j]=s.nextInt();


                if(ar[j]>=1000)
                    count+=1;
            }
            System.out.println(count);
        }
    }
}

