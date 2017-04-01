package PokemonGame;
import java.util.HashMap;

public enum PkmnMove{
    POUND ("Pound",
           "The target is physically pounded with a long tail, a foreleg, or the like.",
           "A highly appealing move.",
           "A basic performance using a move known by the Pokémon.",
           "Quite an appealing move.",
           PkmnType.NORMAL,
           PkmnMoveActionType.PHYSICAL,
           Condition.TOUGH,
           Condition.TOUGH,
           Condition.TOUGH,
           Utils.b(35),
           Utils.b(40),
           Utils.b(100),
           Utils.b(1),
           Utils.b(0),
           Utils.b(0),
           Utils.b(4),
           Utils.b(0),
           Utils.b(3),
           Utils.b(4),
           Utils.b(0),
           true,
           true,
           false,
           false,
           true,
           true),
    KARATE_CHOP ("Karate Chop", //name     
                 "The target is attacked with a sharp chop. It has a high critical-hit ratio.", //description
                 "Affected by how well the appeal in front goes.", //contestDesc
                 "A basic performance using a move known by the Pokemon.", //superContestDesc
                 "Quite an appealing move.", //contestSpectacularDesc
                 PkmnType.FIGHT, //pkmnType
                 PkmnMoveActionType.PHYSICAL, //pkmnMoveActionType
                 Condition.TOUGH, // contestCondition
                 Condition.TOUGH, // superContestCondition
                 Condition.TOUGH, // contestSpectacularCondition
                 Utils.b(25), //basePP
                 Utils.b(50), //power
                 Utils.b(100), //accuracy
                 Utils.b(1), //range
                 Utils.b(0), //tmNumber
                 Utils.b(0), //hmNumber
                 Utils.b(3), //contestAppeal
                 Utils.b(0), //contestJam
                 Utils.b(3), //superContestAppeal
                 Utils.b(4), //contestSpectacularAppeal
                 Utils.b(0), //contestSpectacularJam
                 true, //contact
                 true, //affectedByProtect
                 false, //affectedByMagicCoat
                 false, //affectedBySnatch
                 true, //affectedByMirror
                 true), //affectedByKingsRock
    DOUBLE_SLAP ("Double Slap", //String name
                 "The target is slapped repeatedly, back and forth, two to five times in a row.", //String description
                 "Startles the pokemon that has the judge's attention.", //String contestDesc
                 "Allows performance of the same move twice in a row.", //String superContestDesc
                 "Effectiveness varies depending on when it is used.", //String contestSpectacularDesc
                 PkmnType.NORMAL, //PkmnType pkmnType
                 PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
                 Condition.TOUGH, //Condition contestCondition
                 Condition.TOUGH, //Condition superContestCondition
                 Condition.CUTE, //Condition contestSpectacularCondition
                 Utils.b(10), //byte basePP
                 Utils.b(15), //byte power
                 Utils.b(85), //byte accuracy
                 Utils.b(1), //byte range
                 Utils.b(0), //byte tmNumber
                 Utils.b(0), //byte hmNumber
                 Utils.b(2), //byte contestAppeal
                 Utils.b(1), //byte contestJam
                 Utils.b(2), //byte superContestAppeal
                 Utils.b(1), //byte contestSpectacularAppeal
                 Utils.b(0), //byte contestSpectacularJam
                 true, //boolean contact
                 true, //boolean affectedByProtect
                 false, //boolean affectedByMagicCoat
                 false, //boolean affectedBySnatch
                 true, //boolean affectedByMirror
                 true), //boolean affectedByKingsRock
    COMET_PUNCH ("Comet Punch", //String name
                 "The target is hit with a flurry of punches that strike two to five time in a row.", //String description
                 "Works well if it's the same type as the one before.", //String contestDesc
                 "Allows performance of the same move twice in a row.", //String superContestDesc
                 "Effectiveness varies depending on when it is used.", //String contestSpectacularDesc
                 PkmnType.NORMAL, //PkmnType pkmnType
                 PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
                 Condition.TOUGH, //Condition contestCondition
                 Condition.TOUGH, //Condition superContestCondition
                 Condition.TOUGH, //Condition contestSpectacularCondition
                 Utils.b(15), //byte basePP
                 Utils.b(18), //byte power
                 Utils.b(85), //byte accuracy
                 Utils.b(1), //byte range
                 Utils.b(0), //byte tmNumber
                 Utils.b(0), //byte hmNumber
                 Utils.b(2), //byte contestAppeal
                 Utils.b(0), //byte contestJam
                 Utils.b(2), //byte superContestAppeal
                 Utils.b(1), //byte contestSpectacularAppeal
                 Utils.b(0), //byte contestSpectacularJam
                 true, //boolean contact
                 true, //boolean affectedByProtect
                 false, //boolean affectedByMagicCoat
                 false, //boolean affectedBySnatch
                 true, //boolean affectedByMirror
                 true), //boolean affectedByKingsRock
    MEGA_PUNCH ("Mega Punch", //String name
                "The target is slugged by a punch thrown with muscle-packed power.", //String description
                "A high appealing move.", //String contestDesc
                "Earn +2 if the Pokémon performs last in the turn.", //String superContestDesc
                "An appealing move that can be used repeatedly without boring the audience.", //String contestSpectacularDesc
                PkmnType.NORMAL, //PkmnType pkmnType
                PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
                Condition.TOUGH, //Condition contestCondition
                Condition.TOUGH, //Condition superContestCondition
                Condition.TOUGH, //Condition contestSpectacularCondition
                Utils.b(20), //byte basePP
                Utils.b(80), //byte power
                Utils.b(85), //byte accuracy
                Utils.b(1), //byte range
                Utils.b(0), //byte tmNumber
                Utils.b(0), //byte hmNumber
                Utils.b(4), //byte contestAppeal
                Utils.b(0), //byte contestJam
                Utils.b(2), //byte superContestAppeal
                Utils.b(3), //byte contestSpectacularAppeal
                Utils.b(0), //byte contestSpectacularJam
                true, //boolean contact
                true, //boolean affectedByProtect
                false, //boolean affectedByMagicCoat
                false, //boolean affectedBySnatch
                true, //boolean affectedByMirror
                true), //boolean affectedByKingsRock
    PAY_DAY ("Pay Day", //String name
             "Numerous coins are hurled at the target to inflict damage. Money is earned after the battle.", //String description
             "The appeal works best the more the crowd is excited.", //String contestDesc
             "Earn +3 if the Pokémon gets the lowest score.", //String superContestDesc
             "Excites the audience in any kind of contest.", //String contestSpectacularDesc
             PkmnType.NORMAL, //PkmnType pkmnType
             PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
             Condition.SMART, //Condition contestCondition
             Condition.SMART, //Condition superContestCondition
             Condition.SMART, //Condition contestSpectacularCondition
             Utils.b(20), //byte basePP
             Utils.b(40), //byte power
             Utils.b(100), //byte accuracy
             Utils.b(1), //byte range
             Utils.b(0), //byte tmNumber
             Utils.b(0), //byte hmNumber
             Utils.b(1), //byte contestAppeal
             Utils.b(0), //byte contestJam
             Utils.b(1), //byte superContestAppeal
             Utils.b(2), //byte contestSpectacularAppeal
             Utils.b(0), //byte contestSpectacularJam
             false, //boolean contact
             true, //boolean affectedByProtect
             false, //boolean affectedByMagicCoat
             false, //boolean affectedBySnatch
             true, //boolean affectedByMirror
             true), //boolean affectedByKingsRock
    FIRE_PUNCH ("Fire Punch", //String name
                "The target is punched with a fiery fist. This may also leave the target with a burn.", //String description
                " A highly appealing move.", //String contestDesc
                " Earn +2 if the Pokémon performs first in the turn.", //String superContestDesc
                " Quite an appealing move.", //String contestSpectacularDesc
                PkmnType.FIRE, //PkmnType pkmnType
                PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
                Condition.BEAUTY, //Condition contestCondition
                Condition.BEAUTY, //Condition superContestCondition
                Condition.TOUGH, //Condition contestSpectacularCondition
                Utils.b(15), //byte basePP
                Utils.b(75), //byte power
                Utils.b(100), //byte accuracy
                Utils.b(1), //byte range
                Utils.b(0), //byte tmNumber
                Utils.b(0), //byte hmNumber
                Utils.b(4), //byte contestAppeal
                Utils.b(0), //byte contestJam
                Utils.b(2), //byte superContestAppeal
                Utils.b(4), //byte contestSpectacularAppeal
                Utils.b(0), //byte contestSpectacularJam
                true, //boolean contact
                true, //boolean affectedByProtect
                false, //boolean affectedByMagicCoat
                false, //boolean affectedBySnatch
                true, //boolean affectedByMirror
                false), //boolean affectedByKingsRock
    ICE_PUNCH ("Ice Punch", //String name
               "The target is punched with an icy fist. This may also leave the target frozen.", //String description
               "A highly appealing move.", //String contestDesc
               "Earn +2 if the Pokémon performs first in the turn.", //String superContestDesc
               "Quite an appealing move.", //String contestSpectacularDesc
               PkmnType.ICE, //PkmnType pkmnType
               PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
               Condition.BEAUTY, //Condition contestCondition
               Condition.BEAUTY, //Condition superContestCondition
               Condition.BEAUTY, //Condition contestSpectacularCondition
               Utils.b(15), //byte basePP
               Utils.b(75), //byte power
               Utils.b(100), //byte accuracy
               Utils.b(1), //byte range
               Utils.b(0), //byte tmNumber
               Utils.b(0), //byte hmNumber
               Utils.b(4), //byte contestAppeal
               Utils.b(0), //byte contestJam
               Utils.b(2), //byte superContestAppeal
               Utils.b(4), //byte contestSpectacularAppeal
               Utils.b(0), //byte contestSpectacularJam
               true, //boolean contact
               true, //boolean affectedByProtect
               false, //boolean affectedByMagicCoat
               false, //boolean affectedBySnatch
               true, //boolean affectedByMirror
               false), //boolean affectedByKingsRock
    THUNDER_PUNCH ("Thunder Punch", //String name
                   "The target is punched with an electrified fist. This may also leave the target with paralysis.", //String description
                   "A highly appealing move.", //String contestDesc
                   "Earn +2 if the Pokémon performs first in the turn.", //String superContestDesc
                   "Quite an appealing move.", //String contestSpectacularDesc
                   PkmnType.ELECTR, //PkmnType pkmnType
                   PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
                   Condition.COOL, //Condition contestCondition
                   Condition.COOL, //Condition superContestCondition
                   Condition.COOL, //Condition contestSpectacularCondition
                   Utils.b(15), //byte basePP
                   Utils.b(75), //byte power
                   Utils.b(100), //byte accuracy
                   Utils.b(1), //byte range
                   Utils.b(0), //byte tmNumber
                   Utils.b(0), //byte hmNumber
                   Utils.b(4), //byte contestAppeal
                   Utils.b(0), //byte contestJam
                   Utils.b(2), //byte superContestAppeal
                   Utils.b(4), //byte contestSpectacularAppeal
                   Utils.b(0), //byte contestSpectacularJam
                   true, //boolean contact
                   true, //boolean affectedByProtect
                   false, //boolean affectedByMagicCoat
                   false, //boolean affectedBySnatch
                   true, //boolean affectedByMirror
                   false), //boolean affectedByKingsRock
    SCRATCH ("Scratch", //String name
             "Hard, pointed, sharp claws rake the target to inflict damage.", //String description
             "A highly appealing move.", //String contestDesc
             "A basic performance using a move known by the Pokémon.", //String superContestDesc
             "Quite an appealing move.", //String contestSpectacularDesc
             PkmnType.NORMAL, //PkmnType pkmnType
             PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
             Condition.TOUGH, //Condition contestCondition
             Condition.TOUGH, //Condition superContestCondition
             Condition.TOUGH, //Condition contestSpectacularCondition
             Utils.b(35), //byte basePP
             Utils.b(40), //byte power
             Utils.b(100), //byte accuracy
             Utils.b(1), //byte range
             Utils.b(0), //byte tmNumber
             Utils.b(0), //byte hmNumber
             Utils.b(4), //byte contestAppeal
             Utils.b(0), //byte contestJam
             Utils.b(3), //byte superContestAppeal
             Utils.b(4), //byte contestSpectacularAppeal
             Utils.b(0), //byte contestSpectacularJam
             true, //boolean contact
             true, //boolean affectedByProtect
             false, //boolean affectedByMagicCoat
             false, //boolean affectedBySnatch
             true, //boolean affectedByMirror
             true), //boolean affectedByKingsRock
    VICE_GRIP ("Vice Grip", //String name
               "Hard, pointed, sharp claws rake the target to inflict damage.", //String description
               "A highly appealing move.", //String contestDesc
               "A basic performance using a move known by the Pokémon.", //String superContestDesc
               "Quite an appealing move.", //String contestSpectacularDesc
               PkmnType.NORMAL, //PkmnType pkmnType
               PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
               Condition.TOUGH, //Condition contestCondition
               Condition.TOUGH, //Condition superContestCondition
               Condition.TOUGH, //Condition contestSpectacularCondition
               Utils.b(30), //byte basePP
               Utils.b(55), //byte power
               Utils.b(100), //byte accuracy
               Utils.b(1), //byte range
               Utils.b(0), //byte tmNumber
               Utils.b(0), //byte hmNumber
               Utils.b(4), //byte contestAppeal
               Utils.b(0), //byte contestJam
               Utils.b(3), //byte superContestAppeal
               Utils.b(4), //byte contestSpectacularAppeal
               Utils.b(0), //byte contestSpectacularJam
               true, //boolean contact
               true, //boolean affectedByProtect
               false, //boolean affectedByMagicCoat
               false, //boolean affectedBySnatch
               true, //boolean affectedByMirror
               true), //boolean affectedByKingsRock
    GUILLOTINE ("Guillotine", //String name
                "A vicious, tearing attack with big pincers. The target faints instantly if this attack hits.", //String description
                "Badly startles all Pokémon that made good appeals.", //String contestDesc
                "Earn +15 if all the Pokémon choose the same Judge.", //String superContestDesc
                "Badly startles all Pokémon that successfully showed their appeal.", //String contestSpectacularDesc
                PkmnType.NORMAL, //PkmnType pkmnType
                PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
                Condition.COOL, //Condition contestCondition
                Condition.COOL, //Condition superContestCondition
                Condition.COOL, //Condition contestSpectacularCondition
                Utils.b(5), //byte basePP
                Utils.b(0), //byte power
                Utils.b(100), //byte accuracy
                Utils.b(1), //byte range
                Utils.b(0), //byte tmNumber
                Utils.b(0), //byte hmNumber
                Utils.b(2), //byte contestAppeal
                Utils.b(1), //byte contestJam
                Utils.b(0), //byte superContestAppeal
                Utils.b(2), //byte contestSpectacularAppeal
                Utils.b(1), //byte contestSpectacularJam
                true, //boolean contact
                true, //boolean affectedByProtect
                false, //boolean affectedByMagicCoat
                false, //boolean affectedBySnatch
                false, //boolean affectedByMirror
                false), //boolean affectedByKingsRock
    RAZOR_WIND ("Razor Wind", //String name
        "In this two-turn attack, blades of wind hit opposing Pokémon on the second turn. Critical hits land more easily.", //String description
        "Affected by how well the appeal in front goes.", //String contestDesc
        "Earn +3 if no other Pokémon has chosen the same Judge.", //String superContestDesc
        "Affected by how well the previous Pokémon's move went.", //String contestSpectacularDesc
        PkmnType.NORMAL, //PkmnType pkmnType
        PkmnMoveActionType.SPECIAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.COOL, //Condition contestCondition
        Condition.COOL, //Condition superContestCondition
        Condition.COOL, //Condition contestSpectacularCondition
        Utils.b(10), //byte basePP
        Utils.b(80), //byte power
        Utils.b(100), //byte accuracy
        Utils.b(2), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(3), //byte contestAppeal
        Utils.b(0), //byte contestJam
        Utils.b(1), //byte superContestAppeal
        Utils.b(3), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        false, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true), //boolean affectedByKingsRock
    SWORD_DANCE ("Sword Dance", //String name
        "A frenetic dance to uplift the fighting spirit. This sharply raises the user's Attack stat.", //String description
        "Ups the user's condition and helps prevent nervousness.", //String contestDesc
        "Earn double the score in the next turn.", //String superContestDesc
        "Gets the Pokémon pumped up. Helps prevent nervousness too.", //String contestSpectacularDesc
        PkmnType.NORMAL, //PkmnType pkmnType
        PkmnMoveActionType.STATUS, //PkmnMoveActionType pkmnMoveActionType
        Condition.BEAUTY, //Condition contestCondition
        Condition.BEAUTY, //Condition superContestCondition
        Condition.BEAUTY, //Condition contestSpectacularCondition
        Utils.b(20), //byte basePP
        Utils.b(0), //byte power
        Utils.b(0), //byte accuracy
        Utils.b(0), //byte range
        Utils.b(75), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(1), //byte contestAppeal
        Utils.b(0), //byte contestJam
        Utils.b(0), //byte superContestAppeal
        Utils.b(1), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        false, //boolean contact
        false, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        true, //boolean affectedBySnatch
        false, //boolean affectedByMirror
        false), //boolean affectedByKingsRock
    CUT ("Cut", //String name
        "The target is cut with a scythe or claw.", //String description
        "Badly startles all Pokémon that made good appeals.", //String contestDesc
        "A basic performance using a move known by the Pokémon.", //String superContestDesc
        "Quite an appealing move.", //String contestSpectacularDesc
        PkmnType.NORMAL, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.COOL, //Condition contestCondition
        Condition.COOL, //Condition superContestCondition
        Condition.COOL, //Condition contestSpectacularCondition
        Utils.b(30), //byte basePP
        Utils.b(50), //byte power
        Utils.b(95), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(2), //byte contestAppeal
        Utils.b(1), //byte contestJam
        Utils.b(3), //byte superContestAppeal
        Utils.b(4), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true), //boolean affectedByKingsRock
    GUST ("Gust", //String name
        "A gust of wind is whipped up by wings and launched at the target to inflict damage.", //String description
        "Scrambles up the order of appeals on the next turn.", //String contestDesc
        "A basic performance using a move known by the Pokémon.", //String superContestDesc
        "Startles the last Pokémon to act before the user.", //String contestSpectacularDesc
        PkmnType.FLYING, //PkmnType pkmnType
        PkmnMoveActionType.SPECIAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.SMART, //Condition contestCondition
        Condition.SMART, //Condition superContestCondition
        Condition.SMART, //Condition contestSpectacularCondition
        Utils.b(35), //byte basePP
        Utils.b(40), //byte power
        Utils.b(100), //byte accuracy
        Utils.b(6), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(3), //byte contestAppeal
        Utils.b(0), //byte contestJam
        Utils.b(3), //byte superContestAppeal
        Utils.b(2), //byte contestSpectacularAppeal
        Utils.b(3), //byte contestSpectacularJam
        false, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true), //boolean affectedByKingsRock
    WING_ATTACK ("Wing Attack", //String name
        "The target is struck with large, imposing wings spread wide to inflict damage.", //String description
        "Works well if it's the same type as the one before.", //String contestDesc
        "A basic performance using a move known by the Pokémon.", //String superContestDesc
        "Quite an appealing move.", //String contestSpectacularDesc
        PkmnType.FLYING, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.COOL, //Condition contestCondition
        Condition.COOL, //Condition superContestCondition
        Condition.COOL, //Condition contestSpectacularCondition
        Utils.b(35), //byte basePP
        Utils.b(60), //byte power
        Utils.b(100), //byte accuracy
        Utils.b(5), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(2), //byte contestAppeal
        Utils.b(0), //byte contestJam
        Utils.b(3), //byte superContestAppeal
        Utils.b(4), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true), //boolean affectedByKingsRock
    WHIRLWIND ("	Whirlwind", //String name
        "The target is blown away, and a different Pokémon is dragged out. In the wild, this ends a battle against a single Pokémon.", //String description
        "Scrambles the order of appeals on the next turn.", //String contestDesc
        "Earn +15 if all the Pokémon choose the same Judge.", //String superContestDesc
        "Causes the user to move later on the next turn.", //String contestSpectacularDesc
        PkmnType.NORMAL, //PkmnType pkmnType
        PkmnMoveActionType.STATUS, //PkmnMoveActionType pkmnMoveActionType
        Condition.SMART, //Condition contestCondition
        Condition.SMART, //Condition superContestCondition
        Condition.SMART, //Condition contestSpectacularCondition
        Utils.b(20), //byte basePP
        Utils.b(0), //byte power
        Utils.b(0), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(3), //byte contestAppeal
        Utils.b(0), //byte contestJam
        Utils.b(0), //byte superContestAppeal
        Utils.b(3), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        false, //boolean contact
        false, //boolean affectedByProtect
        true, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        false), //boolean affectedByKingsRock
    FLY ("Fly", //String name
        " 	The user soars and then strikes its target on the next turn.", //String description
        "Can avoid being startled by others.", //String contestDesc
        "Earn +3 if no other Pokémon has chosen the same Judge.", //String superContestDesc
        "Prevents the user from being startled one time this turn.", //String contestSpectacularDesc
        PkmnType.FLYING, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.SMART, //Condition contestCondition
        Condition.SMART, //Condition superContestCondition
        Condition.SMART, //Condition contestSpectacularCondition
        Utils.b(15), //byte basePP
        Utils.b(90), //byte power
        Utils.b(95), //byte accuracy
        Utils.b(5), //byte range
        Utils.b(76), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(1), //byte contestAppeal
        Utils.b(0), //byte contestJam
        Utils.b(1), //byte superContestAppeal
        Utils.b(2), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true), //boolean affectedByKingsRock
    BIND ("Bind", //String name
        "Things such as long bodies or tentacles are used to bind and squeeze the target for four to five turns.", //String description
        "Temporarily stops the crowd from getting excited.", //String contestDesc
        "Earn a higher score the later the Pokémon performs.", //String superContestDesc
        "Temporarily stops the crowd from growing excited.", //String contestSpectacularDesc
        PkmnType.NORMAL, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.TOUGH, //Condition contestCondition
        Condition.TOUGH, //Condition superContestCondition
        Condition.TOUGH, //Condition contestSpectacularCondition
        Utils.b(20), //byte basePP
        Utils.b(15), //byte power
        Utils.b(85), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(3), //byte contestAppeal
        Utils.b(0), //byte contestJam
        Utils.b(0), //byte superContestAppeal
        Utils.b(3), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true), //boolean affectedByKingsRock
    SLAM ("Slam", //String name
        "The target is slammed with a long tail, vines, or the like to inflict damage.", //String description
        "Startles Pokémon that made a same-type appeal.", //String contestDesc
        "A basic performance using a move known by the Pokémon.", //String superContestDesc
        "Quite an appealing move.", //String contestSpectacularDesc
        PkmnType.NORMAL, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.TOUGH, //Condition contestCondition
        Condition.TOUGH, //Condition superContestCondition
        Condition.TOUGH, //Condition contestSpectacularCondition
        Utils.b(20), //byte basePP
        Utils.b(80), //byte power
        Utils.b(75), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(2), //byte contestAppeal
        Utils.b(1), //byte contestJam
        Utils.b(3), //byte superContestAppeal
        Utils.b(4), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true), //boolean affectedByKingsRock
    VINE_WHIP ("Vine Whip", //String name
        "The target is struck with slender, whiplike vines to inflict damage.", //String description
        "A highly appealing move.", //String contestDesc
        "A basic performance using a move known by the Pokémon.", //String superContestDesc
        "Quite an appealing move.", //String contestSpectacularDesc
        PkmnType.GRASS, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.COOL, //Condition contestCondition
        Condition.COOL, //Condition superContestCondition
        Condition.COOL, //Condition contestSpectacularCondition
        Utils.b(25), //byte basePP
        Utils.b(45), //byte power
        Utils.b(100), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(4), //byte contestAppeal
        Utils.b(0), //byte contestJam
        Utils.b(3), //byte superContestAppeal
        Utils.b(4), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true), //boolean affectedByKingsRock
    STOMP ("Stomp", //String name
        "The target is stomped with a big foot. This may also make the target flinch.", //String description
        "Badly startles the Pokémon in front.", //String contestDesc
        "A basic performance using a move known by the Pokémon.", //String superContestDesc
        "Quite an appealing move.", //String contestSpectacularDesc
        PkmnType.NORMAL, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.TOUGH, //Condition contestCondition
        Condition.TOUGH, //Condition superContestCondition
        Condition.TOUGH, //Condition contestSpectacularCondition
        Utils.b(20), //byte basePP
        Utils.b(65), //byte power
        Utils.b(100), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(1), //byte contestAppeal
        Utils.b(4), //byte contestJam
        Utils.b(3), //byte superContestAppeal
        Utils.b(4), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        false), //boolean affectedByKingsRock
    DOUBLE_KICK ("Double Kick", //String name
        "The target is quickly kicked twice in succession using both feet.", //String description
        "Works well if it's the same type as the one before.", //String contestDesc
        "Allows performance of the same move twice in a row.", //String superContestDesc
        "Badly startles Pokémon that used a move of the same type.", //String contestSpectacularDesc
        PkmnType.FIGHT, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.COOL, //Condition contestCondition
        Condition.COOL, //Condition superContestCondition
        Condition.COOL, //Condition contestSpectacularCondition
        Utils.b(30), //byte basePP
        Utils.b(30), //byte power
        Utils.b(100), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(2), //byte contestAppeal
        Utils.b(0), //byte contestJam
        Utils.b(2), //byte superContestAppeal
        Utils.b(2), //byte contestSpectacularAppeal
        Utils.b(1), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true), //boolean affectedByKingsRock
    MEGA_KICK ("Mega Kick", //String name
        "The target is attacked by a kick launched with muscle-packed power.", //String description
        "A highly appealing move.", //String contestDesc
        "Earn +2 if the Pokémon performs last in the turn.", //String superContestDesc
        "Works better the more the crowd is excited.", //String contestSpectacularDesc
        PkmnType.NORMAL, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.COOL, //Condition contestCondition
        Condition.COOL, //Condition superContestCondition
        Condition.COOL, //Condition contestSpectacularCondition
        Utils.b(5), //byte basePP
        Utils.b(120), //byte power
        Utils.b(75), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(4), //byte contestAppeal
        Utils.b(0), //byte contestJam
        Utils.b(2), //byte superContestAppeal
        Utils.b(1), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true), //boolean affectedByKingsRock
    JUMP_KICK ("Jump Kick", //String name
        "The user jumps up high, then strikes with a kick. If the kick misses, the user hurts itself.", //String description
        "After this move, the user is more easily startled.", //String contestDesc
        "A basic performance using a move known by the Pokémon.", //String superContestDesc
        "After this move, the user is more easily startled.", //String contestSpectacularDesc
        PkmnType.FIGHT, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.COOL, //Condition contestCondition
        Condition.COOL, //Condition superContestCondition
        Condition.COOL, //Condition contestSpectacularCondition
        Utils.b(10), //byte basePP
        Utils.b(100), //byte power
        Utils.b(95), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(6), //byte contestAppeal
        Utils.b(0), //byte contestJam
        Utils.b(3), //byte superContestAppeal
        Utils.b(6), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true), //boolean affectedByKingsRock
    ROLLING_KICK ("Rolling Kick", //String name
        "The user lashes out with a quick, spinning kick. This may also make the target flinch.", //String description
        "Badly startles those that have made appeals.", //String contestDesc
        "A basic performance using a move known by the Pokémon.", //String superContestDesc
        "Quite an appealing move.", //String contestSpectacularDesc
        PkmnType.FIGHT, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.COOL, //Condition contestCondition
        Condition.COOL, //Condition superContestCondition
        Condition.COOL, //Condition contestSpectacularCondition
        Utils.b(15), //byte basePP
        Utils.b(60), //byte power
        Utils.b(85), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(1), //byte contestAppeal
        Utils.b(3), //byte contestJam
        Utils.b(3), //byte superContestAppeal
        Utils.b(4), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true), //boolean affectedByKingsRock
    SAND_ATTACK ("Sand Attack", //String name
        "Sand is hurled in the target's face, reducing the target's accuracy.", //String description
        "Startles the Pokémon that has the judge's attention.", //String contestDesc
        "Prevents the Voltage from going down in the same turn.", //String superContestDesc
        "Makes audience expect little of other contestants.", //String contestSpectacularDesc
        PkmnType.GROUND, //PkmnType pkmnType
        PkmnMoveActionType.STATUS, //PkmnMoveActionType pkmnMoveActionType
        Condition.CUTE, //Condition contestCondition
        Condition.CUTE, //Condition superContestCondition
        Condition.CUTE, //Condition contestSpectacularCondition
        Utils.b(15), //byte basePP
        Utils.b(0), //byte power
        Utils.b(100), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(2), //byte contestAppeal
        Utils.b(1), //byte contestJam
        Utils.b(2), //byte superContestAppeal
        Utils.b(3), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        false, //boolean contact
        true, //boolean affectedByProtect
        true, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        false), //boolean affectedByKingsRock
    HEADBUTT ("Headbutt", //String name
        "The user sticks out its head and attacks by charging straight into the target. This may also make the target flinch.", //String description
        "Startles the Pokémon that appealed before the user.", //String contestDesc
        "A basic performance using a move known by the Pokémon.", //String superContestDesc
        "Quite an appealing move.", //String contestSpectacularDesc
        PkmnType.NORMAL, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.TOUGH, //Condition contestCondition
        Condition.TOUGH, //Condition superContestCondition
        Condition.TOUGH, //Condition contestSpectacularCondition
        Utils.b(15), //byte basePP
        Utils.b(70), //byte power
        Utils.b(100), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(2), //byte contestAppeal
        Utils.b(3), //byte contestJam
        Utils.b(3), //byte superContestAppeal
        Utils.b(4), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        false), //boolean affectedByKingsRock
    HORN_ATTACK ("Horn Attack", //String name
        "The target is jabbed with a sharply pointed horn to inflict damage.", //String description
        "A highly appealing move.", //String contestDesc
        "A basic performance using a move known by the Pokémon.", //String superContestDesc
        "Quite an appealing move.", //String contestSpectacularDesc
        PkmnType.NORMAL, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.COOL, //Condition contestCondition
        Condition.COOL, //Condition superContestCondition
        Condition.COOL, //Condition contestSpectacularCondition
        Utils.b(25), //byte basePP
        Utils.b(65), //byte power
        Utils.b(100), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(4), //byte contestAppeal
        Utils.b(0), //byte contestJam
        Utils.b(3), //byte superContestAppeal
        Utils.b(4), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true), //boolean affectedByKingsRock
    FURY_ATTACK ("Fury Attack", //String name
        "The target is jabbed repeatedly with a horn or beak two to five times in a row.", //String description
        "Startles the Pokémon that has the judge's attention.", //String contestDesc
        "Allows performance of the same move twice in a row.", //String superContestDesc
        "Effectiveness varies depending on when it is used.", //String contestSpectacularDesc
        PkmnType.NORMAL, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.COOL, //Condition contestCondition
        Condition.COOL, //Condition superContestCondition
        Condition.COOL, //Condition contestSpectacularCondition
        Utils.b(20), //byte basePP
        Utils.b(15), //byte power
        Utils.b(85), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(2), //byte contestAppeal
        Utils.b(1), //byte contestJam
        Utils.b(2), //byte superContestAppeal
        Utils.b(1), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true), //boolean affectedByKingsRock
    HORN_DRILL ("Horn Drill", //String name
        "The user stabs the target with a horn that rotates like a drill. The target faints instantly if this attack hits.", //String description
        "Badly startles all Pokémon that made good appeals.", //String contestDesc
        "Earn +15 if all the Pokémon choose the same Judge.", //String superContestDesc
        "Badly startles all Pokémon that successfully showed their appeal.", //String contestSpectacularDesc
        PkmnType.NORMAL, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.COOL, //Condition contestCondition
        Condition.COOL, //Condition superContestCondition
        Condition.COOL, //Condition contestSpectacularCondition
        Utils.b(5), //byte basePP
        Utils.b(0), //byte power
        Utils.b(30), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(2), //byte contestAppeal
        Utils.b(1), //byte contestJam
        Utils.b(0), //byte superContestAppeal
        Utils.b(2), //byte contestSpectacularAppeal
        Utils.b(1), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        false, //boolean affectedByMirror
        false), //boolean affectedByKingsRock
    TACKLE ("Tackle", //String name
        "A physical attack in which the user charges and slams into the target with its whole body.", //String description
        "A highly appealing move.", //String contestDesc
        "A basic performance using a move known by the Pokémon.", //String superContestDesc
        "Quite an appealing move.", //String contestSpectacularDesc
        PkmnType.NORMAL, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.TOUGH, //Condition contestCondition
        Condition.TOUGH, //Condition superContestCondition
        Condition.TOUGH, //Condition contestSpectacularCondition
        Utils.b(35), //byte basePP
        Utils.b(40), //byte power
        Utils.b(100), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(4), //byte contestAppeal
        Utils.b(0), //byte contestJam
        Utils.b(3), //byte superContestAppeal
        Utils.b(4), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true), //boolean affectedByKingsRock
    BODY_SLAM ("Body Slam", //String name
        "The user drops onto the target with its full body weight. This may also leave the target with paralysis.", //String description
        "Badly startles the Pokémon in front.", //String contestDesc
        "A basic performance using a move known by the Pokémon.", //String superContestDesc
        "Badly startles the last Pokémon to act before the user.", //String contestSpectacularDesc
        PkmnType.NORMAL, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.TOUGH, //Condition contestCondition
        Condition.TOUGH, //Condition superContestCondition
        Condition.TOUGH, //Condition contestSpectacularCondition
        Utils.b(15), //byte basePP
        Utils.b(85), //byte power
        Utils.b(100), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(1), //byte contestAppeal
        Utils.b(4), //byte contestJam
        Utils.b(3), //byte superContestAppeal
        Utils.b(1), //byte contestSpectacularAppeal
        Utils.b(4), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        false), //boolean affectedByKingsRock
    WRAP ("Wrap", //String name
        "A long body, vines, or the like are used to wrap and squeeze the target for four to five turns.", //String description
        "Temporarily stops the crowd from growing excited.", //String contestDesc
        "Earn a higher score the later the Pokémon performs.", //String superContestDesc
        "Temporarily stops the crowd from growing excited.", //String contestSpectacularDesc
        PkmnType.NORMAL, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.TOUGH, //Condition contestCondition
        Condition.TOUGH, //Condition superContestCondition
        Condition.TOUGH, //Condition contestSpectacularCondition
        Utils.b(20), //byte basePP
        Utils.b(15), //byte power
        Utils.b(90), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(3), //byte contestAppeal
        Utils.b(0), //byte contestJam
        Utils.b(0), //byte superContestAppeal
        Utils.b(3), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true), //boolean affectedByKingsRock
    TAKE_DOWN ("Take Down", //String name
        "A reckless, full-body charge attack for slamming into the target. This also damages the user a little.", //String description
        "After this move, the user is more easily startled.", //String contestDesc
        "A basic performance using a move known by the Pokémon.", //String superContestDesc
        "A very appealing move, but after using this move, the user is more easily startled.", //String contestSpectacularDesc
        PkmnType.NORMAL, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.TOUGH, //Condition contestCondition
        Condition.TOUGH, //Condition superContestCondition
        Condition.TOUGH, //Condition contestSpectacularCondition
        Utils.b(20), //byte basePP
        Utils.b(90), //byte power
        Utils.b(85), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(6), //byte contestAppeal
        Utils.b(0), //byte contestJam
        Utils.b(3), //byte superContestAppeal
        Utils.b(6), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true), //boolean affectedByKingsRock
    THRASH ("Thrash", //String name
        "The user rampages and attacks for two to three turns. The user then becomes confused.", //String description
        "Jams the others, and misses one turn of appeals.", //String contestDesc
        "Allows performance of the same move twice in a row.", //String superContestDesc
        "A very appealing move, but after using this move, the user is more easily startled.", //String contestSpectacularDesc
        PkmnType.NORMAL, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.TOUGH, //Condition contestCondition
        Condition.TOUGH, //Condition superContestCondition
        Condition.TOUGH, //Condition contestSpectacularCondition
        Utils.b(10), //byte basePP
        Utils.b(120), //byte power
        Utils.b(100), //byte accuracy
        Utils.b(0), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(4), //byte contestAppeal
        Utils.b(4), //byte contestJam
        Utils.b(2), //byte superContestAppeal
        Utils.b(6), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true), //boolean affectedByKingsRock
    DOUBLE_EDGE ("Double Edge", //String name
        "A reckless, life-risking tackle. This also damages the user quite a lot.", //String description
        "After this move, the user is more easily startled.", //String contestDesc
        "Earn +15 if all the Pokémon choose the same Judge.", //String superContestDesc
        "A very appealing move, but after using this move, the user is more easily startled.", //String contestSpectacularDesc
        PkmnType.NORMAL, //PkmnType pkmnType
        PkmnMoveActionType.PHYSICAL, //PkmnMoveActionType pkmnMoveActionType
        Condition.TOUGH, //Condition contestCondition
        Condition.TOUGH, //Condition superContestCondition
        Condition.TOUGH, //Condition contestSpectacularCondition
        Utils.b(15), //byte basePP
        Utils.b(120), //byte power
        Utils.b(100), //byte accuracy
        Utils.b(1), //byte range
        Utils.b(0), //byte tmNumber
        Utils.b(0), //byte hmNumber
        Utils.b(6), //byte contestAppeal
        Utils.b(0), //byte contestJam
        Utils.b(0), //byte superContestAppeal
        Utils.b(6), //byte contestSpectacularAppeal
        Utils.b(0), //byte contestSpectacularJam
        true, //boolean contact
        true, //boolean affectedByProtect
        false, //boolean affectedByMagicCoat
        false, //boolean affectedBySnatch
        true, //boolean affectedByMirror
        true); //boolean affectedByKingsRock

     //MOVE ("", //String name
     //      "", //String description
     //      "", //String contestDesc
     //      "", //String superContestDesc
     //      "", //String contestSpectacularDesc
     //      PkmnType., //PkmnType pkmnType
     //      PkmnMoveActionType., //PkmnMoveActionType pkmnMoveActionType
     //      Condition., //Condition contestCondition
     //      Condition., //Condition superContestCondition
     //      Condition., //Condition contestSpectacularCondition
     //      Utils.b(), //byte basePP
     //      Utils.b(), //byte power
     //      Utils.b(), //byte accuracy
     //      Utils.b(), //byte range
     //      Utils.b(), //byte tmNumber
     //      Utils.b(), //byte hmNumber
     //      Utils.b(), //byte contestAppeal
     //      Utils.b(), //byte contestJam
     //      Utils.b(), //byte superContestAppeal
     //      Utils.b(), //byte contestSpectacularAppeal
     //      Utils.b(), //byte contestSpectacularJam
     //      , //boolean contact
     //      , //boolean affectedByProtect
     //      , //boolean affectedByMagicCoat
     //      , //boolean affectedBySnatch
     //      , //boolean affectedByMirror
     //       ); //boolean affectedByKingsRock

    private String name;
    private String description;
    private String contestDesc;
    private String superContestDesc;
    private String contestSpectacularDesc;
    private PkmnType pkmnType;
    private PkmnMoveActionType pkmnMoveActionType;
    private Condition contestCondition;
    private Condition superContestCondition;
    private Condition contestSpectacularCondition;
    private HashMap<PkmnStatus, Byte> inflictsPkmnStatus = new HashMap<PkmnStatus, Byte>();
    private HashMap<PkmnStatus, Byte> selfInflictsPkmnStatus = new HashMap<PkmnStatus, Byte>();
    private byte basePP;
    private byte power;
    private byte accuracy;
    private byte range;
    private byte tmNumber;
    private byte hmNumber;
    private byte contestAppeal;
    private byte contestJam;
    private byte superContestAppeal;
    private byte contestSpectacularAppeal;
    private byte contestSpectacularJam;
    private boolean contact;
    private boolean affectedByProtect;
    private boolean affectedByMagicCoat;
    private boolean affectedBySnatch;
    private boolean affectedByMirror;
    private boolean affectedByKingsRock;

    static {
        
    }

    PkmnMove(String name,
             String description,
             String contestDesc,
             String superContestDesc,
             String contestSpectacularDesc,
             PkmnType pkmnType,
             PkmnMoveActionType pkmnMoveActionType,
             Condition contestCondition,
             Condition superContestCondition,
             Condition contestSpectacularCondition,
             byte basePP,
             byte power,
             byte accuracy,
             byte range,
             byte tmNumber,
             byte hmNumber,
             byte contestAppeal,
             byte contestJam,
             byte superContestAppeal,
             byte contestSpectacularAppeal,
             byte contestSpectacularJam,
             boolean contact,
             boolean affectedByProtect,
             boolean affectedByMagicCoat,
             boolean affectedBySnatch,
             boolean affectedByMirror,
             boolean affectedByKingsRock) {
        this.name = name;
        this.description = description;
        this.contestDesc = contestDesc;
        this.superContestDesc = superContestDesc;
        this.contestSpectacularDesc = contestSpectacularDesc;
        this.pkmnType = pkmnType;
        this.pkmnMoveActionType = pkmnMoveActionType;
        this.contestCondition = contestCondition;
        this.superContestCondition = superContestCondition;
        this.contestSpectacularCondition = contestSpectacularCondition;
        this.basePP = basePP;
        this.power = power;
        this.range = range;
        this.tmNumber = tmNumber;
        this.hmNumber = hmNumber;
        this.contestAppeal = contestAppeal;
        this.contestJam = contestJam;
        this.superContestAppeal = superContestAppeal;
        this.contestSpectacularAppeal = contestSpectacularAppeal;
        this.contestSpectacularJam = contestSpectacularJam;
        this.contact = contact;
        this.affectedByProtect = affectedByProtect;
        this.affectedByMagicCoat = affectedByMagicCoat;
        this.affectedBySnatch = affectedBySnatch;
        this.affectedByMirror = affectedByMirror;
        this.affectedByKingsRock = affectedByKingsRock;
    };

    public String getName() {
        return this.name();
    }

    public String getDescription() {
        return this.description;
    }

    public String getContestDesc() {
        return this.contestDesc;
    }

    public String getSuperContestDesc() {
        return this.superContestDesc;
    }

    public String getContestSpectacularDesc() {
        return this.contestSpectacularDesc;
    }

    public PkmnType getPkmnType() {
        return this.pkmnType;
    }

    public PkmnMoveActionType getPkmnMoveActionType() {
        return this.pkmnMoveActionType;
    }

    public Condition getContestCondition() {
        return this.contestCondition;
    }

    public Condition getSuperContestCondition() {
        return this.superContestCondition;
    }

    public Condition getContestSpectacularCondition() {
        return this.contestSpectacularCondition;
    }

    public HashMap getInflictsPkmnStatus() {
        return this.inflictsPkmnStatus;
    }

    public HashMap getSelfInflictsPkmnStatus() {
        return this.selfInflictsPkmnStatus;
    }

    public byte getBasePP() {
        return this.basePP;
    }

    public byte getPower() {
        return this.power;
    }

    public byte getRange() {
        return this.range;
    }

    public byte getTMNumber() {
        return this.tmNumber;
    }

    public byte getHMNumber() {
        return this.hmNumber;
    }

    public byte getContestAppeal() {
        return this.contestAppeal;
    }

    public byte getContestJam() {
        return this.contestJam;
    }

    public byte getSuperContestAppeal() {
        return this.superContestAppeal;
    }

    public byte getContestSpectacularAppeal() {
        return this.contestSpectacularAppeal;
    }

    public byte getContestSpectacularJam() {
        return this.contestSpectacularJam;
    }

    public boolean getContact() {
        return this.contact;
    }

    public boolean getAffectedByProtect() {
        return this.affectedByProtect;
    }

    public boolean getAffectedByMagicCoat() {
        return this.affectedByMagicCoat;
    }

    public boolean getAffectedBySnatch() {
        return this.affectedBySnatch;
    }

    public boolean getAffectedByMirror() {
        return this.affectedByMirror;
    }

    public boolean getAffectedByKingsRock() {
        return this.affectedByKingsRock;
    }
}
