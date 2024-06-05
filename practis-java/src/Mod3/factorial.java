package Mod3;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        //5! = 1 × 2 × 3 × 4 × 5 = 120
        System.out.print("Введите целое положительное число: ");
        int input_num = new Scanner(System.in).nextInt();

        int fact = 1;

        for (int i = 1; i < input_num + 1 ; i++) {
            fact *= i;

        }
        System.out.printf("Факториал числа: %d равен %d", input_num, fact);
    }
}
