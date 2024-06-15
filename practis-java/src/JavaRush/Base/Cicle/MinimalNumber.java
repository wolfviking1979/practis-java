package JavaRush.Base.Cicle;

import java.util.Scanner;

public class MinimalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min_num = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Введите число: ");
            if(input.hasNextInt()){
                int in_number = input.nextInt();
                if (in_number < min_num) {
                    min_num = in_number;
                }
            }

            if(input.hasNextLine()) {
                String str = input.nextLine();
                if (str.equals("q")) {
                    break;
                }
            }
        }
        System.out.println("Минимальное число: " +  min_num);
    }
}
