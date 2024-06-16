package JavaRush.Base.Cicle;

import java.util.Scanner;

public class SquareCircle {
    public static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Введите радиус: ");
        int radius = input.nextInt();

        int squareCircle = (int)(PI * radius * radius);

        System.out.println("Площадь круга равна: " + squareCircle);

    }
}
