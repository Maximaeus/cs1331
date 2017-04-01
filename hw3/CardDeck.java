/**
 * Represents a deck of Duel Monsters cards
 *
 * @author jmurphy61
 * @version 1.0
 *
 */
public class CardDeck extends ObjectDeck {

    /**
     * Creates a CardDeck with a variable number of Cards
     *
     * @param cards a variable number of cards to be placed in the deck
     *
     */
    public CardDeck(Card ... cards) {
        super(cards);
    }

    @Override
    public Card deal() {
        return (Card) super.deal();
    }
}
