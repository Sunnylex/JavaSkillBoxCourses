import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String clearPhone = scanner.nextLine().replaceAll("\\D", "");
            String regex = "^([7|8])?(\\d{3})(\\d{3})(\\d{2})(\\d{2}$)";

            String result = clearPhone.matches(regex)? clearPhone.replaceFirst(regex,"+7 $2 $3 $4-$5"): "Неверный формат";
            System.out.println(result);

        }
    }
}

