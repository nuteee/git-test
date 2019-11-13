package some.git;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private static final int NUMBER_OF_TIRES = 5;

    @Test
    public void testNumberOfTires() {
        Car car = new Car(NUMBER_OF_TIRES);

        assertEquals(NUMBER_OF_TIRES, car.getNumberOfTires());
    }
}
