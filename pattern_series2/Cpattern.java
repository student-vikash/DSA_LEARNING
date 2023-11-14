package pattern_series2;

public class Cpattern {
    public static void main(String[] args) {
        // first row
        for(int i=0;i<5;i++)
        {
            if(i==0)
                System.out.print("  ");
            System.out.print("*"+" ");
        }
        System.out.println();
        // first column
        for(int i=0;i<3;i++)
        {
            System.out.println("*");
        }
        // second row
        for(int i=0;i<5;i++)
        {
            if(i==0)
                System.out.print("  ");
            System.out.print("*"+" ");
        }
    }
}
