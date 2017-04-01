public class Hummer implements Car {

    private static final double MPG = 8.5; // miles per gallon
    private static final int TANK_SIZE = 28; // gallons

    public double getRange() {
        return (double) TANK_SIZE * MPG;
    }

    public int getHorsepower() {
        return 300;
    }

    @Override
    public String toString() {
        return "Hummer";
    }
}
