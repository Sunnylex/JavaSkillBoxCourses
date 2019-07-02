import java.util.Optional;

public class Phone implements Comparable<Phone>{
    private String phone;
    private static final String REGEX_PHONE = "^([7|8])?(\\d{3})(\\d{3})(\\d{2})(\\d{2}$)";

    private Phone(String phone) {
        this.phone = phone;
    }

    public static Optional<Phone> createPhone(String phone) {
        if (isPhone(phone)) {
            return Optional.of(new Phone(Phone.formatedPhone(phone)));
        } else
            return Optional.empty();
    }

    public static boolean isPhone(String string) {
        return string.replaceAll("\\D", "").matches(Phone.REGEX_PHONE);
    }

    public static String formatedPhone(String phone){
        return phone.replaceAll("\\D", "").
                replaceFirst(Phone.REGEX_PHONE, "+7 $2 $3 $4-$5");
    }

    @Override
    public String toString() {
        return this.phone;
    }

    @Override
    public int compareTo(Phone o) {
        return phone.compareTo(o.toString());
    }
}
