package Mod5.BankDetals;

public class BankDetails {
    private final String billNumber;
    private final String correspondenceBill;
    private final String bikNumber;
    private final String bankName;
    private final String city;

    public BankDetails() {
        this.billNumber = "N/A";
        this.city = "N/A";
        this.bankName = "N/A";
        this.bikNumber = "N/A";
        this.correspondenceBill = "N/A";
    }

    public BankDetails(String billNumber, String correspondenceBill, String bikNumber, String bankName, String city) {
        this.billNumber = billNumber;
        this.correspondenceBill = correspondenceBill;
        this.bikNumber = bikNumber;
        this.bankName = bankName;
        this.city = city;
    }

    public BankDetails setBillNumber(String billNumber) {
        return new BankDetails(billNumber, correspondenceBill, bikNumber, bankName, city);
    }

    public BankDetails setCity(String city) {
        return new BankDetails(billNumber, correspondenceBill, bikNumber, bankName, city);
    }

    public BankDetails setBankName(String bankName) {
        return new BankDetails(billNumber, correspondenceBill, bikNumber, bankName, city);
    }

    public BankDetails setBikNumber(String bikNumber) {
        return new BankDetails(billNumber, correspondenceBill, bikNumber, bankName, city);
    }

    public BankDetails setCorrespondenceBill(String correspondenceBill) {
        return new BankDetails(billNumber, correspondenceBill, bikNumber, bankName, city);
    }

    public String getBillNumber() {
        return billNumber;
    }

    public String getCity() {
        return city;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBikNumber() {
        return bikNumber;
    }

    public String getCorrespondenceBill() {
        return correspondenceBill;
    }

    @Override
    public String toString() {
        return "billNumber: " + billNumber + '\n' +
                "correspondenceBill: " + correspondenceBill + '\n' +
                "bikNumber: " + bikNumber + '\n' +
                "bankName: " + bankName + '\n' +
                "city: " + city + '\n';
    }
}
