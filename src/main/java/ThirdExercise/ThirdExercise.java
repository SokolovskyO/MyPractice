package ThirdExercise;

import java.util.*;

/**
 Created by Oleg Sokolovsky
 */

public class ThirdExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите программу: 1 - массив размерностью 20, 2 - формируется сладкий подарок");
        int choose = sc.nextInt();
        if (choose == 1) {
            arrayMethod();
        } else if (choose == 2) {
                double totalPrice = 0;
                int totalWeight = 0;
                Cake cake = new Cake(300,400, 500);
                Cake cake2 = new Cake();
                cake2.setPrice(1000);
                cake2.setCalories(300);
                cake2.setWeight(500);
                Chocolate chocolate = new Chocolate(100, 120, "Switzerland");
                Candy candy = new Candy(50, 30, "Pineapple");
                Present[] box = {cake, cake2, chocolate, candy};
            for (Present presents: box
                 ) {
                System.out.println(presents.toString());
                totalPrice = totalPrice + presents.getPrice();
                totalWeight = totalWeight + presents.getWeight();
            }
            System.out.println("[total price = " + totalPrice + "]");
            System.out.println("[total weight = " + totalWeight + "]");
        } else {
        System.out.println("Выбрано неверное значение");
        }
        sc.close();
    }

    public static void arrayMethod() {
        Random random = new Random();

        int x = 0;

        int y = 0;

        int min = -10;

        int max = 10;

        int dif = max - min;

        int maxMin = -999;

        int minMax = 999;

        int[] array = new int[20];

        for (int i = 0; i < array.length-1; i++) {
            array[i] = random.nextInt(dif + 1) + min;
        }

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < 0) {
                if (array[i] > maxMin) {
                    maxMin = array[i];
                    x = i;
                }
            } else if (array[i] > 0) {
                if (array[i] < minMax) {
                    minMax = array[i];
                    y = i;
                }
            }
        }

        array[y] = maxMin;

        array[x] = minMax;

        System.out.println(Arrays.toString(array));
    }
}
