package recursion_learning;

public class ProdRec {
    public static void printProd(int i,int n,int prod)
    {
        if(i==n)
        {
            prod*=i;
            System.out.println("Product="+prod);
            return;
        }
        prod*=i;
        printProd(i+1,n,prod);
    }

    public static void main(String[] args) {
        printProd(1,4,1);
    }
}
