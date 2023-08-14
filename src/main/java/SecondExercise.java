import java.util.Scanner;

/**
 Created by Oleg Sokolovsky
 */

public class SecondExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: 1 - калькулятор, 2 - максимальное число из массива");
        int choose = sc.nextInt();

        if (choose == 1) {

        System.out.println("Введите первое дробное число с запятой");
        float x = sc.nextFloat();

        System.out.println("Какую операцию необходимо произвести? + - / *");
        char y = sc.next().charAt(0);

        System.out.println("Введите второе дробное число с запятой");
        float z = sc.nextFloat();

        float result = 0;

        switch (y) {
            case '+':
                result = x + z;
            break;
            case '-':
                result = x - z;
            break;
            case '/':
                result = x / z;
            break;
            case '*':
                result = x * z;
                break;
            default:
                System.out.println("Выбрана неверная операция");
                break;
        }
        // вывод результата с округлением до 4-х знаков после запятой
        System.out.printf("Сумма чисел = %.4f", result); }
        else if (choose == 2) {
            System.out.println("Введите размер массива");

            int x = sc.nextInt();

            int count = 0;

            String biggestString = "";

            String[] arrays = new String[x];

            while (count<x) {
                System.out.println("Введите слово");
                arrays[count] = sc.next();
                count++;
            }

            for (int i = 0; i < arrays.length; i++) {
                if (arrays[i].length() > biggestString.length()) {
                    biggestString = arrays[i];
                }
            }
            // вывод самого длинного слова в массиве
            System.out.println("Самое длинное слово в массиве: " + biggestString);

        }
        // в случае ввода неверного числа, при выборе между калькулятором и массивом
        else System.out.println("Введено неверное число");
        sc.close();
    }
}
