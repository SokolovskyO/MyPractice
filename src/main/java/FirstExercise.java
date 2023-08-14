import java.util.Scanner;

/**
Created by Oleg Sokolovsky
 */

public class FirstExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое дробное число с запятой");
        float x = sc.nextFloat();

        System.out.println("Введите второе дробное число с запятой");
        float y = sc.nextFloat();

        float result = x + y;

        // вывод результата с округлением до 4-х знаков после запятой
        System.out.printf("Сумма чисел = %.4f", result);

        sc.close();
    }
}

