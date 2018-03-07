package comp1110.homework.J06;
//I improve my code for a lot of times to make it better and better. The last improvement is guided by my friend.
//import java.util.HashMap;
import java.util.Scanner;

class Permute {

    private String a, b;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        if (new Permute(a, b).magic() == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public Permute(String a, String b) {
        this.a = a;
        this.b = b;
    }

    private boolean magic() {
        int a1, a2, b1, b2;
        a1 = a2 = b1 = b2 = 0;

        for (char c : a.toCharArray()) {
            a1 += c;
            a2 |= c;
        }
        for (char c : b.toCharArray()) {
            b1 += c;
            b2 |= c;
        }

        return ((a1 == b1) && (a2 == b2) == true);
    }
}
// private String isPermute() {
//     return checker() ? "Yes" : "No";
// }

// private boolean checker() {
//     HashMap<Character, Integer> map = new HashMap<>();

//     for (char c : a.toCharArray()) {
//         if (!map.containsKey(c)) {
//             map.put(c, 0);
//         }
//         map.put(c, map.get(c) + 1);
//     }

//     for (char c : b.toCharArray()) {
//         if (!map.containsKey(c) || map.get(c) <= 0) {
//             return false;
//         }
//         map.put(c, map.get(c) - 1);
//     }

//     return true;
// }

