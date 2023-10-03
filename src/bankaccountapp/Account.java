package bankaccountapp;

public abstract class Account implements InterestBaseRate {

    String name;
    String SSN;
    double balance;
    String accountNumber;
    double rate;

    static int index = 10000;

    public Account(String name, String SSN, double balance) {
        this.name = name;
        this.SSN = SSN;
        this.balance = balance;
        index++;
        this.accountNumber = setAccountNumber();
        System.out.println("Account: " + name + " AccountNum: " + this.accountNumber);
    }

    abstract double deposit();
    abstract double withdraw();
    abstract double transfer();
    public void showInfo(){
        System.out.println(
                "NAME: " + name +
                        "\nACCOUNT NUMBER: " + accountNumber +
                        "\nBALANCE: " + balance
        );
    }

    public String setAccountNumber() {
        String last2ofSSN = (this.SSN.substring(SSN.length()-2,SSN.length()));//starting index is inclusive, ending index is exclusive
        int rand3 = (int) (Math.random()*Math.pow(10,3));
        int unique5 = index;
        String accountNumGen = last2ofSSN + "" + unique5 + "" + rand3;
        return accountNumGen;
    }
}
