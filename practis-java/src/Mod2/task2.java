package Mod2;

public class task2 {
    public static void main(String[] args) {
        System.out.println("Система расчета стоимости топлива");
        int fuelType = 92;
        int amount = 11;
        boolean has_discount = amount > 10;
        double fuelPrice = 0;
        double fuel92price = 60.5;
        double fuel95price = 67.8;

        String wrongFuelTypeMessage = "Указан неверный вид топлива";

        double discount = 0.1;


        if (fuelType == 92) {
            fuelPrice = fuel92price;
        } else if (fuelType == 95) {
            fuelPrice = fuel95price;
        } else {
            System.out.println(wrongFuelTypeMessage);
        }

        if (has_discount) {
            fuelPrice = (1 - discount) * fuelPrice;
        }

        if (amount < 1) {
            System.out.println("Выбрано слишком маленькое количество топлива");
            amount = 0;
        }

        String fuelPriceMessage = "Цена выбранного топлива: " + fuelPrice + " руб.";

        System.out.println(fuelPriceMessage);

        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");

    }
}
