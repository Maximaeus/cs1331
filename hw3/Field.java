/**
 * Represent's a single player's side of the game field
 *
 * @author jmurphy61
 * @version 1.0
 *
 */
public class Field {
    private MonsterCard[] monsters = new MonsterCard[5];
    private SpellCard[] spells = new SpellCard[5];

    /**
     * @return a list of MonsterCards currently on this Field
     *
     */
    public MonsterCard[] getMonsters() {
        return monsters;
    }

    /**
     * @return a list of SpellCards currently on this Field
     *
     */
    public SpellCard[] getSpells() {
        return spells;
    }

    /**
     * Activates all SpellCard turn effects on this field
     * and makes MonsterCard able to attack
     *
     */
    public void cardTurnEffects(Field enemyField) {
        for (SpellCard spellCard : spells) {
            if (spellCard != null) {
                spellCard.turnEffect(this, enemyField);
            }
        }
        for (MonsterCard monsterCard : monsters) {
            if (monsterCard != null) {
                monsterCard.setCanAttack(true);
            }
        }
    }

    /**
     * Attemps to a MonsterCard to this Field
     *
     * @param card MonsterCard to be added to this Field
     * @return whether true if there is a space on the field
     * and a MonsterCard is added
     * false if field is full
     *
     */
    public boolean addMonsterCard(MonsterCard card) {
        for (int i = 0; i < 5; i++) {
            if (monsters[i] == null) {
                monsters[i] = card;
                return true;
            }
        }
        return false;
    }

    /**
     * Attempts to add a SpellCard to this Field
     *
     * @param card SpellCard to be added to this Field
     * @return whether true if there is a space on the field
     * and a MonsterCard is added
     * false if field is full
     *
     */
    public boolean addSpellCard(SpellCard card) {
        for (int i = 0; i < 5; i++) {
            if (spells[i] == null) {
                spells[i] = card;
                return true;
            }
        }
        return false;
    }
}
