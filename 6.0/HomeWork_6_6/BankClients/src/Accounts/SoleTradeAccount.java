package Accounts;

public class SoleTradeAccount extends PaymentAccount {

    public SoleTradeAccount() {
        super();
    }

    public SoleTradeAccount(double cash) {
        super(cash);
    }

    @Override
    public void putCash(double cash) {
        if (cash < 1000.0) {
            super.putCash(cash * 0.9);
        } else {
            super.putCash(cash * 0.95);
        }
    }
}
