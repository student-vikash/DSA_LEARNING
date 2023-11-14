package multithreading.in;

public class MyThread
{
    public MyThread(String name)
    {
        super();
        System.out.println("Thread Details : "+this);
    }

    public MyThread() {
        super();
    }

    public void run()
    {
        try{
            for(int i=2;i<=10;i+=2)
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
