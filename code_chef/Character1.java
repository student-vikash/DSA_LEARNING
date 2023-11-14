package code_chef;

import java.util.Scanner;

public class Character1 {
    public static void main(String[] args)throws  Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++) {
            char ch = (char) System.in.read();
            if (ch == 'B' || ch == 'b') {
                System.out.println("BattleShip");
            } else if (ch == 'c' || ch == 'C') {
                System.out.println("Cruiser");
            } else if (ch == 'd' || ch == 'D') {
                System.out.println("Destroyer");
            } else if (ch == 'f' || ch == 'F') {
                System.out.println("Fretter");
            } else{
                System.out.println();
        }
    }}
}
