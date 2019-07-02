import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Company rpc = new Company();
        for (int i = 0; i < 200; i++) {
            rpc.addEmployee(new Operator());
        }
        for (int i = 0; i < 50; i++) {
            rpc.addEmployee(new Manager());
        }

        for (int i = 0; i < 20; i++) {
            rpc.addEmployee(new TopManager());
        }
        System.out.println("------");
        for (int i = 0; i < 27; i++) {
            System.out.println(
                    rpc.getTopSalaryStaff(27).get(i) + "\t" + rpc.getTopSalaryStaff(27).get(i).getMoneySalary()
                            + "\t" + rpc.getLowestSalaryStaff(27).get(i) + "\t" + rpc.getLowestSalaryStaff(27).get(i).getMoneySalary());
        }

        System.out.println(rpc.isRevenueMoreThan10Million());

    }
}
