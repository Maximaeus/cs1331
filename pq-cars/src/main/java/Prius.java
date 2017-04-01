public class Prius implements Car {

    private static final double MPG = 50; // miles per gallon
    private static final int TANK_SIZE = 12; // gallons

    public double getRange() {
        return TANK_SIZE * MPG;
    }

    public int getHorsepower() {
        return 134;
    }

    @Override
    public String toString() {
        return "ToyotaPrius";
    }
}
