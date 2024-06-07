package Mod4.Arithmetic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        int numberA = new Scanner(System.in).nextInt();
        System.out.print("Введите второе число: ");
        int numberB = new Scanner(System.in).nextInt();
        Arithmetic arithmetic = new Arithmetic(numberA, numberB);
        arithmetic.multiNumbers();
        arithmetic.numberSum();
        arithmetic.maximalNumber();
        arithmetic.minimalNumber();
    }
}
