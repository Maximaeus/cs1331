public class JavelinThrower extends Athlete {
    private double javelinDamage;

    public JavelinThrower(String name, boolean isACheater, double javelinDamage) {
        super(name, isACheater);
        this.javelinDamage = javelinDamage;
    }

    /**
     * @return the damage this athlete's javelin inflicts.
     *
     */
    public double getJavelinDamage() {
        return this.javelinDamage;
    }

    @Override
    public void play() {
        System.out.println(String.format("%s throws the javelin and inflicts"
            + " %f damage!", getName(), this.javelinDamage));
    }
}