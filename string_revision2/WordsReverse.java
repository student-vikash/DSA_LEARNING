package string_revision2;

import java.util.Scanner;

public class WordsReverse
{
    // method to reverse all the words in a sentence
    public static String Reverse(String words)
    {
        String [] allwords=words.split(" +");

        StringBuilder sb=new StringBuilder();
        for(int i=allwords.length-1;i>=0;i--)
        {
            sb.append(allwords[i]);
            sb.append(" ");

        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter string a sentence please :");
        String words=s.nextLine();
        System.out.println(Reverse(words));
    }
}
