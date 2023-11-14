package multithreading.in;

public class TestMainThread
{
    public static void main(String[] args) {
        Thread th=Thread.currentThread();
        System.out.println("Thread Details : "+th);

        th.setName("Vikash");
        System.out.println("After Changing name : "+th);
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.print(i+" ");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException ex)
        {
            System.out.println(th.getName()+" intrrupted");
        }
    }
}
