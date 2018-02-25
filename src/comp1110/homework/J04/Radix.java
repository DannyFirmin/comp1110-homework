package comp1110.homework.J04;

import java.util.Scanner;

public class Radix {
        public static void main(String[] args) {
                Scanner in = new Scanner (System.in);
                int sb = in.nextInt();
                int db = in.nextInt();
                String num = in.next();
                int a = Integer.parseInt(num,sb);
                String b = Integer.toString(a,db);
                System.out.println(b);
        }
}
