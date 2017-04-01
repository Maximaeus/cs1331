/**
 * Describes a Special card
 *
 * @author jmurphy61
 * @version 1.0
 *
 */
public interface Special {

    /**
     * Applies the effect of a card to the Fields passed as parameters
     *
     * @param owner the casting Player's Field
     * @param enemy the casting Player's opponent's Field
     *
     */
    void instantEffect(Field owner, Field enemy);
}
