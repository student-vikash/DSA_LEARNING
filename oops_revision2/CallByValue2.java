package oops_revision2;

public class CallByValue2
{
   public static void increment(int a,int b)
   {
       a=a+10;
       b=b+20;

       /* After changing in formal argument we won't get any change in actual argument. */
   }

    public static void main(String[] args) {
        int a=2,b=4;
        System.out.println("********* Before Changing *********");
        System.out.println("a="+a+"\n"+"b="+b);

        System.out.println();
        System.out.println("********* After Changing **********");
        increment(a,b);
        System.out.println("a="+a+"\n"+"b="+b);
    }
}
