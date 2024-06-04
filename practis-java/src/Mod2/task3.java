package Mod2;

public class task3 {
    public static void main(String[] args) {
        int fuelType = 92;
        int amount = 11;
        double discount = 0.1;
        boolean has_discount = amount > 10;
        double fuelPrice = 0;
        double fuel92price = 60.5;
        double fuel95price = 67.8;

       String wrongFuelTypeMessage = "Указан неверный тип топлива";
       String fuelPriceMessage;

       if(fuelType == 92) {
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
           System.out.println("Указано слишком малое количество топлива.");
           amount = 0;
       }


    }
}
