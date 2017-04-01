/**
 * Represents a Monster card that can attack other
 * monster cards.
 *
 * @author jmurphy61
 * @version 1.0
 */
public class MonsterCard extends Card {
    private int power, basePower;
    private boolean canAttack;

    /**
     * Creates a MonsterCard with passed parameters,
     * with canAttack set to false
     *
     * @param name name of the MonsterCard
     * @param description text that explains
     * the MonsterCard and its effects
     * @param power current power of this MonsterCard
     *
     */
    public MonsterCard(String name,
                       String description,
                       int power) {
        this(name, description, power, false);
    }

    /**
     * Creates a MonsterCard with passed parameters
     *
     * @param name name of the MonsterCard
     * @param description text that explains
     * the MonsterCard and its effects
     * @param power current power of this MonsterCard
     * @param canAttack whether or not this MonsterCard
     * can still attack this turn
     *
     */
    public MonsterCard(String name,
                       String description,
                       int power,
                       boolean canAttack) {
        super(name, description);
        this.power = power;
        this.canAttack = canAttack;
    }

    /**
     * Sets the power of this MonsterCard equal to the passed parameter
     *
     * @param power new power of for this MonsterCard
     *
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * Sets the basePower of this MonsterCard equal ot the passed parameter
     *
     * @param basePower new basePower for this MonsterCard
     *
     */
    public void setBasePower(int basePower) {
        this.basePower = basePower;
    }

    /**
     * Sets whether this MonsterCard can attack this turn
     *
     * @param canAttack the new ability for this MonsterCard to attack
     *
     */
    public void setCanAttack(boolean canAttack) {
        this.canAttack = canAttack;
    }

    /**
     * @return the power of this MonsterCard
     *
     */
    public int getPower() {
        return power;
    }

    /**
     * @return the basePower of this MonsterCard
     *
     */
    public int getBasePower() {
        return basePower;
    }

    /**
     * @return the ability of this MonsterCard to attack this turn
     *
     */
    public boolean getCanAttack() {
        return canAttack;
    }

    @Override
    public boolean equals(Object other) {
        return super.equals(other)
            && other instanceof MonsterCard
            && getPower() == ((MonsterCard) other).getPower()
            && getBasePower() == ((MonsterCard) other).getBasePower();
    }

    @Override
    public String toString() {
        return super.toString()
            + " | Power: " + getPower()
            + " | Can attack: " + getCanAttack();
    }
}
