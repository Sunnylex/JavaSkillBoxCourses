import java.util.Optional;

public class Operator implements Employee {
    private Optional<Company> company = Optional.empty();

    private double fixSalary;
    private double salary;

    public Operator(){
        this.fixSalary = roundTo(100, ((Math.random() * +100_000) + 10_000));
        setSalary(fixSalary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getFixSalary() {
        return fixSalary;
    }

    @Override
    public Optional<Company> getCompany() {
        return this.company;
    }

    @Override
    public void setCompany(Company company) {
        this.company = Optional.of(company);
    }

    @Override
    public void deletefromCompany() {
        this.company = Optional.empty();
    }

    @Override
    public double getMoneySalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.getMoneySalary() < o.getMoneySalary()) {
            return 1;
        }
        if (this.getMoneySalary() > o.getMoneySalary()) {
            return -1;
        }
        return 0;
    }



    static double roundTo(int roundTo, double number) {
        return (int) (number * roundTo) / (roundTo * 1.0);
    }
}
