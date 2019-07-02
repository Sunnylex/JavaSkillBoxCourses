package BankClients;

import Accounts.PaymentAccount;

public class IndividualBankClient extends BankClient {
    public IndividualBankClient() {
        super();
    }

    public IndividualBankClient(double balance) {
        super(balance);
    }

    public IndividualBankClient(PaymentAccount account) {
        super(account);
    }

    @Override
    public String getAccountNumber() {
        return super.getAccount().getNumber();
    }

    @Override
    public String viewAccountBalance() {
        return String.valueOf(this.getAccount().getCash());
    }

    @Override
    public void putCashOnBalanceAccount(double cash) {
        this.getAccount().setCash(cash);
    }
}
