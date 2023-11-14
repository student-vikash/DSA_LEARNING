package string_revision2;

import java.util.Scanner;

public class ToggleString
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder("PhySiCs");
        System.out.println("Original str is "+str);

        for(int i=0;i<str.length();i++)
        {
            boolean flag=true;  // capital

            char ch=str.charAt(i);
            if(ch==' ')continue;
            int asci=(char)ch;
            if(asci >= 97)flag=false;

            if(flag==true)
            {
                asci += 32;
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
        System.out.println("Toggle str is "+str);
    }
}
