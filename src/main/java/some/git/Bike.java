package some.git;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bike implements Vehicle {
    private static final Logger LOGGER = LoggerFactory.getLogger(Bike.class);
    private static final String MOVE_MESSAGE = "I'M A BIKE";
    private final int numberOfTires;

    public Bike(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    @Override
    public int getNumberOfTires() {
        return numberOfTires;
    }

    @Override
    public void move() {
        LOGGER.info(MOVE_MESSAGE);
    }
}
