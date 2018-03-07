package comp1110.homework.J06;
import java.util.HashMap;
import java.util.Scanner;

class Permute2 {

    private String a, b;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.println(new Permute2(a, b).isPermute());
    }

    public Permute2(String a, String b)
    {
        this.a = a; this.b = b;
    }

    private String isPermute() {
        return checker() ? "Yes" : "No";
    }

    private boolean checker() {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : a.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }

        for (char c : b.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) <= 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }

        return true;
    }

}