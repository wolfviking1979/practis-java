package Mod3;

import java.util.Scanner;

public class task3_2 {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        int number1 = new Scanner(System.in).nextInt();

        System.out.print("Введите второе число: ");
        int number2 = new Scanner(System.in).nextInt();

        int result = number1 + number2;

        System.out.printf("Сумма чисел %d и %d равна: %d", number1, number2, result);

    }
}
