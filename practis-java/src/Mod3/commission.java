package Mod3;

// Эта программа вычисляет торговые комиссионные.

import java.util.Scanner;

public class commission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Создать переменную для управления циклом.
        String keep_going = "д";

        // Вычислить сереию комиссионных вознаграждений.
        while (keep_going.equals("д")) {

            // Получить продажи продавца и его ставку комиссионных.
            System.out.print("Введите объем продаж: ");
            double sales = input.nextDouble();

            System.out.print("Введите ставку комиссионных: ");
            double comm_rate = input.nextDouble();

            // Рассчитать комиссионное вознаграждение.
            double commission = sales * comm_rate;

            // Показать комиссионное вознаграждение.
            System.out.printf("Комиссионное вознаграждение состовляет: $%,.2f\n", commission);

            // Убедиться, что пользователь хочет вычислить еще одно вознаграждение.
            System.out.println("Хотите вычислить еще одно?");
            System.out.print("Если да = д, нет все остальное: ");
            keep_going = input.nextLine();
        }

    }
}
