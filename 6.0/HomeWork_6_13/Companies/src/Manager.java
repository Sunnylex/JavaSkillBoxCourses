public class Manager extends Operator {
    private double profitForCompany;

    public Manager() {
        this.profitForCompany = roundTo(100, (Math.random() * +1_000_000) + 100_000);
        setSalary(roundTo(100, profitForCompany * 0.05 + getFixSalary()));
    }
}
