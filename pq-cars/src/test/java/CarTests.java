import static org.junit.Assert.*;
import static org.junit.Assume.*;
import org.junit.Test;

import java.lang.reflect.*;
import java.util.Arrays;

public class CarTests {
    private static Class<?> carClass;

    public static Class<?> getCarClass() {
        try {
            return Class.forName("Car");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static boolean carClassExists() {
        try {
            carClass = Class.forName("Car");
        } catch (ClassNotFoundException e) {
            return false;
        }
        return true;
    }

    @Test
    public void carExists() {
        assertTrue("-60 Could not find Car interface", carClassExists());
    }

    @Test
    public void carInterface() {
        assumeTrue(carClassExists());
        assertTrue("-10 Car is not an interface",
            Modifier.isInterface(carClass.getModifiers()));
    }

    @Test
    public void priusImplements() {
        assumeTrue(carClassExists());
        assertTrue("-10 Prius class doesn't implement Car",
            Arrays.asList(Prius.class.getInterfaces()).contains(carClass));
    }

    @Test
    public void hummerImplements() {
        assumeTrue(carClassExists());
        assertTrue("-10 Hummer class doesn't implement Car",
            Arrays.asList(Hummer.class.getInterfaces()).contains(carClass));
    }

    @Test
    public void carGetRange() {
        assumeTrue(carClassExists());
        try {
            carClass.getMethod("getRange");
        } catch (NoSuchMethodException e) {
            fail("-5 no getRange method in Car");
        }
    }

    @Test
    public void carGetHorsepower() {
        assumeTrue(carClassExists());
        try {
            carClass.getMethod("getHorsepower");
        } catch (NoSuchMethodException e) {
            fail("-5 no getHorsepower method in Car");
        }
    }

    @Test
    public void priusGetRange() {
        assertEquals("-2 Prius getRange() returns incorrect value",
                600.0, new Prius().getRange(), 0.1);
    }

    @Test
    public void hummerGetRange() {
        assertEquals("-2 Hummer getRange() returns incorrect value",
                238.0, new Hummer().getRange(), 0.1);
    }

    @Test
    public void priusGetHorsepower() {
        assertEquals("-2 Prius getHorsepower() returns incorrect value",
            134, new Prius().getHorsepower());
    }

    @Test
    public void hummerGetHorsepower() {
        assertEquals("-2 Hummer getHorsepower() returns incorrect value",
            300, new Hummer().getHorsepower());
    }
}
