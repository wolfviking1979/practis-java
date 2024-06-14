package JavaRush.Base.Cicle;
//Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3.
// Для этого используй цикл while.
// Подсказка:
// чтобы в цикле перейти к следующему числу, используй оператор continue.

public class SumNumberCrat3 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 100) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            System.out.print(i + " ");
            i++;

        }
        System.out.println(" ");

        for (int j = 0; j <= 100 ; j++) {
            if (j % 3 == 0) {
                continue;
            }

            System.out.print(j + " ");
        }
    }
}
