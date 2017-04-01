public class SoccerPlayer extends Athlete {
    private boolean canScoreGoal;

    /**
     * Public constructor.
     *
     * @param name the name of this SoccerPlayer
     * @param isACheater whether or not this SoccerPlayer is a cheater
     * @param canScoreGoal whether or not this athlete can score a soccer goal.
     *
     */
    public SoccerPlayer(String name, boolean isACheater, boolean canScoreGoal) {
        super(name, isACheater);
        this.canScoreGoal = canScoreGoal;
    }

    /**
     * @return whether or not this athlete is good at soccer.
     *
     */
    public boolean getCanScoreGoal() {
        return this.canScoreGoal;
    }

    @Override
    public void play() {
        System.out.println(String.format("%s shoots and %s!",
            getName(), canScoreGoal ? "scores" : "misses"));
    }
}
