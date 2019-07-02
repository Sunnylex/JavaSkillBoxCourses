public class PaymentAccount extends Account{
    //private double cash;

    public PaymentAccount() {
        cash = 0.0;
    }

    public PaymentAccount(double cash) {
        this.cash = cash;
    }

    public double viewCash() {
        return cash;
    }

    public void takeCash(double cash) {
        if (this.cash < cash) {
            System.out.println("Недостаточно денег на счете");
        } else {
            this.cash -= cash;
        }
    }

    public void putCash(double cash) {
        this.cash += cash;
    }

}
