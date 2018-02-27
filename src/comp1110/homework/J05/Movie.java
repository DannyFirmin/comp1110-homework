package comp1110.homework.J05;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String mname = in.nextLine();
        int mtime = in.nextInt();
        int h = mtime / 60;
        int m = mtime % 60;

        if (mtime == 1)
            System.out.println(mname + " runs for 1 minute");
        else if (mtime < 60 && mtime > 1)
            System.out.println(mname + " runs for " + mtime + " minutes");
        else if (mtime == 60)
            System.out.println(mname + " runs for 1 hour");
        else if (mtime > 60 && mtime < 120)
            System.out.println(mname + " runs for " + h + " hour and " + m + " minutes");
        else if (mtime >= 120 && m==0)
            System.out.println(mname + " runs for " + h + " hours");
        else if (mtime > 120)
            System.out.println(mname + " runs for " + h + " hours and " + m + " minutes");

    }

}