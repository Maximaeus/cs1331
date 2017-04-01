/**
 * Represents a regular fan at the Olympics.
 *
 * @author jmurphy61
 * @version 1.0
 *
 */
public class RegularFan implements Spectator {
    private Athlete favoriteAthlete;

    /**
     * Public constructor.
     * 
     * @param favoriteAthlete this Spectator's favorite athlete
     *
     */
    public RegularFan(Athlete favoriteAthlete) {
        this.favoriteAthlete = favoriteAthlete;
    }

    /**
     * Sets the new favorite athlete of this spectator.
     *
     * @param favoriteAthlete this spectator's favorite athlete... for now...
     */
    public void setFavoriteAthlete(Athlete favoriteAthlete) {
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
        System.out.println("Yay! Go " + favoriteAthlete.getName() + "!");
    }
}
