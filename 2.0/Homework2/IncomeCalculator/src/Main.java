import java.util.Scanner;

public class Main
{
    private static int minIncome = 200000;
    private static int maxIncome = 900000;

    private static int officeRentCharge = 140000;
    private static int telephonyCharge = 12000;
    private static int internetAccessCharge = 7200;

    private static int assistantSalary = 45000;
    private static int financeManagerSalary = 90000;

    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.15;

    private static double minInvestmentsAmount = 100000;

    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println("Введите сумму доходов компании за месяц " +
                "(от 200 до 900 тысяч рублей): ");
            int income = (new Scanner(System.in)).nextInt(); //считатли с консоли и записали доход в переменную доход

            if(!checkIncomeRange(income)) { //проверели что доход в диапазоне 200т.р. и 900 т.р. и выкикинули в начало цикла то есть в считывание значений
                continue;
            }

            double managerSalary = income * managerPercent; //посчитали зарплату менеджера умножив доход на процент менеджера
            double pureIncome = income - managerSalary -
                calculateFixedCharges(); // посчитали чистый доход вычив из дохода фиксированные расходы и зарплату менеджера
            double taxAmount = mainTaxPercent * pureIncome; // вычислили сумму налога умножив чистую прибль на коэфицент налога
            double pureIncomeAfterTax = pureIncome - taxAmount; // сказали что чистый налог после налогообложения равен чистая прибыль минус сумма налога

            boolean canMakeInvestments = pureIncomeAfterTax >=
                minInvestmentsAmount; //сказали что можно инвестировать если значение больше минимального или равно ему

            System.out.println("Зарплата менеджера: " + managerSalary);
            System.out.println("Общая сумма налогов: " +
                (taxAmount > 0 ? taxAmount : 0));
            System.out.println("Компания может инвестировать: " +
                (canMakeInvestments ? "да" : "нет"));
            if(pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }

    private static boolean checkIncomeRange(int income)
    {
        if(income < minIncome)
        {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if(income > maxIncome)
        {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }

    private static int calculateFixedCharges()
    {
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}
