package classes;

public class Grass extends Building {
    private int colour; // the colour of the grass. dependent on health

    public Grass() {
        super.setHealth(3);
        super.setMaxHealth(5);
        colour = 3;
    }

    public int getColour() {
        return colour;
    }

    public void setColour(int fred) {
        colour = fred;
    }

    public void damage() {
        int current = super.getHealth();
        if (current <= 0) {
            //go to concrete
        } else {
            super.setHealth(super.getHealth() - 1);
            colour--;
        }
    }

    public void heal() {
        int current = super.getHealth();
        if (current >= super.getMaxHealth()) {
            super.setHealth(super.getMaxHealth());
        } else {
            super.setHealth(super.getHealth() + 1);
            colour++;
        }
    }
}
