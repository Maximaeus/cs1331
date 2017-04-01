/**
 * Main entry point for the Olympics program.
 *
 * @author jmurphy61
 * @version 1.0
 *
 */
public class Olympics {
    /**
     * @param args unused
     *
     */
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        Judge judge = new Judge();
        Chef chef = new Chef();
        Coach coach = new Coach();

        Spectator[] spectators = new Spectator[8];
        Athlete[] athletes = {new JavelinThrower("James", false, 30.1),
                              new ProSitter("Patty", true, 7.0),
                              new SoccerPlayer("Santiago", false, false),
                              new TennisPlayer("Terry", false, 90)};
        for (int i = 0; i < 4; i++) {
            athletes[i].play();
            spectators[i] = new RegularFan(athletes[i]);
            spectators[i + 4] = new SuperFan(athletes[i]);
        }

        coach.trainAthletes(athletes);
        chef.feedAthletes(athletes);
        judge.inspectAthletes(athletes);
        eventManager.organizeGames(athletes);

        for (Spectator spectator : spectators) {
            spectator.cheerForFavorite();
        }
    }
}
