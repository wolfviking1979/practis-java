package Mod5.HomeWork.Elevator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new  Elevator(-3, 26);

        while (true) {
            System.out.println("Вы находитесь на: " + elevator.getCurrentFloor() + " этаже");
            System.out.println("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();


            while (floor != elevator.getCurrentFloor()) {
                elevator.move(floor);
                if (elevator.getCurrentFloor() == elevator.getMaxFloor()) {
                    break;

                }

                if (elevator.getCurrentFloor() == elevator.getMinFloor()) {
                    break;
                }
                System.out.println("Этаж: " + elevator.getCurrentFloor());
            }
        }
    }
}
