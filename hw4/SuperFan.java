/**
 * Represents a superfan at the Olympics.
 *
 * @author Confused Coder
 * @author jmurphy61
 *
 * @version 1.0
 */
public class SuperFan implements Spectator {
    private Athlete favoriteAthlete;

    /**
     * Public constructor.
     *
     * @param favoriteAthlete this spectator's favorite athlete... for now...
     */
    public SuperFan(Athlete favoriteAthlete) {
        this.favoriteAthlete = favoriteAthlete;
    }

    /**
     * @return this spectator's favorite athlete... for now...
     */
    public Athlete getFavoriteAthlete() {
        return this.favoriteAthlete;
    }

    /**
     * Prints out a cheer for this spectator's favorite athlete!
     */
    public void cheerForFavorite() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I LOVE YOU " + getFavoriteAthlete().getName()
                + "!!!!!!!!!!");
        }
    }
}
