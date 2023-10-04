package bankaccountapp;

public class Savings extends Account{
    private int safetyDepositBox;
    private int safetyCode;

    public Savings(String name, String SSN, double balance) {
        super(name, SSN, balance);
        accountNumber = "1" + accountNumber;
        setSafetyBox();
//        System.out.println(safetyDepositBox);
//        System.out.println(safetyCode);
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

    @Override
    public void showInfo() {
        System.out.println("*****************************************************************************");
        super.showInfo();
        System.out.println("ACCOUNT: SAVINGS \n " + "SafetyBox: " + safetyDepositBox + "\n SafetyCode: " + safetyCode );
        System.out.println("*****************************************************************************");

    }

    @Override
    protected void setRate() {
        rate = getBaseRate() - .25;

    }

    private void setSafetyBox(){
        safetyDepositBox = (int) (Math.random()*Math.pow(10,3));
        safetyCode = (int) (Math.random()*Math.pow(10,4));

    }
}
