package JavaRush.Base.Cicle;

import java.util.Scanner;

public class SecondMinimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min_num = Integer.MAX_VALUE;
        int second_minimalNum = 0;
        int count = 0;

        while (true) {
            System.out.print("Введите число: ");
            if (input.hasNextInt()) {
                int userIn = input.nextInt();

                if (userIn < min_num) {
                    min_num = userIn;
                    count++;
                }

                if (count == 2) {
                    second_minimalNum = min_num;
                }
            }

            if (input.hasNextLine()) {
                String str = input.nextLine();
                if(str.equals("q")) {
                    break;
                }
            }
        }

        System.out.println(second_minimalNum);


    }
}
