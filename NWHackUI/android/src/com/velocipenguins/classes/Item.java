package com.velocipenguins.classes;

public class Item {
    private String name;
    private int total;

    public Item() {}

    public Item(String fred) {
        name = fred;
        total = 1;
    }

    public String getName() {
        return name;
    }
    public int getTotal() {
        return total;
    }

    public void setName(String fred) {
        name = fred;
    }
    public void setTotal(int fred) {
        total = fred;
    }

    public void addOne() {
        total += 1;
    }
    public void useOne() {
        total -= 1;
    }
}
