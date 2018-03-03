package comp1110.homework.J06;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        boolean primeYes = true;

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeYes = false;
                    break;
                }
            }
            if (primeYes){
                System.out.println(i);}
            primeYes = true;

        }
    }
}
