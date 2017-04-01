/**
 * Represents a Blue Eyes White Dragon monster
 * that has a Special effect
 *
 * @author jmurphy61
 * @version 1.0
 *
 */
public class BlueEyesWhiteDragon extends MonsterCard
    implements Special {

    /**
     * Creates a BlueEyesWhiteDragon with
     * name "Blue Eyes White Dragon",
     * description "The best card."
     * 3000 power,
     * and that has the ability to attack
     *
     */
    public BlueEyesWhiteDragon() {
        super("Blue Eyes White Dragon",
              "The best card.",
              3000,
              true);
    }

    /**
     * Adds up to two other BlueEyesWhiteDragons the owner's
     * Field
     *
     * @param owner Field of the owner of this BlueEyesWhiteDragon
     * @param enemy Field of the owner's enemy
     *
     */
    public void instantEffect(Field owner, Field enemy) {
        owner.addMonsterCard(new BlueEyesWhiteDragon());
        owner.addMonsterCard(new BlueEyesWhiteDragon());
    }
}
