package Accounts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public abstract class Account {
    private static final int lengthOfNumberAccount = 16;
    private String number;
    private double cash;
    private static TreeMap<String, Account> numbers = new TreeMap<>();


    protected Account(String accountNumber) {
        setNumber(accountNumber);
    }

    protected Account() {
        this(generateNumber());
    }


    public static SortedMap<String, Account> getNumbers() {
        return Collections.unmodifiableSortedMap(numbers);
    }

    public String getNumber() {
        return number;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public abstract void takeCash(double cash);

    public abstract void putCash(double cash);

    @Override
    public String toString() {
        return "Account{" +
                "number='" + AccountMatcher.parseFrom(number) + '\'' +
                ", cash=" + cash +
                '}';
    }

    private void setNumber(String number) {
        if (isValidNumber(number) && isUniqNumber(number)) {
            this.number = number;
            numbers.put(number, this);
        } else {
            throw new NullPointerException("Exception: Account is null! Wrong number");
        }
    }

    private static String generateNumber() {
        String number;

        do {
            number = random(lengthOfNumberAccount, '0', '9');
        } while (numbers.keySet().contains(number));

        return number;
    }

    private boolean isValidNumber(String number) {
        boolean rightLength = false;
        boolean onlyDigit = true;
        char c;
        for (int i = 0; i < number.length(); i++) {
            c = number.charAt(i);
            if (!Character.isDigit(c)) {
                onlyDigit = false;
            }
        }
        if (number.length() == lengthOfNumberAccount) {
            rightLength = true;
        }

        return rightLength && onlyDigit;
    }

    private boolean isUniqNumber(String number) {
        return (!Account.numbers.keySet().contains(number));
    }

    private static int random(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    private static char random(char ch1, char ch2) {
        if ((int) ch1 <= (int) ch2) {
            return (char) random((int) (ch1), (int) (ch2));
        } else
            return (char) random((int) (ch2), (int) (ch1));
    }

    private static String random(int length, char ch1, char ch2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(random(ch1, ch2));
        }
        return sb.toString();
    }


}
