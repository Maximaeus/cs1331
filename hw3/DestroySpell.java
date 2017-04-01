/**
 * Represents a TrapCard that has the ability to destroy an opponent's
 * SpellCard
 *
 * @author jmurphy61
 * @version 1.0
 *
 */
public class DestroySpell extends TrapCard {
    /**
     * Creates a DestroySpell with
     * name "Destroy Spell",
     * and description "Destroys the enemy's first SpellCard
     *
     */
    public DestroySpell() {
        super("Destroy Spell",
              "Destroys the enemy's first SpellCard");
    }

    /**
     * Looks for the first SpellCard on the enemy's Field,
     * then destroys that card.
     *
     * @param ownerField Field of this Card's owner
     * @param enemyField Field of the owner's enemy
     *
     */
    public void instantEffect(Field ownerField,
                              Field enemyField) {
        SpellCard[] spells = enemyField.getSpells();
        boolean notFound = true;
        int index = 0;
        while (notFound) {
            if (spells[index] != null) {
                spells[index] = null;
                notFound = false;
            }
            index++;
        }
    }
}
