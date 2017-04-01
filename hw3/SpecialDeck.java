/**
 * Represents a deck of Specials
 *
 *@author jmurphy61
 *@version 1.0
 */
public class SpecialDeck extends ObjectDeck {

    /**
     * Creates a new Special deck with variable amount of Cards
     *
     * @param cards a variable amount of Cards that will
     * make up the deck
     *
     */
    public SpecialDeck(Card ... cards) {
        super(cards);
    }

    @Override
    public Card deal() {
        return (Card) super.deal();
    }
}
