import java.util.Scanner;

/**
Created by Oleg Sokolovsky
 */

public class FirstExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое дробное число");
        float x = sc.nextFloat();

        System.out.println("Введите второе дробное число");
        float y = sc.nextFloat();

        float result = x + y;

        System.out.printf("Сумма чисел = %.4f", result);

        sc.close();


    }

}

