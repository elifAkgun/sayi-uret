package code.elif.impl;

import code.elif.NumberGenerator;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator {

    // == fields ==
    private final Random random = new Random();

    private int maxNumber = 100;

    // == public methods ==
    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;

    }
}
