import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Tasker tasker = new Tasker();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String stringLine = scanner.nextLine();
            tasker.command(stringLine);
        }
    }

}
