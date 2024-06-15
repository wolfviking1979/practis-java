// Эта программа выводит сумму кратности чисел.
package JavaRush.Base.Cicle;

import java.util.Scanner;

public class SumNumCrats {
    public static void main(String[] args) {
        // Создания объекта ввода.
        Scanner scanner = new Scanner(System.in);

        // Ввод стартового значения.
        System.out.print("Start: ");
        int start = scanner.nextInt();

        // Ввод конечного значения.
        System.out.print("End: ");
        int end = scanner.nextInt();

        // Ввод кратности.
        System.out.print("Crats: ");
        int multiple = scanner.nextInt();

        int sum = 0;
        for (int i = start; i < end; i++) {
            if (i % multiple == 0) {
                sum += i;
            }
        }
        // Напечатать сумму кратности.
        System.out.println(sum);
    }
}
