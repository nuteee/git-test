package some.git;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car implements Vehicle {
    private static final Logger LOGGER = LoggerFactory.getLogger(Car.class);

    private final int numberOfTires;
    private static final String MOVE_MESSAGE = "WROOM WROOM I'M A CAR";

    public Car(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    @Override
    public int getNumberOfTires() {
        LOGGER.info("Counting the number of tires: {}", numberOfTires);
        LOGGER.info("Counting the number of tires: {}", numberOfTires);
        return numberOfTires;
    }

    @Override
    public void move() {
        LOGGER.info(MOVE_MESSAGE);
    }
}
