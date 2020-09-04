import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private static Calculator calculator;
    private static int positive = 5;
    private static int negative = -2;
    private static int zero = 0;


    @BeforeAll
    public static void createNewCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void plusTest() {
        Assertions.assertEquals(3, calculator.plus.apply(positive, negative));
    }

    @Test
    public void minusTest() {
        Assertions.assertEquals(7, calculator.minus.apply(positive, negative));
    }

    @Test
    public void multiplyTest() {
        Assertions.assertEquals(0, calculator.multiply.apply(zero, positive));
    }

    @Test
    public void devideOnTheZero() {
        Assertions.assertEquals(0, calculator.devide.apply(positive, zero));
    }

    @Test
    public void powTest() {
      assertThat(25,equalTo(calculator.pow.apply(positive)));
    }

    @Test
    public void isPositiveTestTrue() {
        assertThat(true, equalTo(calculator.isPositive.test(positive)));
    }

    public void isPositiveTestFalse() {
        assertThat(false, equalTo(calculator.isPositive.test(negative)));
    }
}
