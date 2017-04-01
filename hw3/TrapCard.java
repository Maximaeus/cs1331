/**
 * Represents a trap card that has an instant effect
 *
 * @author jmurphy61
 * @version 1.0
 *
 */
public abstract class TrapCard extends Card implements Special {

    /**
     * Creates a TrapCard with the passed parameters
     *
     * @param name name of this TrapCard
     * @param description text that explains the card and its effects
     *
     */
    public TrapCard(String name, String description) {
        super(name, description);
    }

    @Override
    public boolean equals(Object other) {
        return super.equals(other)
            && other instanceof TrapCard;
    }
}
