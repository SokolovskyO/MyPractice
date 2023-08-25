import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 Created by Oleg Sokolovsky
 */

public class Calculator {

    private String operation;

    private double x;

    private double y;

    private double result;

    public Calculator(String operation, double x, double y) {
        this.operation = operation;
        this.x = x;
        this.y = y;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void calculateResult() throws Exception {

            if (operation.equals("+")) {

                setResult(x + y);
            } else if (operation.equals("-")) {

                setResult(x - y);
            } else if (operation.equals("*")) {

                setResult(x * y);
            } else if (operation.equals("/")) {

                setResult(x / y);

                if (Double.isInfinite(getResult())) {
                    throw new Exception("Ошибка: на ноль делить нельзя");
                }
            }  else if (!operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
                throw new Exception("Ошибка: выбрана неверная математическая операция");
            }


}

static class CalculatorTests {

    @Test
    public void exceptionDivisionOnZeroTest() throws Throwable {
        try {
            Calculator calc = new Calculator("/", 9.0, 0);
        calc.getResult();
        }
        catch (Exception e) {
            assertEquals(e.getMessage(), "Ошибка: на ноль делить нельзя");
        }
    }

    @Test
    public void exceptionWrongOperationTest() throws Throwable {
        try {
            Calculator calc = new Calculator("$", 10, 10);
            calc.getResult();
        }
        catch (Exception e) {
            assertEquals(e.getMessage(), "Ошибка: выбрана неверная математическая операция");
        }
    }

    @Test
    public void calculatorMinusTest() throws Throwable {
        Calculator calc = new Calculator("-", 100, 100);
        calc.calculateResult();
        assertEquals(0, calc.getResult());
    }

    @Test
    public void calculatorPlusTest() throws Throwable {
        Calculator calc = new Calculator("+", 100, 100);
        calc.calculateResult();
        assertEquals(200, calc.getResult());
    }

    @Test
    public void calculatorDivisionTest() throws Throwable {
        Calculator calc = new Calculator("/", 100, 100);
        calc.calculateResult();
        assertEquals(1, calc.getResult());
    }

    @Test
    public void calculatorMultiplicationTest() throws Throwable {
        Calculator calc = new Calculator("*", 0, 10);
        calc.calculateResult();
        assertEquals(10000, calc.getResult());
    }
    }
}
