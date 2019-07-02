import java.util.Comparator;
import java.util.Optional;

public interface Employee extends Comparable<Employee> {
    public Optional<Company> getCompany();

    public void setCompany(Company company);

    public void deletefromCompany();

    public double getMoneySalary();
}
