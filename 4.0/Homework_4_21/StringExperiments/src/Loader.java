import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7500 рубля, а Маша - 30000 рублей";
        String numStr = text.replaceAll("\\D+", " ").trim();
        String strings[] = numStr.split("\\s");
        Integer sum = 0;
        for (String s : strings) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);




    }

    public static int parseDigit(String s) {
        String digits = "";
        int codeZero = (int) '0';
        int codeNine = (int) '9';

        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) >= codeZero && (int) s.charAt(i) <= codeNine) {
                digits += s.charAt(i);
            }
        }
        return Integer.parseInt(digits);

    }
}