package comp1110.homework.J13;

import java.util.HashMap;

public class Shop {
    private class Good {
        String name;
        int stock;
        int price;
        int rate;
        int reorderdays;

        public Good(String name, int stock, int price) {
            this.name = name;
            this.stock = stock;
            this.price = price;
        }

        public Good(String name, int stock, int price, int rate, int reorderdays) {
            this.name = name;
            this.stock = stock;
            this.price = price;
            this.rate = rate;
            this.reorderdays = reorderdays;
        }
    }

    public static void main(String[] args) {
        Shop s = new Shop();
    }

    HashMap<String, Good> goods = new HashMap<>();

    public void addItem(String name, int stock, int price) {
        goods.put(name, new Good(name, stock, price));
    }

    public int totalStockValue() {
        int val = 0;
        for (String s : goods.keySet()) {
            Good g = goods.get(s);
            val += g.price * g.stock;
        }
        return val;
    }

    public void addItem(String name, int stock, int price, int rate, int reorderdays) {
        goods.put(name, new Good(name, stock, price, rate, reorderdays));
    }

    public HashMap reorder() {
        HashMap<String, Integer> hs = new HashMap<>();
        for (String s : goods.keySet()) {
            Good g = goods.get(s);
            if ((g.stock - g.rate * g.reorderdays) <= 1) {
                hs.put(g.name, g.rate * 7 - g.stock);
            }
        }
        return hs;
    }
}
//code from Harvey