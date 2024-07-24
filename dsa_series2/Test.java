package dsa_series2;

public class Test
{
    // Method to show all Strings char
    public static void showCharacters(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+"  ");
        }
    }


    public static void main(String[] args) {
        showCharacters("Sumit Yadav");
    }
}
