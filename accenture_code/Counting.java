package accenture_code;

public class Counting
{
    // method to count letter , digit and symbol in the given String
    public static void countLetterDigitAndSymbol(String str)
    {
        int l = 0, d = 0, s = 0;
        for( char c : str.toCharArray())
        {
            if(Character.isLetter(c))
            {
                l++;
            }
            else if (Character.isDigit(c))
            {

               d++;
            }
            else
            {
                s++;
            }
        }
        System.out.println("Total letter is : "+l);
        System.out.println("Total Digit is : "+d);
        System.out.println("Total Symbol is : "+s);
    }

    public static void main(String[] args) {
        countLetterDigitAndSymbol("vikash2345vi@gmail.com");
    }
}
