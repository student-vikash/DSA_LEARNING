package code_chef;

import java.util.Scanner;

public class StTest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=s.nextInt();
            String s1=s.next();
            int count=0;
            for(int j=0;j<s1.length();j++)
            {
                if(s1.charAt(j)!='a' && s1.charAt(j)!='e' && s1.charAt(j)!='i' && s1.charAt(j)!='o' && s1.charAt(j)!='u')
                {
                    count+=1;
                }
            }
            System.out.println("count="+count);
            if(count>4)
            {
                System.out.println("Pronounciation is Difficult");
            }
            else{
                System.out.println("Pronounciation is Easy");
            }
        }
    }
}
