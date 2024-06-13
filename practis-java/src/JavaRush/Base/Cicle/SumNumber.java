package JavaRush.Base.Cicle;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        System.out.println("Эта прорграмма считает сумму цифр,");
        System.out.println("чтобы продолжить нажите цифру");
        System.out.println("quit = чтобы выйти.\n");
        Scanner input = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.print("Введите число: ");
            if (input.hasNextInt()) {
                int number = input.nextInt();
                total += number;
            }

            if (input.hasNextLine()) {
                String isQuit = input.nextLine();
                if (isQuit.equals("quit")) {
                    System.out.println("Bye-bye!");
                    break;
                } else {
                    System.out.println("quit = чтобы выйти.");
                }
            }
        }
        System.out.printf("Сумма чисел: %d", total);
    }
}
