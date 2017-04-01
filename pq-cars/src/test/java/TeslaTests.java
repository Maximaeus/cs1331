import static org.junit.Assert.*;
import static org.junit.Assume.*;
import org.junit.Test;

import java.lang.reflect.*;
import java.util.Arrays;

public class TeslaTests {
    private static final String TESLA_CLASS_NAME = "TeslaRoadster";
    private static final double TESLA_RANGE = 244.0;
    private static final int TESLA_HORSEPOWER = 288;

    private Class<?> teslaClass;
    private Class<?> carClass = CarTests.getCarClass();

    private boolean teslaClassExists() {
        try {
            teslaClass = Class.forName(TESLA_CLASS_NAME);
        } catch (ClassNotFoundException e) {
            return false;
        }
        return true;
    }

    @Test
    public void teslaExists() {
        assertTrue("-40 Could not find class " + TESLA_CLASS_NAME, teslaClassExists());
    }

    @Test
    public void teslaImplements() {
        assumeTrue(CarTests.carClassExists());
        assumeTrue(teslaClassExists());
        assertTrue("-10 " + TESLA_CLASS_NAME + " class doesn't implement Car",
            Arrays.asList(teslaClass.getInterfaces()).contains(carClass));
    }

    @Test
    public void teslaConstructor() {
        assumeTrue(CarTests.carClassExists());
        assumeTrue(teslaClassExists());
        try {
            teslaClass.getConstructor(int.class, double.class);
        } catch (Exception e) {
            fail("-5 couldn't find constructor for " + TESLA_CLASS_NAME + " that takes in a horsepower and range");
        }
    }

    @Test
    public void teslaGetRange() {
        assumeTrue(CarTests.carClassExists());
        assumeTrue(teslaClassExists());
        try {
            Object tesla = teslaClass.getConstructor(int.class, double.class)
                .newInstance(TESLA_HORSEPOWER, TESLA_RANGE);

            assertEquals("-5 " + TESLA_CLASS_NAME
                + " getRange() returns incorrect value", TESLA_RANGE,
                (Double) teslaClass.getMethod("getRange").invoke(tesla), 0.1);
        } catch (NoSuchMethodException e) {
            fail("-5 getRange() isn't present in Car, can't test return value in " + TESLA_CLASS_NAME);
        } catch (InvocationTargetException | IllegalAccessException | InstantiationException e) {
            fail("-5 " + TESLA_CLASS_NAME + " doesn't have a constructor that takes in a horsepower and range; can't test method");
        }
    }

    @Test
    public void teslaGetHorsepower() {
        assumeTrue(CarTests.carClassExists());
        assumeTrue(teslaClassExists());
        try {
            Object tesla = teslaClass.getConstructor(int.class, double.class)
                .newInstance(TESLA_HORSEPOWER, TESLA_RANGE);

            assertEquals("-5 " + TESLA_CLASS_NAME + " getHorsepower() returns incorrect value",
                TESLA_HORSEPOWER, teslaClass.getMethod("getHorsepower").invoke(tesla));
        } catch (NoSuchMethodException e) {
            fail("-5 getHorsepower() isn't present in Car, can't test return value in " + TESLA_CLASS_NAME);
        } catch (InvocationTargetException | IllegalAccessException | InstantiationException e) {
            fail("-5 " + TESLA_CLASS_NAME + " doesn't have a constructor that takes in a horsepower and range; can't test method");
        }
    }

}
