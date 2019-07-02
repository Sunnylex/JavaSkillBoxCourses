package BankClients;

import Accounts.SoleTradeAccount;

public class SoleTraderBankClient extends IndividualBankClient {
    public SoleTraderBankClient() {
        super(new SoleTradeAccount());
    }

    public SoleTraderBankClient(double balance) {
        super(new SoleTradeAccount(balance));
    }

    public SoleTraderBankClient(SoleTradeAccount account) {
        super(account);
    }
}
