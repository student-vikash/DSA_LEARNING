package recursion_learning;

public class Recursion1 {
    public static void printNos(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);  // printing   5 4 3 2 1
        printNos(n-1);     // recursion  bar bar 1 value kam hoga
    }
    public static void main(String[] args) {
        int n=5;
        printNos(n);
    }
}
