package comp1110.homework.J13;

import java.util.Scanner;
import java.util.HashMap;


public class People {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap map = new HashMap();
        String input;
        String[] tmp;
        String queryName = "";
        while (in.hasNext()) {
            input = in.nextLine();
            tmp = input.split(" ");
            if (tmp.length == 1) {
                queryName = tmp[0];
            } else {
                map.put(tmp[0], tmp[1]);
            }
        }
        if (map.get(queryName) == null) {
            System.out.println("unknown");
        } else {
            System.out.println(map.get(queryName));
        }
    }
}