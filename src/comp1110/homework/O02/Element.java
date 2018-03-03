package comp1110.homework.O02;

public enum Element {
    H(1, 1, 1),
    He(2, 18, 1),
    Li(3, 1, 2),
    Be(4, 2, 2),
    B(5, 13, 2);
    private final int weight;
    private final int group;
    private final int period;

    Element(int weight, int group, int period) {
        this.weight = weight;
        this.group = group;
        this.period = period;
    }

    private int weight() {
        return weight;
    }

    private int group() {
        return group;
    }

    private int period() {
        return period;
    }

    private int facts[];

    public static void getFacts() {
        Element facts[] = Element.values();
        for (int i = 0; i < facts.length; i++) {
            System.out.println(facts[i]);
        }
    }

    public static void main(String[] args) {
        getFacts();
    }
}

