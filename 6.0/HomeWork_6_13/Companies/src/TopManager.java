public class TopManager extends Operator {
    private double bonus;

    public TopManager() {
        this.bonus = roundTo(100, getFixSalary() * 10);

    }

    @Override
    public double getMoneySalary() {
        setSalary(calculateSalary());
        return super.getMoneySalary();
    }

    private double calculateSalary() {
        if (this.getCompany().isPresent()) {
            if (this.getCompany().get().isRevenueMoreThan10Million()) {
                return roundTo(100, bonus + getFixSalary());
            } else
                return roundTo(100, getFixSalary());
        }
        return roundTo(100, getFixSalary());

    }

}
