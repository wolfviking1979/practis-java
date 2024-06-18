package JavaRush.Base.Massive;

public class MassOdd {
    public static void main(String[] args) {
        String[] numbers = new String[10];

        for (int i_num = 0; i_num < numbers.length; i_num++) {
            if (i_num % 2 == 0) {
                numbers[i_num] = "Четный";
            } else {
                numbers[i_num] = "Нечетный";
            }
        }

        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
