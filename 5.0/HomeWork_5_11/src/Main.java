import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory() {{
            add("Pasha", Phone.createPhone("9196008000").get());
            add("Sasha", Phone.createPhone("89004999978").get());
        }};


        Scanner scanner = new Scanner(System.in);
        for (; ; ) {

            String tampString = scanner.nextLine();
            Optional<Phone> tampPhone;
            String tampName;
            if (tampString.equals("LIST")) {
                phoneDirectory.printDirectory();
                continue;
            }
            if (Phone.isPhone(tampString)) {
                tampPhone = Phone.createPhone(tampString);
                if (phoneDirectory.isPhoneInDirectory(tampPhone.get())) {
                    phoneDirectory.printContactInfo(tampPhone.get());
                } else {
                    while (true) {
                        System.out.println("Введите имя контакта:");
                        tampName = scanner.nextLine();
                        if (phoneDirectory.isNameInDirectory(tampName)) {
                            System.out.println("Такое имя уже существует");
                        } else {
                            phoneDirectory.add(tampName, tampPhone.get());
                            break;
                        }
                    }
                }
            } else {
                tampName = tampString;
                if (phoneDirectory.isNameInDirectory(tampName)) {
                    phoneDirectory.printContactInfo(tampName);
                } else {
                    while (true) {
                        System.out.println("Введите номер телефона контакта:");
                        tampString = scanner.nextLine();
                        if (Phone.isPhone(tampString)) {
                            tampPhone = Phone.createPhone(tampString);
                            if (phoneDirectory.isPhoneInDirectory(tampPhone.get())) {
                                System.out.println("Такой номер уже существует");
                            } else {
                                phoneDirectory.add(tampName, tampPhone.get());
                                break;
                            }
                        } else {
                            System.out.println("Введите номер телефона в правильном формате");
                            continue;
                        }
                    }
                }
            }
        }
    }
}
