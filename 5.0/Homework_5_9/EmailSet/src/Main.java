import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmailSet emails = new EmailSet();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String stringLine = scanner.nextLine();
            emails.comand(stringLine);
        }
    }

}
