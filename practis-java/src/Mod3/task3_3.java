package Mod3;

import java.util.Scanner;

public class task3_3 {
    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        int user_input = new Scanner(System.in).nextInt();

        for (int i = 1; i < user_input + 1; i++) {
            for (int j = 1; j < user_input + 1; j++) {
                if (i * j == user_input) {
                    System.out.println(i + " * " + j);
                }

            }
        }
    }
}
