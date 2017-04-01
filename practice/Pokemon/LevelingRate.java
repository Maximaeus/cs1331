package PokemonGame;

public enum LevelingRate {
    ERRATIC("Erratic"),
    FAST("Fast"),
    MEDIUM_FAST("Medium Fast"),
    MEDIUM_SLOW("Medium Slow"),
    SLOW("Slow"),
    FLUCTUATING("Fluctuating");

    private String stringVersion;

    LevelingRate(String stringVersion) {
        this.stringVersion = stringVersion;
    }

    @Override
    public String toString() {
        return this.stringVersion;
    }
    // Add methods that calculate EXP needed for next level
    // based on passed parameter
}
