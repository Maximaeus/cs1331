package PokemonGame;

/**
 * Represents categories that a Pokemon Species may fall into
 *
 * @author jmurphy61
 * @version 1.0
 *
 */
public enum Category {
    SEED ("Seed"),
    LIZARD ("Lizard"),
    FLAME ("Flame"),
    TINY_TURTLE ("Tiny Turtle"),
    TURTLE ("Turtle"),
    SHELLFISH ("Shellfish"),
    WORM ("Worm"),
    COCOON ("Cocoon"),
    BUTTERFLY ("Butterfly"),
    HAIRY_BUG ("Hairy Bug"),
    POISON_BEE ("Poison Bee"),
    TINY_BIRD ("Tiny Bird"),
    BIRD ("Bird"),
    MOUSE ("Mouse"),
    BEAK ("Beak"),
    SNAKE ("Snake"),
    COBRA ("Cobra"),
    POISON_PIN ("Poison Pin"),
    DRILL ("Drill"),
    FAIRY ("Fairy"),
    FOX ("Fox"),
    BALLOON ("Balloon"),
    BAT ("Bat"),
    WEED ("Weed"),
    FLOWER ("Flower"),
    MUSHROOM ("Mushroom"),
    INSECT ("Insect"),
    POISON_MOTH ("Poison Moth"),
    MOLE ("Mole"),
    SCRATCH_CAT ("Scratch Cat"),
    CLASSY_CAT ("Classy Cat"),
    DUCK("Duck"),
    PIG_MONKEY ("Pig Monkey"),
    PUPPY ("Puppy"),
    LEGENDARY ("Legendary"),
    TADPOLE ("Tadpole"),
    PSI ("Psi"),
    SUPERPOWER ("Superpower"),
    FLYCATCHER ("Flycatcher"),
    JELLYFISH ("Jellyfish"),
    ROCK ("Rock"),
    MEGATON ("Megaton"),
    FIRE_HORSE ("Fire Horse"),
    DOPEY ("Dopey"),
    HERMIT_CRAB ("Hermit Crab"),
    MAGNET ("Magnet"),
    WILD_DUCK ("Wild Duck"),
    TWIN_BIRD ("Twin Bird"),
    TRIPLE_BIRD ("Triple Bird"),
    SEA_LION ("Sea Lioin"),
    SLUDGE ("Sludge"),
    BIVALVE ("Bivalve"),
    GAS ("Gas"),
    SHADOW ("Shadow"),
    ROCK_SNAKE ("Rock Snake"),
    HYPNOSIS ("Hypnosis"),
    RIVER_CRAB ("River Crab"),
    PINCER ("Pincer"),
    BALL ("Ball"),
    EGG ("Egg"),
    COCONUT ("Coconut"),
    LONELY ("Lonely"),
    BONE_KEEPER ("Bone Keeper"),
    KICKING ("Kicking"),
    PUNCHING ("Punching"),
    LICKING ("Licking"),
    POISON_GAS ("Poison Gas"),
    SPIKES ("Spikes"),
    VINE ("Vine"),
    PARENT ("Parent"),
    DRAGON ("Dragon"),
    GOLDFISH ("Goldfish"),
    STAR_SHAPE ("Star Shape"),
    MYSTERIOUS ("Mysterious"),
    BARRIER ("Barrier"),
    MANTIS ("Mantis"),
    HUMAN_SHAPE ("Human Shape"),
    ELECTRIC ("Electric"),
    SPITFIRE ("Spitfire"),
    STAG_BEETLE ("Stag Beetle"),
    WILD_BULL ("Wild Bull"),
    FISH ("Fish"),
    ATROCIOUS ("Atrocious"),
    TRANSPORT ("Transport"),
    TRANSFORM ("Transform"),
    EVOLUTION ("Evolution"),
    BUBBLE_JET ("Bubble Jet"),
    LIGHTNING ("Lightning"),
    VIRTUAL ("Virtual"),
    SPIRAL ("Spiral"),
    FOSSIL ("Fossil"),
    SLEEPING ("Sleeping"),
    FREEZE ("Freeze"),
    GENETIC ("Genetic");

    private final String stringVersion;

    /**
     * Private constructor
     *
     * @param stringVersion stringVersion version of this Category
     *
     */
    private Category(String stringVersion){
        this.stringVersion = stringVersion;
    }

    @Override
    public String toString() {
        return stringVersion;
    }
}