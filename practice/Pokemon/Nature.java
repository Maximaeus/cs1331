package PokemonGame;

/**
 * Represents the nature of a Pokemon;
 * Contains stat modifiers and flavor preferences.
 *
 * @author jmurphy61
 * @version 1.0
 *
 */
public enum Nature {
    HARDY (null, null, 1.0, 1.0, 1.0, 1.0, 1.0),
    LONELY (Flavor.SPICY, Flavor.SOUR, 1.1, 0.9, 1.0, 1.0, 1.0),
    BRAVE (Flavor.SPICY, Flavor.SWEET, 1.1, 1.0, 1.0, 1.0, 0.9),
    ADAMANT (Flavor.SPICY, Flavor.DRY, 1.1, 1.0, 0.9, 1.0, 1.0),
    NAUGHTY (Flavor.SPICY, Flavor.BITTER, 1.1, 1.0, 1.0, 0.9, 1.0),
    BOLD (Flavor.SOUR, Flavor.SPICY, 0.9, 1.1, 1.0, 1.0, 1.0),
    DOCILE (null, null, 1.0, 1.0, 1.0, 1.0, 1.0),
    RELAXED (Flavor.SOUR, Flavor.SWEET, 1.0, 1.1, 1.0, 1.0, 0.9),
    IMPISH (Flavor.SOUR, Flavor.DRY, 1.0, 1.1, 0.9, 1.0, 1.0),
    LAX (Flavor.SOUR, Flavor.BITTER, 1.0, 1.1, 1.0, 0.9, 1.0),
    TIMID (Flavor.SWEET, Flavor.SPICY, 0.9, 1.0, 1.0, 1.0, 1.1),
    HASTY (Flavor.SWEET, Flavor.SOUR, 1.0, 0.9, 1.0, 1.0, 1.1),
    SERIOUS (null, null, 1.0, 1.0, 1.0, 1.0, 1.0);

    private double[] multipliers = new double[5];
    private Flavor likedFlavor;
    private Flavor dislikedFlavor;

    Nature(Flavor likedFlavor, Flavor dislikedFlavor, double ... multipliers) {
        this.likedFlavor = likedFlavor;
        this.dislikedFlavor = dislikedFlavor;
        this.multipliers = multipliers;
    }
}
