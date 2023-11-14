package string.revision;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        s.nextInt();
        for(int i=0;i<t;i++)
        {
            String str=s.nextLine();
            s.nextInt();
            String tr=s.nextLine();
            String m="";
            for(int j=0;j<5;j++)
            {
                if(str.charAt(j)==tr.charAt(j))
                m+="G";
                else
                    m+="B";
            }
            System.out.println(m);
        }
    }
}
