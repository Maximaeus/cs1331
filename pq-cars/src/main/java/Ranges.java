public class Ranges {

    public static void main(String[] args) {
        worksWhenStarting();
        worksWhenFinished();
    }

    private static void worksWhenStarting() {
        Prius testPrius = new Prius();
        Hummer testHummer = new Hummer();

        System.out.println(testPrius + "/" + testPrius.getHorsepower() + "/"
                + testPrius.getRange());
        System.out.println(testHummer + "/" + testHummer.getHorsepower() + "/"
                + testHummer.getRange());
    }

    private static void worksWhenFinished() {
        Car[] testCars = {new Prius(),
                          new Hummer(),
                          new TeslaRoadster(100, 200.5)
        };

        for (Car testCar: testCars) {
            System.out.println(testCar + " gets " + testCar.getHorsepower()
                + "hp and has a range of " + testCar.getRange() + " miles.");
        }
    }
}
