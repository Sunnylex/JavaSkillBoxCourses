package Accounts;

import Accounts.Account;

public class PaymentAccount extends Account {

    public PaymentAccount() {
        super();
        setCash(0.0);
    }

    public PaymentAccount(String accountNumber) {
        super(accountNumber);
        setCash(0.0);
    }

    public PaymentAccount(double cash) {
        setCash(cash);
    }

    public PaymentAccount(double cash, String accountNumber) {
        super(accountNumber);
        setCash(cash);
    }


    public double viewCash() {
        return getCash();
    }

    public void takeCash(double cash) {
        if (super.getCash() < cash) {
            System.out.println("Недостаточно денег на счете");
        } else {
            super.setCash(getCash() - cash);
        }
    }

    public void putCash(double cash) {
        setCash(getCash() + cash);
    }

}
