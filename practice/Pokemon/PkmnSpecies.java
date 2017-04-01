package PokemonGame;

public enum PkmnSpecies {
    BULBASAUR("Bulbasaur", // String name
              Category.SEED, //Category category
              new PkmnType[]{PkmnType.GRASS, PkmnType.POISON},
              new PkmnEggGroup[]{}, // PkmnEggGroup[] pkmnEggGroup
              new Ability[]{},
              new PkmnMove[]{},
              new byte[]{1}, //byte[] learnLevels
              new PkmnMove[]{},
              new PkmnMove[]{},
              new PkmnMove[]{},
              LevelingRate.MEDIUM_SLOW,
              Utils.b(22),
              Utils.b(70),
              Utils.bArr(new int[]{45,49,49,65,65,45}),
              Utils.bArr(new int[]{0,0,0,1,0,0}),
              Utils.b(16),
              Utils.b(223),
              Utils.b(45));
    // SPECIES("", //String name
    //         Category., //Category category
    //         new PkmnType[]{PkmnType., PkmnType.}, //PkmnType[] pkmnType
    //         new PkmnEggGroup[]{}, //PkmnEggGroup[] pkmnEggGroup
    //         new Ability[]{}, //Ability[] abilities
    //         new PkmnMove[]{}, //PkmnMove[] pkmnMovesLearnableByLeveling
    //         new byte[]{1}, //byte[] learnLevels
    //         new PkmnMove[]{},  //PkmnMove[] pkmnMovesLearnableByTMHM
    //         new PkmnMove[]{}, //PkmnMove[] pkmnMovesLearnableByTutor
    //         new PkmnMove[]{}, //PkmnMove[] eggPkmnMoves
    //         LevelingRate., //LevelingRate levelingRate
    //         Utils.b(), //byte baseEggCycles
    //         Utils.b(), //byte baseFriendship
    //         Utils.bArr(new int[]{}), //byte[] baseStats
    //         Utils.bArr(new int[]{}), //byte[] evYields
    //         Utils.b(), //byte evolvesAtLevel
    //         Utils.b(), //byte genderThreshold
    //         Utils.b()); //byte catchRate

    private String name;
    private Category category;
    private PkmnSpecies evolvesInto;
    private PkmnType[] pkmnType;
    private PkmnEggGroup[] pkmnEggGroup;
    private Ability[] abilities;
    private PkmnMove[] pkmnMovesLearnableByLeveling;
    private byte[] learnLevels;
    private PkmnMove[] pkmnMovesLearnableByTMHM;
    private PkmnMove[] pkmnMovesLearnableByTutor;
    private PkmnMove[] eggPkmnMoves;
    private LevelingRate levelingRate;
    private byte baseEggCycles;
    private byte baseFriendship;
    private byte[] baseStats;
    private byte[] evYields;
    private byte evolvesAtLevel;
    private byte genderThreshold;
    private byte catchRate;

    static {
    }

    PkmnSpecies(String name,
                Category category,
                PkmnType[] pkmnType,
                PkmnEggGroup[] pkmnEggGroup,
                Ability[] abilities,
                PkmnMove[] pkmnMovesLearnableByLeveling,
                byte[] learnLevels,
                PkmnMove[] pkmnMovesLearnableByTMHM,
                PkmnMove[] pkmnMovesLearnableByTutor,
                PkmnMove[] eggPkmnMoves,
                LevelingRate levelingRate,
                byte baseEggCycles,
                byte baseFriendship,
                byte[] baseStats,
                byte[] evYields,
                byte evolvesAtLevel,
                byte genderThreshold,
                byte catchRate) {
        this.name = name;
        this.category = category;
        this.pkmnType = pkmnType;
        this.pkmnEggGroup = pkmnEggGroup;
        this.abilities = abilities;
        this.pkmnMovesLearnableByLeveling = pkmnMovesLearnableByLeveling;
        this.learnLevels = learnLevels;
        this.pkmnMovesLearnableByTMHM = pkmnMovesLearnableByTMHM;
        this.pkmnMovesLearnableByTutor = pkmnMovesLearnableByTutor;
        this.eggPkmnMoves = eggPkmnMoves;
        this.levelingRate = levelingRate;
        this.baseEggCycles = baseEggCycles;
        this.baseFriendship = baseFriendship;
        this.baseStats = baseStats;
        this.evYields = evYields;
        this.evolvesAtLevel = evolvesAtLevel;
        this.genderThreshold = genderThreshold;
        this.catchRate = catchRate;
    }

    public Category getCategory() {
        return this.category;
    }

    public PkmnSpecies getEvolvesInto() {
        return this.evolvesInto;
    }

    public PkmnType[] getPkmnType() {
        return this.pkmnType;
    }

    public PkmnEggGroup[] getPkmnEggGroup() {
        return this.pkmnEggGroup;
    }

    public Ability[] getAbilities() {
        return this.abilities;
    }

    public PkmnMove[] getPkmnMovesLearnableByLeveling() {
        return this.pkmnMovesLearnableByLeveling;
    }

    public PkmnMove getPkmnMovesLearnableByLeveling(byte currentLvl) {
        for (int i = 0; i < learnLevels.length - 1; i++) {
            if (currentLvl == learnLevels[i]) {
                return pkmnMovesLearnableByLeveling[i];
            }
        }
        return null;
    }

    public PkmnMove[] getPkmnMovesLearnableByTMHM() {
        return this.pkmnMovesLearnableByTMHM;
    }

    public boolean getPkmnMovesLearnableByTMHM(PkmnMove attempted) {
        for (PkmnMove pkmnMove : pkmnMovesLearnableByTMHM) {
            if (attempted == pkmnMove) {
                return true;
            }
        }
        return false;
    }

    public PkmnMove[] getPkmnMovesLearnableByTutor() {
        return this.pkmnMovesLearnableByTutor;
    }

    public boolean getPkmnMovesLearnableByTutor(PkmnMove attempted) {
        for (PkmnMove pkmnMove : pkmnMovesLearnableByTutor) {
            if (attempted == pkmnMove) {
                return true;
            }
        }
        return false;
    }
}
