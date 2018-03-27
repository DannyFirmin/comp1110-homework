package comp1110.homework.J13;

import java.util.Scanner;
import java.util.ArrayList;

public class Names {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> store = new ArrayList<>();
        while (in.hasNext()) {
            String input = in.nextLine();
            store.add(input);
        }

        for (int i = store.size() - 1; i >= 0; i--) {
            System.out.println(store.get(i));
        }
    }
}