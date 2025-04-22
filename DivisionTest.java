package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    @Test
    public void testDividePositiveNumbers() {
        Calculator calc = new Division();
        assertEquals(2.0, calc.calculate(10, 5));
    }

    @Test
    public void testDivideByZero() {
        Calculator calc = new Division();
        assertThrows(IllegalArgumentException.class, () -> calc.calculate(10, 0));
    }
}
