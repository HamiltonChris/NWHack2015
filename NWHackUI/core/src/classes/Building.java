package classes;

public class Building {
    private String name;
    private int health;
    private int maxHealth;

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getMaxHealth() {
        return maxHealth;
    }

    public void setName(String fred) {
        name = fred;
    }
    public void setHealth(int fred) {
        health = fred;
    }
    public void setMaxHealth(int fred) {
        maxHealth = fred;
    }

    public Building() {
    }
}
