package pattern_series2;

public class Upattern {
    public static void main(String[] args) {
        // for both column
        for (int i = 0; i < 6; i++)
        {
            System.out.println("*            *");
        }
        // for first row
        for(int i=0;i<5;i++)
        {
            if(i==0)
                System.out.print("  ");
            System.out.print("*"+" ");
        }
    }
}