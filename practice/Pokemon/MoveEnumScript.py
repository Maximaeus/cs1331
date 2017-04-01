print("Starting Move writer script")
running = True
f = open('output.txt', 'w')
while (running):
    f.write("    ")
    f.write(raw_input("MOVE (all caps, underscore for space): "))
    f.write(" (\"")
    f.write(raw_input("String name: "))
    f.write("\", //String name\n        \"")
    f.write(raw_input("String description: "))
    f.write("\", //String description\n        \"")
    f.write(raw_input("String contestDesc: "))
    f.write("\", //String contestDesc\n        \"")
    f.write(raw_input("String superContestDesc: "))
    f.write("\", //String superContestDesc\n        \"")
    f.write(raw_input("String contestSpectacularDesc: "))
    f.write("\", //String contestSpectacularDesc\n        PkmnType.")
    f.write(raw_input("PkmnType pkmnType = PkmnType."))
    f.write(", //PkmnType pkmnType\n        PkmnMoveActionType.")
    f.write(raw_input("PkmnMoveActionType pkmnMoveActionType: PkmnMoveActionType."))
    f.write(", //PkmnMoveActionType pkmnMoveActionType\n        Condition.")
    f.write(raw_input("Condition contestCondition = Condition."))
    f.write(", //Condition contestCondition\n        Condition.")
    f.write(raw_input("Condition superContestCondition = Condition."))
    f.write(", //Condition superContestCondition\n        Condition.")
    f.write(raw_input("Condition contestSpectacularCondition = Condition."))
    f.write(", //Condition contestSpectacularCondition\n        Utils.b(")
    f.write(raw_input("byte basePP: "))
    f.write("), //byte basePP\n        Utils.b(")
    f.write(raw_input("byte power: "))
    f.write("), //byte power\n        Utils.b(")
    f.write(raw_input("byte accuracy: "))
    f.write("), //byte accuracy\n        Utils.b(")
    f.write(raw_input("byte range: "))
    f.write("), //byte range\n        Utils.b(")
    f.write(raw_input("byte tmNumber: "))
    f.write("), //byte tmNumber\n        Utils.b(")
    f.write(raw_input("byte hmNumber: "))
    f.write("), //byte hmNumber\n        Utils.b(")
    f.write(raw_input("byte contestAppeal: "))
    f.write("), //byte contestAppeal\n        Utils.b(")
    f.write(raw_input("byte contestJam: "))
    f.write("), //byte contestJam\n        Utils.b(")
    f.write(raw_input("byte superContestAppeal: "))
    f.write("), //byte superContestAppeal\n        Utils.b(")
    f.write(raw_input("byte contestSpectacularAppeal: "))
    f.write("), //byte contestSpectacularAppeal\n        Utils.b(")
    f.write(raw_input("byte contestSpectacularJam: "))
    f.write("), //byte contestSpectacularJam\n        ")
    f.write(raw_input("boolean contact: "))
    f.write(", //boolean contact\n        ")
    f.write(raw_input("boolean affectedByProtect: "))
    f.write(", //boolean affectedByProtect\n        ")
    f.write(raw_input("boolean affectedByMagicCoat: "))
    f.write(", //boolean affectedByMagicCoat\n        ")
    f.write(raw_input("boolean affectedBySnatch: "))
    f.write(", //boolean affectedBySnatch\n        ")
    f.write(raw_input("boolean affectedByMirror: "))
    f.write(", //boolean affectedByMirror\n        ")
    f.write(raw_input("boolean affectedByKingsRock: "))
    f.write("), //boolean affectedByKingsRock\n")
    
    end = raw_input("Quit? y/n: ")
    if (end == "y"):
        f.close()
        running = False
