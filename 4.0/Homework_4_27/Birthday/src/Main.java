import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("EEEE");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        dateFormat.setCalendar(calendar);
        calendar.set(1995, 10, 25);
        for (int i = 0; calendar.getTime().compareTo(date) < 0; i++) {
            System.out.println(i + " " + dateFormat.format(calendar.getTime()));
            calendar.add(Calendar.YEAR, 1);

        }
    }
}
