package BankClients;

import Accounts.CardAccount;

public class LegalBankClient extends IndividualBankClient {
    public LegalBankClient() {
        super(new CardAccount());
    }

    public LegalBankClient(double balance) {
        super(new CardAccount(balance));
    }

    public LegalBankClient(CardAccount account) {
        super(account);
    }

}
