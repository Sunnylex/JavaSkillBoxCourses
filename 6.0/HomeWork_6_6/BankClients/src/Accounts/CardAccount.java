package Accounts;

public class CardAccount extends PaymentAccount {
    public CardAccount() {
        super();
    }

    public CardAccount(double cash) {
        super(cash);
    }

    @Override
    public void takeCash(double cash) {
        cash *= 1.01;
        super.takeCash(cash);
    }

    @Override
    public void putCash(double cash) {
        super.putCash(cash);
    }
}
