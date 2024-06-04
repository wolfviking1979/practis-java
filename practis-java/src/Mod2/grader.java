package Mod2;

// Эта программа получает от пользователя количество баллов
// и показывает соответствующий буквенный уровень знаний.

import java.util.Scanner;

public class grader {
    public static void main(String[] args) {
        // Именнованные константы представляющие пороги уровней.
        final int A_SCORE = 90;
        final int B_SCORE = 80;
        final int C_SCORE = 70;
        final int D_SCORE = 60;
        int score;

        // Получить от пользователя баллы за контрольную работу.
        Scanner input = new Scanner(System.in);
        System.out.print("Введите свои баллы: ");
        score = input.nextInt();

        // Определить буквенный уровень.
        if (score >= A_SCORE) {
            System.out.println("Ваш уровень: A");
        } else if (score >= B_SCORE) {
            System.out.println("Ваш уровень: B");
        } else if (score >= C_SCORE) {
            System.out.println("Ваш уровень: C");
        } else if (score >= D_SCORE) {
            System.out.println("Ваш уровень: D");
        } else {
            System.out.println("Ваш уровень: F");
        }


    }
}
