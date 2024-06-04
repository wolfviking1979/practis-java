package Mod2;

import java.util.Scanner;

public class loan_qualifier {
    public static void main(String[] args) {
        // Эта программа определяет удовлетворяет ли
        // клиент требованиям банка на получение ссуды.
        Scanner input = new Scanner(System.in);
        final double MIN_SALARY = 30000;
        final int MIN_YEARS = 2;
        double salary;
        int yearsOnJob;

        // Получить размер годовой заработной платы клиента.
        System.out.print("Введите свой годовой доход: ");
        salary = input.nextDouble();

        // Получить количество лет на текущем месте работы.
        System.out.print("Введите количество лет рабочего стажа: ");
        yearsOnJob = input.nextInt();

        // Определить, удовлетворяет ли клиент требованиям.
        if (salary >= MIN_SALARY) {
            if (yearsOnJob >= MIN_YEARS) {
                System.out.println("Ваша ссуда одобрена.");
            } else {
                System.out.println("Вы должны отработать " +
                        MIN_YEARS + "лет, чтобы получить одобрение.");
            }
        } else {
            System.out.println("Вы должны зарабатывать $" +
                    MIN_SALARY + " чтобы получить одобрение.");
        }
    }
}
