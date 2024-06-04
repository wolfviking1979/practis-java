package Mod2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int high_score = 95;
        double average ;

        System.out.print("Введите оценку 1: ");
        double test1 = input.nextDouble();
        System.out.print("Введите оценку 2: ");
        double test2 = input.nextDouble();
        System.out.print("Введите оценку 3: ");
        double test3 = input.nextDouble();
        System.out.println(" ");

        // Расчитать средний бал.
        average = (test1 + test2 + test3) / 3;

        // Напечатать средний бал.
        System.out.printf("Средний бал состовляет: %,.1f\n", average);

        // Если средний бал высокий поздравить пользователя.
        if (average >= high_score) {
            System.out.println("Поздравляем!");
            System.out.println("Отличный средний бал!");
        }

    }
}
