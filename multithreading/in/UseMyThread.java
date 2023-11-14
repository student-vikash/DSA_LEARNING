package multithreading.in;

public class UseMyThread
{
    public static void main(String[] args) {
        MyThread m1=new MyThread("Vikash ");
        m1.run();
        try{
            for(int i=1;i<=10;i+=2)
            {
                System.out.println("Finished : "+i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException ex)
        {
            System.out.println("InterruptedException ");
        }
    }
}
