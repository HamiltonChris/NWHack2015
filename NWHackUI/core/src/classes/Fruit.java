package classes;

public class Fruit extends Item {
    private int heals;

    public Fruit() {
        super.setName("Apple");
        super.setTotal(1);
        setHeals(4);
    }

    public Fruit(String name) {
        super.setName(name);
        super.setTotal(1);
        setHeals(4);
    }

    public void heal(Avatar dude) {
        dude.heal(heals);
        super.useOne();
    }

    public void setHeals(int fred) {
        heals = fred;
    }

    public int getHeals() {
        return heals;
    }
}
