package pattern_series2;

public class Spattern {
    public static void main(String[] args) {
        // for first row
        for(int i=0;i<6;i++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
        // for first column
        for(int i=0;i<3;i++)
        {
            System.out.println("*");
        }
        // for second row
        for(int i=0;i<6;i++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
        // for second column
        for(int i=0;i<3;i++)
        {
            System.out.println("          *");
        }
        // for third row
        for(int i=0;i<6;i++)
        {
            System.out.print("*"+" ");
        }
    }
}
