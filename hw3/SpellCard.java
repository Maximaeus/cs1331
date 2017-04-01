/**
 * Represents a spell card with an effect per turn
 * and an effect upon destruction
 *
 * @author jmurphy61
 * @version 1.0
 */
public abstract class SpellCard extends Card {

    /**
     * Constructs a new spell card with name and description
     * then puts in on a field
     *
     * @param name name of this SpellCard
     * @param description text that explains the card and its effects
     *
     */
    public SpellCard(String name,
                     String description) {
        super(name, description);
    }

    /**
     * Activates an effect that is to be applied every turn
     *
     * @param ownerField Field of the Player that used this card
     * @param enemyField Field of the opponent of the Player that used this card
     *
     */
    public abstract void turnEffect(Field ownerField,
                                     Field enemyField);

    /**
     * Activates an effect gets applied when this SpellCard is destroyed
     *
     * @param ownerField Field of the Player that used this card
     * @param enemyField Field of the opponent of the Player that used this card
     *
     */
    public abstract void destroyedEffect(Field ownerField,
                                          Field enemyField);

    @Override
    public boolean equals(Object other) {
        return super.equals(other)
            && other instanceof SpellCard;
    }
}
