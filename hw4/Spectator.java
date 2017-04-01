/**
 * Represents a spectator at the Olympics.
 *
 * As class and subclass, Spectator and SuperFan violated the Liskov
 * Substitution Principle. Since the favoriteAthlete of a SuperFan
 * does not change, a SuperFan cannot be a Spectator. To resolve, I
 * changed Spectator.java to be an interface that only promises
 * a favoriteAthlete and the capacity to cheer.
 *
 * @author Confused Coder
 * @author jmurphy61
 *
 * @version 2.0
 */
public interface Spectator {
    Athlete getFavoriteAthlete();
    void cheerForFavorite();
}
