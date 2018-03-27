package comp1110.homework.J14;

public class Item {
    String name;
    int cost;   // in cents

    public Item(String n, int c) {
        name = n;
        cost = c;
    }

    public String toString() {
        return name + " " + cost;
    }
}
