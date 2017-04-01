public enum VendingItem {
    LAYS(1.5),
    DORITOS(1.5),
    COKE(2.5),
    RAMBLIN_RECK_TOY(180.75),
    RUBIKS_CUBE(30.0),
    RAT_CAP(15.0),
    FASET_LANYARD(10.0),
    GRAPHING_CALCULATOR(120.0),
    UGA_DIPLOMA(0.10),
    PIE(3.14),
    CLICKER(55.55),
    CHEETOS(1.25),
    SPRITE(2.50),
    RED_BULL(4.75),
    RAMEN(3.15);

    private final double price;

    VendingItem(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        //TO-DO
        return name() + ": $" + price;
    }
}
