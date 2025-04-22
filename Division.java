package lab15.sict.must.edu.mn;

public class Division implements Calculator {
    @Override
    public double calculate(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }
}
