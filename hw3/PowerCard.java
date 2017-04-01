/**
 * Represents a SpellCard that increases the power of MonsterCards
 * on its owner's Field each turn, or decreases their power once
 * destroyed
 *
 * @author jmurphy61
 * @version 1.0
 *
 */
public class PowerCard extends SpellCard {
    /**
     * Creates a PowerCard with
     * name "Power Card",
     * and description "Increases power of monsters by 100 each turn."
     *
     */
    public PowerCard() {
        super("Power Card",
              "Increases power of monsters by 100 each turn.");
    }

    /**
     * Increases power of MonsterCards on the owner's Field by 100
     *
     * @param ownerField Field of this Card's owner
     * @param enemyField Field of owner's opponent
     *
     */
    public void turnEffect(Field ownerField,
                           Field enemyField) {
        for (MonsterCard monster : ownerField.getMonsters()) {
            if (monster != null) {
                monster.setPower(monster.getPower() + 100);
            }
        }
    }

    /**
     * Decreases power of MonsterCards on this onwer's Field by 300
     *
     * @param ownerField Field of this Card's owner
     * @param enemyField Field of owner's enemy
     *
     */
    public void destroyedEffect(Field ownerField,
                                Field enemyField) {
        for (MonsterCard monster : ownerField.getMonsters()) {
            if (monster != null) {
                monster.setPower(monster.getPower() - 300);
            }
        }
    }
}
