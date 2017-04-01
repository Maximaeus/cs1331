/**
 * Represents a ProSitter whose iron buns have been forged in the
 * fires of Mt. Gluteus, which allows them to endure the harshest
 * chairs of Skiles, Howey, ANYWHERE.
 *
 * @author jmurphy61
 * @version 1.0
 *
 */
public class ProSitter extends Athlete {
    private double buttEndurance;

    /**
     * Public constructor
     *
     * @param name the name of this ProSitter
     * @param isACheater whether or not this ProSitter is a cheater
     * @param buttEndurance butt endurance (in days) of this
     * ProSitter
     *
     */
    public ProSitter(String name, boolean isACheater,
                     double buttEndurance) {
        super(name, isACheater);
        this.buttEndurance = buttEndurance;
    }

    /**
     * @return the butt endurance (in days) of this ProSitter
     *
     */
    public double getButtEndurance() {
        return this.buttEndurance;
    }

    @Override
    public void play() {
        System.out.println(String.format("%s managed to sit for "
            + "%.2f days straight!",
            this.getName(),
            this.getButtEndurance()));
    }
}
