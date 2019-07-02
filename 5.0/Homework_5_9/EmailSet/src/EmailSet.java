import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailSet {
    private HashSet<String> emails;


    public EmailSet() {
        this.emails = new HashSet<>();

    }

    public void comand(String s) {
        if (Comand.getComand(s).isPresent()) {
            Matcher matcher = Pattern.compile(Comand.ADD.getRegexMatcher()).matcher(s);

            switch (Comand.getComand(s).get()) {
                case ADD:
                    String cleanedFromADDStr = Comand.clearADDString(s);
                    if (isValidEmailAddress(cleanedFromADDStr)) {
                        emails.add(cleanedFromADDStr);
                    }
                    break;
                case LIST:
                    for (String email : emails) {
                        System.out.println(email);
                    }
                    break;

                default:
                    System.out.println("Def");
            }
        }
    }

    private static boolean isValidEmailAddress(String email) {
        boolean result = true;
        try {
            new InternetAddress(email).validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }


}
