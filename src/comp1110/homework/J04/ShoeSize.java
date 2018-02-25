package comp1110.homework.J04;

import java.util.Scanner;

public class ShoeSize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double h = in.nextDouble()*5.0;
        double h2 = Math.round(h);
        int i = (int)h2; //force to change double to int
        System.out.println(i);
    }
}
