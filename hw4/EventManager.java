/**
 * Represents a very overworked event manager.
 *
 * I think this class violated both the Single Responsibility and
 * Open/Closed Principles. When the budget got cut, Confused Coder
 * threw more functionality into this class instead of extending it,
 * or creating new classes, resulting in a class that did more than
 * it should have. To fix things, I moved the training related
 * int a Coach class, the food related methods and variables to a
 * Chef class, the cheating related methods to a Judge class, and
 * playGame() into the Athlete class.
 *
 * @author jmurphy61
 * @version 2.0
 */
public class EventManager {

    /**
     * Has all of the athletes compete.
     *
     * @param athletes the athletes to play.
     */
    public void organizeGames(Athlete... athletes) {
        for (Athlete athlete : athletes) {
            athlete.playGame();
        }
    }
}
