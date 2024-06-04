package Mod2;

import java.util.Scanner;

public class weeksDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число от 1 до 7: ");
        int userInput = input.nextInt();

        switch (userInput){
            case 1 -> System.out.println("Сегодня Понедельник");
            case 2 -> System.out.println("Сегодня Вторник");
            case 3 -> System.out.println("Сегодня Среда");
            case 4 -> System.out.println("Сегодня Четверг");
            case 5 -> System.out.println("Сегодня Пятница");
            case 6 -> System.out.println("Сегодня Суббота");
            case 7 -> System.out.println("Сегодня Воскресенье");
            default -> System.out.println("Ошибка: Неверный ввод!");
        }
    }
}
