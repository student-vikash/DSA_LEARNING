package accenture_code;

public class SelfTest
{
    // method to remove spaces
    public static void removeSpace()
    {
        String str = "    Vikash kumar  ";
        System.out.println("Actual String is : "+str);
        System.out.println("It's length is +"+str.length());

        str = str.replaceAll("\\s+","");
        System.out.println("Replaced String is : "+str);
        System.out.println("It's length is : "+str.length());
    }

    // method to replace char
    public static void replaceChar()
    {
        String str = " Sumit Kumar  ";
        System.out.println("Actual String is : "+str);
        System.out.println("It's length is : "+str.length());

        System.out.println("Trimmed str is : "+str.trim());
        System.out.println("Trimmed str length is : "+str.trim().length());

        System.out.println("\n\n\n");
        System.out.println(str.replaceAll("Kumar","@"));
    }
    public static void main(String[] args) {
      //  removeSpace();
        replaceChar();
    }
}
