package Mod5.BankDetals;

public class Main {
    public static void main(String[] args) {
        BankDetails bankDetails = new BankDetails();
        bankDetails.setBillNumber("4072345555000978");

        Company company = new Company("Смарт-Экспресс", bankDetails);

        // some code

        bankDetails.setBillNumber("3102345555000978");

        System.out.println(company);

    }
}
