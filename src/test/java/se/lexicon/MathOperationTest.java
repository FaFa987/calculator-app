package se.lexicon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathOperationTest {

    @Test
    public void testSubtract() {

        Assertions.assertNotEquals(9, MathOperations.subtract(15, 5));

    }

    @Test
    public void testSubtract2() {
int expected = 10;
int actual = MathOperations.subtract(15, 5);
        Assertions.assertEquals(expected, actual);

    }
}
