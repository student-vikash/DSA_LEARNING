package oops_round_2;

public class SuperInMethodOverriding
{
    public void Developer()
    {
        System.out.println("I know HTML,CSS,JS,REACT.");
    }
    public static class BackEndDeveloper extends SuperInMethodOverriding
    {
        public void Developer()
        {
            super.Developer();
            System.out.println("I know js,Python.");
        }
    }

    public static void main(String[] args) {
        BackEndDeveloper b=new BackEndDeveloper();
        b.Developer();
    }
}
