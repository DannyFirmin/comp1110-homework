package comp1110.homework.J14;

import java.util.*;

public class Cost {
    HashMap<String, Item> items = new HashMap<>();

    void addItem(String name, int cost) {
        items.put(name, new Item(name, cost));
    }

    void printCost() {
        List<Item> sorted = new ArrayList<>();
        for (Item item : items.values()) {
            sorted.add(item);
        }
        Collections.sort(sorted);
        for (Item item : sorted) {
            System.out.println(item.name + " " + item.cost);
        }
    }

    int voucherWaste(int value) {
        Set<Integer> prices = new HashSet<>();
        for (Item item : items.values()) {
            prices.add(item.cost);
        }
        return remainingVoucherWaste(value, prices);
    }

    private int remainingVoucherWaste(int value, Set<Integer> prices) {
        int min = value;
        if(min == 0) return 0;
        for (Integer p : prices) {
            if (p <= value) {
                int newValue = remainingVoucherWaste(value - p, prices);
                if (newValue < min) {

                    min = newValue;
                }
            }
        }
        return min;
    }

    public class Item implements Comparable<Item> {
        String name;
        int cost;   // in cents

        public Item(String n, int c) {
            name = n;
            cost = c;
        }

        public String toString() {
            return name + " " + cost;
        }

        @Override
        public int compareTo(Item o) {
            int diff = this.cost - o.cost;
            if (diff == 0) return this.name.compareTo(o.name);
            else return diff;
        }
    }
}
//Code from Josh
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class Cost {
//    HashMap<String, Item> hs;
//    ArrayList<Item> al;
//    int SmallestWaste;
//
//    public Cost() {
//        this.hs = new HashMap<String, Item>();
//        this.al = new ArrayList<Item>();
//    }
//
//    public void addItem(String name, int cost) {
//        Item it = new Item(name, cost);
//        hs.put(name, it);
//        al.add(it);
//    }
//
//    public int voucherWaste(int value) {
//        SmallestWaste = value;
//        int[] priceList = new int[al.size()];
//        for (int i = 0; i < al.size(); i++) {
//            priceList[i] = al.get(i).cost;
//        }
//        buyToEnd(priceList, 0, value);
//        System.out.println(SmallestWaste);
//        return SmallestWaste;
//
//        /*
//         * Every product have two filed:
//         *   1. how many can the voucher buy?
//         *   2. how much money left?
//         * */
//    }
//
//    public void buyToEnd(int prices[], int i, int leftMoney) {
//        if (this.SmallestWaste == 0) {
//            return;
//        }
//        System.out.println("i:" + i + " leftMoney:" + leftMoney);
//        if (i == prices.length - 1) {
//            if (this.SmallestWaste > leftMoney % prices[i]) {
//                this.SmallestWaste = leftMoney % prices[i];
//            }
//            return;
//        }
//        for (int j = leftMoney / prices[i]; j >= 0; j--) {
//            int nextLeft = leftMoney - prices[i] * j;
//            buyToEnd(prices, i + 1, nextLeft);
//        }
//    }
//
//    public static void main(String[] args) {
//        Cost cost = new Cost();
//        cost.addItem("A", 243);
//        cost.addItem("B", 401);
//        cost.addItem("C", 245);
//        cost.addItem("D", 1004);
//        cost.addItem("E", 297);
//        cost.voucherWaste(2007);
//    }
//
//    public void printCost() {
//        al.sort(Item::compareTo);
//        for (Item item : al) {
//            System.out.println(item.toString());
//        }
//    }
//
//
//
//
//    public class Item implements Comparable<Item> {
//        String name;
//        int cost;   // in cents
//
//        public Item(String n, int c) {
//            name = n;
//            cost = c;
//        }
//
//        public String toString() {
//            return name + " " + cost;
//        }
//
//        public int compareTo(Item item) {
//            return this.cost - item.cost;
//        }
//    }
//}
//code from Harvey

//package comp1110.homework.J14;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//
//public class Cost {
//    HashMap<String, Item> table = new HashMap<>();
//
//    public void addItem(String name, int cost) {
//        Item item = new Item(name, cost);
//        table.put(name, item);
//    }
//
//    //Search Table
//    int voucherWaste(int value) {
//        ArrayList<Integer> costTable = new ArrayList();
//        ArrayList<Integer> caculateTable = new ArrayList();
//        int minValue = 0;
//        boolean isFirstEnter = true;
//        for (String key : table.keySet()) {
//            int cost = table.get(key).cost;
//            if (isFirstEnter) {
//                minValue = cost;
//                isFirstEnter = false;
//            }
//
//            if (minValue > cost)
//                minValue = cost;
//
//            costTable.add(cost);
//        }
//
//        if (minValue > value) {
//            return value;
//        }
//
//        for (int j = 0; j < costTable.size(); j++) {
//            caculateTable.add(costTable.get(j));
//        }
//        System.out.println("enter");
//        int i = 0;
//        isFirstEnter = true;
//        int minCost = 0;
//
//        while (caculateTable.size() > 0) {
//            for (int j = 0; j < costTable.size(); j++) {
//                int price = caculateTable.get(0) + costTable.get(j);
//                if (price < value) {
//                    caculateTable.add(price);
//                } else {
//                    if (isFirstEnter) {
//                        minCost = value - caculateTable.get(0);
//                        isFirstEnter = false;
//                    } else if (minCost > (value - caculateTable.get(0))) {
//                        minCost = value - caculateTable.get(0);
//                    }
//                }
//            }
//            caculateTable.remove(0);
//        }
//
//        return minCost;
//    }
//
//    public void printCost() {
//        StringBuilder sb = new StringBuilder();
//        ArrayList<Item> list = new ArrayList<>();
//
//        for (String key : table.keySet()) {
//            list.add(table.get(key));
//        }
//    }
//}
//
