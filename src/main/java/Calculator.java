import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static junit.framework.Assert.assertEquals;


public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CalculatorNumbers calculatorNumbers = new CalculatorNumbers();

        Calculator calc = new Calculator();

        System.out.println("Введите операцию на выбор: + - * /");
        String operation = sc.next();

        try {
            if (operation.equals("+")) {
                System.out.println("Введите первое число:");
                calculatorNumbers.setX(sc.nextLong());

                System.out.println("Введите второе число:");
                calculatorNumbers.setY(sc.nextLong());

                System.out.println(calc.plus(calculatorNumbers.getX(), calculatorNumbers.getY()));
            } else if (operation.equals("-")) {
                System.out.println("Введите первое число:");
                calculatorNumbers.setX(sc.nextLong());

                System.out.println("Введите второе число:");
                calculatorNumbers.setY(sc.nextLong());

                System.out.println(calc.minus(calculatorNumbers.getX(), calculatorNumbers.getY()));
            } else if (operation.equals("*")) {
                System.out.println("Введите первое число:");
                calculatorNumbers.setX(sc.nextLong());

                System.out.println("Введите второе число:");
                calculatorNumbers.setY(sc.nextLong());

                System.out.println(calc.multiplication(calculatorNumbers.getX(), calculatorNumbers.getY()));
            } else if (operation.equals("/")) {
                System.out.println("Введите первое число:");
                calculatorNumbers.setX(sc.nextLong());

                System.out.println("Введите второе число:");
                calculatorNumbers.setY(sc.nextLong());

                System.out.println(calc.division(calculatorNumbers.getX(), calculatorNumbers.getY()));
            } else {
                System.out.println("Выбрана неверная операция");
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

     long plus(long x, long y) {
        return x + y;
    }

     long minus(long x, long y) {
        return x - y;
    }

    long division(long x, long y) {
        return x / y;
    }

    long multiplication(long x, long y) {
        return x * y;
    }

} class CalculatorNumbers {
    private long x;

    private long y;

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public void setX(long x) {
        this.x = x;
    }

    public void setY(long y) {
        this.y = y;
    }

}
class  CalculatorTests {

    @Test
    public void calculatorMinusTest() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.minus(100, 100));
    }

    @Test
    public void calculatorPlusTest() {
        Calculator calc = new Calculator();
        assertEquals(200, calc.plus(100, 100));
    }

    @Test
    public void calculatorDivisionTest() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.division(100, 100));
    }

    @Test
    public void calculatorMultiplicationTest() {
        Calculator calc = new Calculator();
        assertEquals(10000, calc.multiplication(100, 100));
    }

}
