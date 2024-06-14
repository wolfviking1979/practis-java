package JavaRush.Base.Cicle;

import java.util.Scanner;

public class NumberToConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число или \"exit\" чтобы выйти: ");
        while (true) {

            if (input.hasNextInt()) {
                int number = input.nextInt();
                System.out.println("Число: " + number);
            }

            if (input.hasNextLine()) {
                String str = input.nextLine();
                if (str.equals("exit")){
                    break;
                } else {
                    System.out.println("Введите число или \"exit\" чтобы выйти: ");
                }
            }
        }
    }
}
