/**
 * Represents an Athlete that can play sports at the Olympics!
 *
 * This class violated the single responsibility princinple by
 * having too many instance variables and methods that were beyond
 * the scope of simply being an athlete. To fix it, I made Athlete
 * abstract, added several classes to represent each type of athlete,
 * then moved the specific instance variables and getter methods to
 * those classes.
 *
 * @author jmurphy61
 * @version 2.0
 *
 */
public abstract class Athlete {
    private int hunger;
    private String name;
    private boolean isACheater;

    /**
     * Public constructor.
     *
     * @param name the name of the athlete.
     * @param isACheater if this athlete is a cheater or not.
     *
     */
    public Athlete(String name, boolean isACheater) {
        this.hunger = 0;
        this.name = name;
        this.isACheater = isACheater;
    }

    /**
     * @return the hunger of this athlete.
     *
     */
    public int getHunger() {
        return this.hunger;
    }

    /**
     * @return the name of this athlete.
     *
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return whether or not this athlete is a cheater.
     */
    public boolean getIsACheater() {
        return this.isACheater;
    }

    /**
     * Has the athlete exercise. Will make the athlete hungry by increasing
     * their hunger by the number of pushups.
     *
     * @param numberOfPushups the number of pushups the athlete should do.
     *
     */
    public void exercise(int numberOfPushups) {
        System.out.println(String.format("%s does %d pushups and works up"
            + " quite an appetite!", getName(), numberOfPushups));
        this.hunger += numberOfPushups;
    }

    /**
     * Has the athlete eat some food to decrease their hunger by foodAmount.
     *
     * @param foodAmount how much to decrease hunger by.
     * @param foodType the type of food the athlete eats.
     *
     */
    public void eat(int foodAmount, String foodType) {
        System.out.println(String.format("%s eats %d of the %s!",
            getName(), foodAmount, foodType));
        this.hunger = Math.max(this.hunger - foodAmount, 0);
    }

    /**
     * Has the athlete play something for their particular sport.
     *
     */
    public abstract void play();

    /**
     * Athlete plays a game, and prints out a message if they won or
     * lost.
     *
     */
    public void playGame() {
        this.play();
        if (this.getHunger() <= 15) {
            System.out.println(this.getName() + " won!");
        } else {
            System.out.println(this.getName() + " lost!");
        }
    }
}
