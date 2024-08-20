package string_revision;

public class StringCompression
{
    // method to  compress the  String as per character come in the sequence
    public static String compressString(String str)
    {
       if(str.length()==0 || str.isEmpty())
           return str;

       // create StringBuilder
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i) == str.charAt(i-1))
            {
                count++;   // if previous and current char is same , increment count
            }
            else {
                compressed.append(str.charAt(i-1)).append(count);
                count = 1; // reset count=1
            }
        }
        compressed.append(str.charAt(str.length()-1)).append(count);

        return compressed.length() < str.length()? compressed.toString() : str;
    }



    // method to  count Letter Symbol and digit in the given String
    public static void LetterDigitSymbolCount(String str)
    {
        int letter = 0,digit = 0,symbol = 0;
        for(char c : str.toCharArray())
        {
            if(Character.isLetter(c))
            {
                letter++;
            }
            else if(Character.isDigit(c))
            {
                digit++;
            }
            else
            {
                symbol++;
            }
        }
        System.out.println("Total letter is : "+letter);
        System.out.println("Total Digit is : "+digit);
        System.out.println("Total Symbol is : "+symbol);
    }


    // method to count Vowels and Consonant in the given String
    public static void vowelConsonantCount(String str)
    {
        int v = 0, c = 0;
        String vowels = "aeiouAEIOU";
        for(char ch : str.toCharArray())
        {
            if(vowels.indexOf(ch) != -1)
            {
                v++;
            }
            else
            {
                c++;
            }
        }
        System.out.println("Total vowels is : "+v);
        System.out.println("Total Consonant is : "+c);
    }
    public static void main(String[] args) {

//        String s = "abc";
//        System.out.println("Actual String is : "+s);
//        System.out.println("Compressed String is : "+compressString(s));

         //    LetterDigitSymbolCount("VIKASH23456VI@GMAIL.COM");

        vowelConsonantCount("aboutmycollege");
    }
}


