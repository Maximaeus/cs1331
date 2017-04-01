public class TennisPlayer extends Athlete {
    private int serveSpeed;

    /**
     *
     * Public constructor.
     *
     * @param name name of this TennisPlayer.
     * @param isACheater whether or not this TennisPlayer is a cheater.
     * @param serveSpeed serve speed of this TennisPlayer in mph
     *
     */
    public TennisPlayer(String name, boolean isACheater, int serveSpeed) {
        super(name, isACheater);
        this.serveSpeed = serveSpeed;
    }

    /**
     * @return the  serveSpeed of this TennisPlayer.
     *
     */
    public int getServeSpeed() {
        return this.serveSpeed;
    }

    @Override
    public void play() {
        System.out.println(String.format("%s serves the ball at %dmph!",
            getName(), this.serveSpeed));
    }
}
