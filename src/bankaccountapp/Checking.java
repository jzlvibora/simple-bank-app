package bankaccountapp;

public class Checking extends Account{
    private String debitCard;
    private int PIN;

    public Checking(String name, String SSN, double balance) {
        super(name, SSN, balance);
        accountNumber = "2" + accountNumber;
        setDebitCard();


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
        System.out.println("ACCOUNT: CHECKING \n " + "DebitCardNo.: " + debitCard + "\n PIN: " + PIN );
        System.out.println("*****************************************************************************");
    }

    private void setDebitCard(){
        debitCard = String.valueOf((int) (Math.random()*Math.pow(10,3)));
        PIN = (int) (Math.random()*Math.pow(10,4));
    }
}
