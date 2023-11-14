package recursion_learning;

public class Recursion2 {
    public static void printNos(int n)
    {
        if(n==6)
        {
            return;
        }
        System.out.println(n);
        printNos(n+1);
    }

    public static void main(String[] args) {
        int n=1;
        printNos(n);
    }
}
