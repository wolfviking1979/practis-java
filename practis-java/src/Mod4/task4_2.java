package Mod4;

import java.util.Scanner;

public class task4_2 {

    private final static int minIncome = 200000;
    private final static int maxIncome = 900000;

    private static int officeRentCharge = 14000;
    private static int telephonyCharge = 12000;
    private static int internetAccessCharge = 7200;

    private static int assistantSalary = 40000;
    private static int financeManagerSalary = 90000;

    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.15;

    private static double minInvestmentsAmount = 100000;


    public static void main(String[] args) {
        while (true){
            System.out.println("Введите сумму компании за месяц" +
                    " (от 200 до 900 тысяч рублей)");

            int income = (new Scanner(System.in)).nextInt();

            // проверка не выходит ли доход за грани min и max.
            if (!checkIncomeRange(income)){
                continue;
            }

            // Зарплата менеджеров.
            double managerSalary = income * managerPercent;
            double pureIncome = income - managerSalary -
                    calculateCharges();

            double taxAmount = mainTaxPercent * pureIncome;
            double pureIncomeAfterTax = pureIncome - taxAmount;

            boolean canMakeInvestments = pureIncomeAfterTax >=
                    minInvestmentsAmount;

            System.out.println("Зарплата менеджера: $" + managerSalary);
            System.out.println("Общая сумма налогов: $" + (taxAmount > 0 ? taxAmount : 0));

            System.out.println("Компания может инвестировать: " +
                    (canMakeInvestments ?  "Да" : "Нет"));
            if (pureIncome < 0){
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }

        }


    }

    private static boolean checkIncomeRange(int income){
        if (income < minIncome) {
            System.out.println("Доход меньше нижней грани.");
            return false;
        }

        if (income > maxIncome) {
            System.out.println("Доход выше верхней грани.");
            return false;
        }

        return true;
    }

    private static int calculateCharges(){
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}
