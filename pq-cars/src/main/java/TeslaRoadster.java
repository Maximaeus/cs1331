public class TeslaRoadster implements Car {
    private int horsepower;
    private double range;

    public TeslaRoadster(int horsepower, double range) {
        this.horsepower = horsepower;
        this.range = range;
    }

    public double getRange() {
        return range;
    }

    public int getHorsepower() {
        return horsepower;
    }
}