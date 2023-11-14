package string_revision2;

public class MergeAlternatively
{
    // method to add String Alternatively
    public  static String mergeAlternatively(String word1,String word2)
    {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i < word1.length()  || i < word2.length())
        {
            if(i < word1.length())
            {
                sb.append(word1.charAt(i));
            }
            if(i < word2.length())
            {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String word1 = "VIKAS";
        String word2 = "KUMAR";
        System.out.println("MergeAlternatively String is "+mergeAlternatively(word1,word2));

    }
}
