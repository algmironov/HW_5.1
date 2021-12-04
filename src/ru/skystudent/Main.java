package ru.skystudent;

public class Main {

    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int[] accountingBook = new int[30];
        for (int i = 0; i < accountingBook.length; i++) {
            accountingBook[i] = random.nextInt(100_000) + 100_000;
        }

        System.out.print("\n");
        //Задание 1
        int monthSpendSum = 0;
        for (int i = 0; i < accountingBook.length; i++) {
            monthSpendSum += accountingBook[i];
        }
        System.out.println("Сумма трат за месяц составила " + monthSpendSum + " рублей");
        System.out.print("\n");

        //Задание 2

        int maxSpend = 99_000;
        int minSpend = 200_000;
        for (int i = 0; i < accountingBook.length; i++) {
            if (maxSpend < accountingBook[i]) {
                maxSpend = accountingBook[i];
            }
        for (int ii = 0; ii < accountingBook.length; ii++) {
            if (minSpend > accountingBook[ii]) {
                minSpend = accountingBook[ii];
            }
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpend + " рублей. Максимальная сумма трат за день составила " + maxSpend + " рублей");
        System.out.print("\n");

        //Задание 3

        float averageSpend = monthSpendSum / 30f;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpend + " рублей");
        System.out.print("\n");

        //Задание 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }


    }
}
