package PokemonGame;

public abstract class Ability {
    private String name;
    private String description;

    Ability(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.description;
    }
}