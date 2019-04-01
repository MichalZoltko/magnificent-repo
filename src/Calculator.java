import java.math.BigDecimal;

public class Calculator {

    public Calculator() {
    }

    public int calculatePower(int x) {
        return x * x;
    }
    public int calculateSum(int y) {
        return y + y;
    }

    public int calculateSubstract(int z) {
        return z - 1;
    }

    public double calculateDivision(int p) {
        return (double) p / (double) (p - 1);
    }
}

