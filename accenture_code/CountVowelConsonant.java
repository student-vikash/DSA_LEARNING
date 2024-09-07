package accenture_code;

public class CountVowelConsonant
{
    // method to count vowel and Consonant
    public static void countVowelConsonant(String str)
    {
        int vowel = 0;
        int consonant = 0;

        str = str.toLowerCase();

        for(char c : str.toCharArray())
        {
            if(Character.isLetter(c))
            {
                if("aeiou".indexOf(c) != -1)
                {
                    vowel++;
                }
                else
                {
                    consonant++;
                }
            }
        }
        System.out.println("Total vowels are : "+vowel);
        System.out.println("Total Consonant is : "+consonant);
    }
    public static void main(String[] args) {

        countVowelConsonant("Vikash Kumar Rana");
    }
}
