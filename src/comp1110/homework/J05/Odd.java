package comp1110.homework.J05;

import java.util.Scanner;

public class Odd {
    public static boolean isOdd(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " is even");
            return false;
        } else {
            System.out.println(a + " is odd");
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        isOdd(i);
    }
}

