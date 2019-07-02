package Accounts;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DepositAccount extends PaymentAccount {
    //private Calendar dayAfterGetCash;
    private LocalDate dateAfterGetCash;

    public DepositAccount() {
        super();
    }

    public DepositAccount(double cash) {
        super(cash);
    }


    @Override
    public void putCash(double cash) {
        super.putCash(cash);
       // Calendar tamp = new GregorianCalendar();
       // tamp.add(Calendar.MONTH, 1);
        dateAfterGetCash = LocalDate.now().plusMonths(1);
       // dayAfterGetCash = tamp;

    }

    @Override
    public void takeCash(double cash) {
        //Calendar tamp = new GregorianCalendar();
        if(LocalDate.now().isAfter(dateAfterGetCash)){
            super.takeCash(cash);
        }else{
            System.out.println("Месяц еще не прошел:");
        }
        /*
        if (tamp.after(dayAfterGetCash)) {
            super.takeCash(cash);
        } else {
            System.out.println("Месяц еще не прошел:");
        }

         */
    }

    public void minusMonth() {
        //dayAfterGetCash.add(Calendar.MONTH, -1);
        dateAfterGetCash = dateAfterGetCash.minusMonths(1);
        for (int i = 0; i < 1000000; i++) {

        }
    }

}
