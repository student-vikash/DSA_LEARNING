package exception_revision;

public class ArrayIndexd {
    public static void main(String[] args) {
       try{
           int ar[]={1,2,3,4,5};
           System.out.println("Array Element:"+ar[1]);
           System.out.println("Array Element:"+ar[8]);
       }
       catch (ArrayIndexOutOfBoundsException ex)
       {
           System.out.println("Please pass valid index.");
       }
    }
}
