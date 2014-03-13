package student;

import java.util.Random;

public class RandomEnum<E extends Enum> {
	private static final Random RDM = new Random();
    private final E[] values;

    public RandomEnum(Class<E> e) {
        values = e.getEnumConstants();
    }

    public E getRandomValue() {
        return values[RDM.nextInt(values.length)];
    }
}
