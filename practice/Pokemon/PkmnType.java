package PokemonGame;

/**
 * Represents a Pokemon type
 *
 * @author jmurphy61
 * @version 1.0
 *
 */
public enum PkmnType {
    NORMAL("Normal"),
    FIGHT("Fighting"),
    FLYING("Flying"),
    POISON("Poison"),
    GROUND("Ground"),
    ROCK("Rock"),
    BUG("Bug"),
    GHOST("Ghost"),
    STEEL("Steel"),
    FIRE("Fire"),
    WATER("Water"),
    GRASS("Grass"),
    ELECTR("Electric"),
    PSYCHIC("Psychic"),
    ICE("Ice"),
    DRAGON("Dragon"),
    DARK("Dark");

    static {
        NORMAL.dealsDoubleDamageTo
            = new PkmnType[]{};
        NORMAL.dealsHalfDamageTo
            = new PkmnType[]{ROCK};
        NORMAL.dealsNoDamageTo
            = new PkmnType[]{GHOST};

        FIGHT.dealsDoubleDamageTo
            = new PkmnType[]{NORMAL,
                             ROCK,
                             STEEL,
                             ICE,
                             DARK};
        FIGHT.dealsHalfDamageTo
            = new PkmnType[]{FLYING,
                             POISON,
                             BUG,
                             PSYCHIC};
        FIGHT.dealsNoDamageTo
            = new PkmnType[]{GHOST};

        FLYING.dealsDoubleDamageTo
            = new PkmnType[]{FIGHT,
                             BUG,
                             GRASS};
        FLYING.dealsHalfDamageTo
            = new PkmnType[]{ROCK,
                             STEEL,
                             ELECTR};
        FLYING.dealsNoDamageTo
            = new PkmnType[]{};

        POISON.dealsDoubleDamageTo
            = new PkmnType[]{GRASS};
        POISON.dealsHalfDamageTo
            = new PkmnType[]{POISON,
                             GROUND,
                             ROCK,
                             GHOST};
        POISON.dealsNoDamageTo
            = new PkmnType[]{STEEL};

        GROUND.dealsDoubleDamageTo
            = new PkmnType[]{POISON,
                             ROCK,
                             STEEL,
                             FIRE,
                             ELECTR};
        GROUND.dealsHalfDamageTo
            = new PkmnType[]{BUG,
                             GRASS};
        GROUND.dealsNoDamageTo
            = new PkmnType[]{FLYING};

        ROCK.dealsDoubleDamageTo
            = new PkmnType[]{FLYING,
                             BUG,
                             FIRE,
                             ICE};
        ROCK.dealsHalfDamageTo
            = new PkmnType[]{FIGHT,
                             GROUND,
                             STEEL};
        ROCK.dealsNoDamageTo
            = new PkmnType[]{};

        BUG.dealsDoubleDamageTo
            = new PkmnType[]{GRASS,
                             PSYCHIC,
                             DARK};
        BUG.dealsHalfDamageTo
            = new PkmnType[]{FIGHT,
                             FLYING,
                             POISON,
                             GHOST,
                             STEEL,
                             FIRE};
        BUG.dealsNoDamageTo
            = new PkmnType[]{};

        GHOST.dealsDoubleDamageTo
            = new PkmnType[]{GHOST,
                             PSYCHIC};
        GHOST.dealsHalfDamageTo
            = new PkmnType[]{STEEL,
                             DARK};
        GHOST.dealsNoDamageTo
            = new PkmnType[]{NORMAL};

        STEEL.dealsDoubleDamageTo
            = new PkmnType[]{ROCK,
                             ICE};
        STEEL.dealsHalfDamageTo
            = new PkmnType[]{STEEL,
                             FIRE,
                             WATER,
                             ELECTR};
        STEEL.dealsNoDamageTo
            = new PkmnType[]{};

        FIRE.dealsDoubleDamageTo
            = new PkmnType[]{BUG,
                             STEEL,
                             GRASS,
                             ICE};
        FIRE.dealsHalfDamageTo
            = new PkmnType[]{ROCK,
                             FIRE,
                             WATER,
                             DRAGON};
        FIRE.dealsNoDamageTo
            = new PkmnType[]{};

        WATER.dealsDoubleDamageTo
            = new PkmnType[]{GROUND,
                             ROCK,
                             FIRE};
        WATER.dealsHalfDamageTo
            = new PkmnType[]{WATER,
                             GRASS,
                             DRAGON};
        WATER.dealsNoDamageTo
            = new PkmnType[]{};

        GRASS.dealsDoubleDamageTo
            = new PkmnType[]{GROUND,
                         ROCK,
                         WATER};
        GRASS.dealsHalfDamageTo
            = new PkmnType[]{FLYING,
                             POISON,
                             BUG,
                             STEEL,
                             FIRE,
                             GRASS,
                             DRAGON};
        GRASS.dealsNoDamageTo
            = new PkmnType[]{};

        ELECTR.dealsDoubleDamageTo
            = new PkmnType[]{FLYING,
                            WATER};
        ELECTR.dealsHalfDamageTo
            = new PkmnType[]{GRASS,
                            ELECTR};
        ELECTR.dealsNoDamageTo
            = new PkmnType[]{GROUND};

        PSYCHIC.dealsDoubleDamageTo
            = new PkmnType[]{FIGHT,
                             POISON};
        PSYCHIC.dealsHalfDamageTo
            = new PkmnType[]{STEEL,
                             PSYCHIC};
        PSYCHIC.dealsNoDamageTo
            = new PkmnType[]{DARK};

        ICE.dealsDoubleDamageTo
            = new PkmnType[]{FLYING,
                             ICE,
                             GRASS,
                             DRAGON};
        ICE.dealsHalfDamageTo
            = new PkmnType[]{STEEL,
                             FIRE,
                             WATER,
                             ICE};
        ICE.dealsNoDamageTo
            = new PkmnType[]{};

        DRAGON.dealsDoubleDamageTo
            = new PkmnType[]{DRAGON};
        DRAGON.dealsHalfDamageTo
            = new PkmnType[]{STEEL};
        DRAGON.dealsNoDamageTo
            = new PkmnType[]{};

        DARK.dealsDoubleDamageTo
            = new PkmnType[]{GHOST,
                             PSYCHIC
                             };
        DARK.dealsHalfDamageTo
            = new PkmnType[]{FIGHT,
                             STEEL,
                             DARK
                             };
        DARK.dealsNoDamageTo
            = new PkmnType[]{};
    }

    private String stringVersion;
    private PkmnType[] dealsDoubleDamageTo;
    private PkmnType[] dealsHalfDamageTo;
    private PkmnType[] dealsNoDamageTo;

    PkmnType(String stringVersion) {
        this.stringVersion = stringVersion;
    }

    @Override
    public String toString() {
        return stringVersion;
    }
}