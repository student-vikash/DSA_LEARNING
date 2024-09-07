package accenture_code;

public class EvenOdd
{
    // method to find evenOdd in the given array
    public static String myTest(int []ar,int n)

    {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]%2==0)
            {
                sb.append("Even");
            }
            else {
                sb.append("Odd");
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        int []ar={5,3,2,7,8,6,1};
        System.out.println("My evaluation is : "+myTest(ar, ar.length));
    }
}
