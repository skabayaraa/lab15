
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTest {

    @Test
    public void testMultiplyPositiveNumbers() {
        Calculator calc = new Multiplication();
        assertEquals(20.0, calc.calculate(4, 5));
    }

    private void assertEquals(double d, double calculate) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    private void assertEquals(double d, double calculate) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    public void testMultiplyByZero() {
        Calculator calc = new Multiplication();
        assertEquals(0.0, calc.calculate(0, 5));
    }
}
