import Accounts.*;
import BankClients.BankClient;
import BankClients.IndividualBankClient;
import BankClients.LegalBankClient;

import java.io.BufferedReader;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        PaymentAccount pA = new PaymentAccount(100.0);
        DepositAccount dA = new DepositAccount(1000.0);
        CardAccount cA = new CardAccount(10.0);

        System.out.println((int) '9');

        pA.putCash(100.0);
        pA.takeCash(10.0);
        System.out.println(pA.viewCash());

        dA.putCash(10000.0);
        dA.takeCash(100.0);
        dA.putCash(12.0);
        double d = dA.viewCash();
        System.out.println(d);

        dA.minusMonth();
        dA.takeCash(100.0);
        System.out.println(dA.viewCash());


        cA.putCash(100.0);
        cA.takeCash(100.0);
        System.out.println(cA.viewCash());
        cA.putCash(91.0);
        System.out.println(cA.viewCash());
        cA.takeCash(100.0);
        cA.takeCash(99.0);
        System.out.println(cA.viewCash());


        System.out.println(pA.getNumber() + "\n" +
                dA.getNumber() + "\n" + cA.getNumber());

        BankClient pasha = new IndividualBankClient();
        BankClient sasha = new IndividualBankClient(pA);

        System.out.println(pasha.getAccountNumber());
        System.out.println(sasha.getAccountNumber());

        LegalBankClient OOOTatNeft = new LegalBankClient(cA);
        OOOTatNeft.putCashOnBalanceAccount(1200);
        System.out.println(OOOTatNeft.getAccount().getNumber());
        System.out.println(OOOTatNeft.getAccount().getCash());
        OOOTatNeft.getAccount().takeCash(12.0);
        System.out.println(OOOTatNeft.viewAccountBalance());

        SoleTradeAccount sOA = new SoleTradeAccount(100.0);
        System.out.println(sOA.viewCash());
        sOA.putCash(1000);
        System.out.println(sOA.viewCash());
        sOA.takeCash(50);
        System.out.println(sOA.viewCash());

        PaymentAccount pa = new PaymentAccount(AccountMatcher.parseTo("1234 5678 9990 1234"));
        PaymentAccount pa2 = new PaymentAccount(AccountMatcher.parseTo("1234 5678 9990 1235"));

        for (String key : Account.getNumbers().keySet()) {
            System.out.println(Account.getNumbers().get(key));
        }


    }
}
