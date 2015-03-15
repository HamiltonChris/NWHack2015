package com.velocipenguins.classes;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class Avatar {
    private String name; // name of dude
    private int level; // level of dude
    private int health; // health of dude
    private int maxHealth; // maximum health of dude
    private int exp; // experience of dude
    private int maxExp; // experience needed for next level
    private List<Item> inventory;

    public Avatar(String dude) {
        setName(dude);
        setLevel(1);
        setHealth(10);
        setMaxHealth(10);
        setExp(0);
        setMaxExp(10);
        inventory = new ArrayList<Item>(0);
    }

    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public int getHealth() {
        return health;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public int getExp() {
        return exp;
    }
    public int getMaxExp() {
        return maxExp;
    }
    public List<Item> getInventory() {
        return inventory;
    }

    public void setName(String fred) {
        name = fred;
    }
    public void setLevel(int fred) {
        level = fred;
    }
    public void setHealth(int fred) {
        health = fred;
    }
    public void setMaxHealth(int fred) {
        maxHealth = fred;
    }
    public void setExp(int fred) {
        exp = fred;
    }
    public void setMaxExp(int fred) {
        maxExp = fred;
    }
    public void setInventory(List<Item> things) {
        inventory = things;
    }

    public void expUp(int experience) {
        int fred = calExp(experience);
        exp += fred;
        if (exp >= maxExp) {
            level++;
            exp = 0;
            maxExp += 10;
            maxHealth += 15;
            health = maxHealth;
        }
    }

    public void damage(int loss) {
        int fred = calDam(loss);
        health -= fred;
        if (health <= 0 && level > 1) {
            level--;
            exp = 0;
            maxExp -= 10;
            maxHealth -= 15;
            health = maxHealth;
        } else if (health <= 0 && level == 1) {
            exp = 0;
            health = maxHealth - 3;
        }
    }

    public void heal(int gain) {
        health += gain;
        if (health > maxHealth) {
            health = maxHealth;
        }
    }

    private int calDam(int loss) {
        return loss * level;
    }

    private int calExp(int gain) {
        return gain;
    }

    public void addInv(String fred) {
        boolean found = false;
        for (Item i: inventory) {
            if (i.getName().equals(fred)) {
                i.addOne();
                found = true;
                break;
            }
        }
        if (!found) {
            inventory.add(new Item(fred));
        }
    }
}
