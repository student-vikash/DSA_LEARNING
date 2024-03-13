package leetcode_problems;

import java.util.Scanner;

public class VowelReverse
{

    public static boolean isVowel(char ch)
    {
        if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            return true;
        return false;
    }
    public static void reverseVowel(String s) {
        int left = 0;
        int right = s.length() - 1;
        char ch[] = s.toCharArray();

        while (left < right) {
            if (!isVowel(ch[left])) {
                left++;
            } else if (!isVowel(ch[right])) {
                right--;
            } else {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }


        }
        System.out.println(String.valueOf(ch));

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String as per your choice:");
        String s=sc.nextLine();
        reverseVowel(s);
    }
}
