package PokemonGame;

public enum PkmnMoveActionType{
    PHYSICAL("Physical"),
    SPECIAL("Special"),
    STATUS("Status");

    private String stringVersion;

    PkmnMoveActionType(String stringVersion) {
        this.stringVersion = stringVersion;
    }

    @Override
    public String toString() {
        return this.stringVersion;
    }
}
