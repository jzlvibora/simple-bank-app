package bankaccountapp;

public class BankAccountApp {
    public static void main(String[] args) {

        Savings sv1 = new Savings("Ash Lynx","123456789",25000);
        Checking ck1 = new Checking("Naruto Uzumaki", "0012344566", 250.25);

        sv1.showInfo();
        ck1.showInfo();



    }
}
