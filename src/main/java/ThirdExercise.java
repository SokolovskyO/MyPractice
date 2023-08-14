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
            presentMethod();
        } else
        System.out.println("Выбрано неверное значение");
        sc.close();
    }

    public static void arrayMethod() {
        Random random = new Random();

        int x = 0;

        int y = 0;

        int min = -10;

        int max = 10;

        int dif = max - min;

        int maxMin = 0;

        int minMax = 999;

        int[] array = new int[10];

        for (int i = 0; i < array.length-1; i++) {
            array[i] = random.nextInt(dif + 1) + min;
        }

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < 0) {
                if (array[i] < maxMin) {
                    maxMin = array[i];
                    x = i;
                }
            } else if (array[i] >= 0) {
                if (array[i] < minMax) {
                    minMax = array[i];
                    y = i;
                }
            }
        }

        array[y] = maxMin;

        array[x] = minMax;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void presentMethod() {
        Scanner sc  = new Scanner(System.in);
        int totalPrice = 0;
        int totalWeight = 0;

        System.out.println("Введите число подарков: ");
        int presentQuantity = sc.nextInt();

        Present present;

        List<Present> arrays = new ArrayList<>();

        for (int i = 0; i < presentQuantity; i++) {
            arrays.add(present = new Present());

            System.out.println("Введите название подарка: ");
            present.setName(sc.next());

            System.out.println("Введите вес подарка: ");
            present.setWeight(sc.nextInt());

            System.out.println("Введите цену подарка: ");
            present.setPrice(sc.nextInt());

            System.out.println("Введите уникальный параметр подарка: ");
            present.setParameter(sc.next());
        }

        System.out.println("Подарок содержит: ");
        for (Present p: arrays
             ) {
            System.out.println(p.returnProperties(p));
            totalPrice = p.getPrice() + p.getPrice();
            totalWeight = p.getWeight() + p.getWeight();
        }
        System.out.println("Общая цена: " + totalPrice);
        System.out.println("Общий вес: " + totalWeight);
    }

    static class Present {
        String name;

        int price;

        int weight;

        String parameter;

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public int getWeight() {
            return weight;
        }

        public String getParameter() {
            return parameter;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setParameter(String parameter) {
            this.parameter = parameter;
        }

         String returnProperties(Present present) {
           return "Название: " + present.getName() + ", параметр: " + present.getParameter() + ", цена: " + present.getPrice() + ", вес: " + present.getWeight();
        }
    }
}
