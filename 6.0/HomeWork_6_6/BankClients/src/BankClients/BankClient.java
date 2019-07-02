package BankClients;

import Accounts.Account;
import Accounts.PaymentAccount;

public abstract class BankClient {
    private Account account;

    protected BankClient(Account account) {
        setAccount(account);
    }

    protected BankClient() {
        this(new PaymentAccount());
    }

    protected BankClient(double balance) {
        this(new PaymentAccount(balance));
    }

    public Account getAccount() {
        return account;
    }

    private void setAccount(Account account) {
        this.account = account;
    }

    public abstract String getAccountNumber();

    public abstract String viewAccountBalance();

    public abstract void putCashOnBalanceAccount(double cash);
}
