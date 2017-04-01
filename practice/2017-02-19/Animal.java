import java.util.Random;

public class Animal {
    private String name;
    private int hitPoints;
    private int maxHitPoints;
    private boolean knockedOut;
    private int attackDamage;
    private int accuracy;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxHitPoints() {
        return maxHitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public boolean isKnockedOut() {
        return knockedOut;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void healHitPoints(int amount) {
        if ((hitPoints + amount) > maxHitPoints) {
            hitPoints = maxHitPoints;
        } else {
            hitPoints += amount;
        }
    }

    public String speak() {
        return "Animal sound";
    }

    public boolean dealDamage(Animal other) {
        if 
    }   

    public void takeDamage(int damage) {
        
    }
}
