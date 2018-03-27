package comp1110.homework.J13;

import java.util.Scanner;
import java.util.ArrayList;

public class Mean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> store = new ArrayList<>();
        while (in.hasNext()) {
            double input = in.nextDouble();
            store.add(input);
        }
        double sum = 0;
        for (int i = 0; i < store.size(); i++) {
            sum = sum + store.get(i);
        }
        System.out.println(sum / store.size());
    }
}

//Classmate's code to learn, better way to handle the wrong input type
//import java.util.ArrayList;
//import java.util.List;
//import java.util.NoSuchElementException;
//import java.util.Scanner;
//
//public class Mean {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Double> storeInput = new ArrayList<>();
//        try {
//            while(true) {
//                double input = scanner.nextDouble();
//                storeInput.add(input);
//            }
//        } catch (NoSuchElementException e) {
//            double summary = 0;
//            for (int i = 0; i < storeInput.size(); i++) {
//                summary = summary + storeInput.get(i);
//            }
//            System.out.println(summary/storeInput.size());
//        }
//    }
//}