package accenture_code;

public class StPalindrome
{
    // method to check palindrome String
    public static boolean isPalindrome(String str)
    {
       str = str.replaceAll("\\s+","").toLowerCase();
       int left = 0, right = str.length()-1;

       while (left <= right)
       {
           if(str.charAt(left) != str.charAt(right))
               return false;
           left++;
           right--;
       }
       return true;
    }
    public static void main(String[] args) {

        System.out.println(isPalindrome("    Naman   "));
    }
}
