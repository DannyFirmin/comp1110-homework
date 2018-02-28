package comp1110.homework.J06;

import java.util.Scanner;

public class Ones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        int jishu = 0;
        while (i != 0) {
            i = i & (i - 1);
            jishu++;
        }
        System.out.println(jishu);
    }
}



        /*
        int one = 1;
        while (one <= i) {
            if ((one & i) != 0)
                jishu++;
            one = one << 1;
        }
        System.out.println(jishu);
    }*/

//inspired from: https://en.wikipedia.org/wiki/Hamming_weight