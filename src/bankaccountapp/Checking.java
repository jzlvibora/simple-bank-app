package bankaccountapp;

public class Checking extends Account{
    private String debitCard;
    private int PIN;

    public Checking(String name, String SSN, double balance) {
        super(name, SSN, balance);
        accountNumber = "2" + accountNumber;
        System.out.println("CHECKING ACCOUNT :" + name + " ACCOUNTNO: " + accountNumber);
    }

    @Override
    double deposit() {
        return 0;
    }

    @Override
    double withdraw() {
        return 0;
    }

    @Override
    double transfer() {
        return 0;
    }

}
