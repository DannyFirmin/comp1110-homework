package comp1110.homework.O02;

enum Element {
    H(1, 1, 1),
    He(2, 18, 1),
    Li(3, 1, 2),
    Be(4, 2, 2),
    B(5, 13, 2);

    private int facts[];

    Element(int weight, int group, int period) {
        this.facts = new int[]{weight, group, period};
    }

    public int[] getFacts() {
        return this.facts;
    }

    @Override
    public String toString() {
        String str = "";
        for (int n : facts) {
            str += n + " ";
        }
        return str;
    }

    public static void main(String[] args) {
        Element elements[] = Element.values();
        for (Element e : elements) {
            System.out.println(e);
        }
    }
}
//taught and improved by my friends