package Accounts;

public class AccountMatcher {
    private static final String REGEX_NUMBER = "^(\\d{4})(\\d{4})(\\d{4})(\\d{4}$)";
    public static String parseTo(String numberWithChars){
        return numberWithChars.replaceAll("\\D", "");
    }

    public static String parseFrom(String digitNumber){
        return digitNumber.replaceFirst(REGEX_NUMBER, "$1 $2 $3 $4");
    }
}
