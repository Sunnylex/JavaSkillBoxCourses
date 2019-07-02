import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
    private boolean isRevenueMoreThan10Million = Math.random() > 0.5;
    private ArrayList<Employee> employeesOfCompany;

    public Company() {
        this.employeesOfCompany = new ArrayList<>();
    }

    public boolean isRevenueMoreThan10Million() {
        return this.isRevenueMoreThan10Million;
    }

    public ArrayList<Employee> getTopSalaryStaff(int count) {
        Collections.sort(employeesOfCompany);
        if (count > employeesOfCompany.size()) {
            count = employeesOfCompany.size();
        }
        ArrayList<Employee> topSalaryList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            topSalaryList.add(employeesOfCompany.get(i));
        }

        return topSalaryList;
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count) {
        Collections.sort(employeesOfCompany);
        if (count > employeesOfCompany.size()) {
            count = employeesOfCompany.size();
        }
        ArrayList<Employee> lowestSalaryStaff = new ArrayList<>();
        for (int i = employeesOfCompany.size() - 1; i >= employeesOfCompany.size() - count; i--) {
            lowestSalaryStaff.add(employeesOfCompany.get(i));
        }
        return lowestSalaryStaff;
    }

    public void addEmployee(Employee employee) {
        employeesOfCompany.add(employee);
        employee.setCompany(this);
    }

    public void addEmloyeeList(List<Employee> list) {
        employeesOfCompany.addAll(list);
        for (Employee e : list) {
            e.setCompany(this);
        }
    }

    public void deleteEmployee(int i) {
        this.employeesOfCompany.get(i).deletefromCompany();
        this.employeesOfCompany.remove(i);
    }
}
