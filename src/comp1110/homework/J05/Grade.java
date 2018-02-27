package comp1110.homework.J05;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mark = in.nextInt();
        String grade;

        if (mark >= 0 && mark <= 49)
            grade = "N";
        else if (mark >= 50 && mark <= 59)
            grade = "P";
        else if (mark >= 60 && mark <= 69)
            grade = "C";
        else if (mark >= 70 && mark <= 79)
            grade = "D";
        else if (mark >= 80 && mark <= 100)
            grade = "HD";
        else
            grade = "Bad mark";
        System.out.println(grade);
    }
}
