package comp1110.homework.O04;


import java.util.ArrayList;
import java.util.Collection;

public class Sum extends ArrayList<Integer> {
    public int sum = 0;

    public int sum() {
        return this.sum;
    }

    public boolean add(Integer i) {
        this.sum = sum + i;
        return super.add(i);
    }

    public void add(int index, Integer i) {
        super.add(index, i);
        this.sum = sum + i;
    }

    public boolean addAll(Collection<? extends Integer> c) {
        for (int i : c) {
            this.sum = sum + i;
        }
        return super.addAll(c);
    }

    public boolean addAll(int index, Collection<? extends Integer> c) {
        for (int i : c) {
            this.sum = sum + i;
        }
        return super.addAll(index, c);

    }
}