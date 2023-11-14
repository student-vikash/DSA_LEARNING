package string_revision2;

import java.util.Scanner;

public class ToggleString2
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        StringBuilder str=new StringBuilder(s.nextLine());

        System.out.println("Original String is "+str);

        for(int i=0;i<str.length();i++)
        {
            boolean flag=true;  // capital
            char ch=str.charAt(i);
            if(ch==' ')
                continue;
            int asci=(int)ch;
            if(asci >= 97)
                flag=false;
            if(flag==true)
            {
                asci +=32;
                char ne=(char)asci;
                str.setCharAt(i,ne);
            }
            else
            {
                asci -= 32;
                char ne=(char)asci;
                str.setCharAt(i,ne);
            }
        }
        System.out.println("New Toggle String is "+str);
    }
}
