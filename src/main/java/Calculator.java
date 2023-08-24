import org.junit.jupiter.api.Test;
import static junit.framework.Assert.assertEquals;

/**
 Created by Oleg Sokolovsky
 */

public class Calculator {

    private String operation;

    private long x;

    private long y;

    private long result;

    public Calculator(String operation, long x, long y) {
        this.operation = operation;
        this.x = x;
        this.y = y;
    }

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }

    public void calculateResult() {
        try {
            if (operation.equals("+")) {

                setResult(x + y);
            } else if (operation.equals("-")) {

                setResult(x - y);
            } else if (operation.equals("*")) {

                setResult(x * y);
            } else if (operation.equals("/")) {

                setResult(x / y);
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}

class  CalculatorTests {

    @Test
    public void calculatorMinusTest() {
        Calculator calc = new Calculator("-", 100, 100);
        calc.calculateResult();
        assertEquals(0, calc.getResult());
    }

    @Test
    public void calculatorPlusTest() {
        Calculator calc = new Calculator("+", 100, 100);
        calc.calculateResult();
        assertEquals(200, calc.getResult());
    }

    @Test
    public void calculatorDivisionTest() {
        Calculator calc = new Calculator("/", 100, 100);
        calc.calculateResult();
        assertEquals(1, calc.getResult());
    }

    @Test
    public void calculatorMultiplicationTest() {
        Calculator calc = new Calculator("*", 100, 100);
        calc.calculateResult();
        assertEquals(10000, calc.getResult());
    }

}
