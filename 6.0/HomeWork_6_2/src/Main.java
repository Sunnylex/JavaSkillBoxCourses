import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        PaymentAccount pA = new PaymentAccount(100.0);
        DepositAccount dA = new DepositAccount(1000.0);
        CardAccount cA = new CardAccount(10.0);

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



    }
}
