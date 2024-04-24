public class SpecialCheckingAccount extends CheckingAccount{
    private double minBalance;
    private double interestRate;

    public SpecialCheckingAccount(int idNum, double startBal, double cc, double interestR, double minB){
        super(idNum, startBal, cc);
        minBalance = minB;
        interestRate = interestR;
    }
    @Override
    public void clearCheck(double amount) {
        if (currentBalance()>minBalance) decreaseBalance(amount);
        else super.clearCheck(amount);
    }

    @Override
    public double monthlyInterest() {
        if (currentBalance()>minBalance) return currentBalance()*interestRate/12d;
        else return super.monthlyInterest();
    }
}