import java.util.Scanner;

public class FIOExperiments {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите ФИО:");
            String s[] = scan.nextLine().split("\\s+");
            if (s.length == 3) {
                System.out.println("Фамилия: " + s[0]);
                System.out.println("Имя: " + s[1]);
                System.out.println("Отчество: " + s[2]);
                return;
            } else if (s.length < 3) {
                System.out.println("Вы не ввели полное ФИО!");
                continue;
            } else if (s.length > 3) {
                System.out.println("Вы ввели лишний параметр");
                continue;
            }
        }


    }
}
