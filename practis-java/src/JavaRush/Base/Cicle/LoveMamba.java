package JavaRush.Base.Cicle;

import java.util.Scanner;

public class LoveMamba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = input.nextLine();

        int index = 0;
        while (index < 10) {
            System.out.printf("%s любит меня! \n", name);
            index++;
        }
    }
}
