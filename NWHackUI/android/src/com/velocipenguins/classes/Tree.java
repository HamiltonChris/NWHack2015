package com.velocipenguins.classes;

public class Tree extends Building {
    private Fruit item;

    public Tree() {
        item = new Fruit();
        super.setMaxHealth(10);
        super.setHealth(10);
    }

    public void setItem(Fruit fred) {
        item = fred;
    }

    public Fruit getItem() {
        return item;
    }

    public Fruit spawn() {
        return item;
    }
}
