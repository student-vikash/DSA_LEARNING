package string.revision;

public class ReverseStr
{
    // method to reverse a String
    public static String reverseString(String str)
    {
        char [] ch =str.toCharArray();
        int left =0, right = ch.length-1;

        while(left < right)
        {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }

    // method to reverse a String using StringBuilder
    public static StringBuilder reverseString2(String str)
    {
        StringBuilder sb = new StringBuilder();
        int i=str.length()-1;
        while( i >= 0)
        {
            sb.append(str.charAt(i));
            i--;
        }
        return sb;
    }


    // method to reverse the words of a String
    public static String reverseWords(String str)
    {
        String []str_ar = str.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=str_ar.length - 1;i>=0;i--)
        {
            sb.append(str_ar[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    // method to reverse Each word in a String
    public static String reverseEachWord(String str)
    {
        String [] rev_e_word =str.split("");
        StringBuilder sb=new StringBuilder();
        for(int i=rev_e_word.length-1;i>=0;i--)
        {
            sb.append(rev_e_word[i]);
            sb.append("");
        }
        return sb.toString().trim();
    }

    // method to check the isSame String or not
    public static int isSame(String str)
    {
        StringBuilder num=new StringBuilder();
        StringBuilder n_str=new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isDigit(ch))
            {
                num.append(ch);
            }
            else
            {
                n_str.append(ch);
            }
        }
        String number=num.toString();
        int n;
        try
        {
            n=Integer.parseInt(number);
        }
        catch (NumberFormatException nfe)
        {
            return 0;
        }
        return (n_str.length() == n)? 1:0;
    }
    public static void main(String[] args) {
//        System.out.println(reverseString("VIKAS_TAN"));
//
//        System.out.println();
//
//        System.out.println(reverseString2("Manisha"));

        //    System.out.println(reverseWords("   I LOVE YOU SWEET HEART ! "));

      //  System.out.println(reverseEachWord("You are the best Student of the year !   "));

        System.out.println("isSame or not "+isSame("SACHIN6"));
    }
}
