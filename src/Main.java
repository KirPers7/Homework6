public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");

        for (byte i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        //Задание 2
        System.out.println("Задание 2");

        for (byte i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println();

        //Задание 3
        System.out.println("Задание 3");

        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }

        System.out.println();

        //Задание 4
        System.out.println("Задание 4");

        for (byte i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println();

        //Задание 5
        System.out.println("Задание 5");

        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println();

        //Задание 6
        System.out.println("Задание 6");

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        //Задание 7
        System.out.println("Задание 7");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        //Задание 8
        System.out.println("Задание 8");

        int cash = 29000;
        int totalSum = 0;

        for (byte i = 1; i <= 12; i++) {
            totalSum = totalSum + cash;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSum + " рублей");
        }

        System.out.println();

        //Задание 9
        System.out.println("Задание 9");

        int cash2 = 29000;
        double totalSum2 = 0;

        for (byte i = 1; i <= 12; i++) {
            totalSum2 = totalSum2 + totalSum2 * 12 / 100;
            totalSum2 = totalSum2 + cash2;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSum2 + " рублей");
        }

        System.out.println();

        //Задание 10
        System.out.println("Задание 10");

        int productOfNumbers;

        for (int i = 1; i <= 10; i++) {
            productOfNumbers = 2 * i;
            System.out.println("2*" + i + "=" + productOfNumbers);
        }

        System.out.println();
    }
}