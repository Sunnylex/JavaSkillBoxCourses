import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tasker {
    private ArrayList<String> tasks;

    public Tasker() {
        tasks = new ArrayList<>();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tasks.size(); i++) {
            if (i > 0) {
                sb.append("\n" + tasks.get(i));
            } else
                sb.append(tasks.get(i));
        }
        return sb.toString();
    }

    public void command(String stringIn) {
        int position;
        String s;
        switch (parseComand(stringIn)) {
            case ADD_EMAIL:
                s = Comamand.ADD_EMAIL.getSecondPart(stringIn);
                tasks.add(s);
                break;
            case ADD:
                s = stringIn.replaceFirst("ADD\\s", "");
                tasks.add(s);
                break;
            case ADD_AT:
                s = stringIn.replaceFirst("ADD\\s\\d+", "").trim();
                position = Comamand.ADD_AT.getIndexComand(stringIn);
                if (position < tasks.size() && position > 0) {
                    tasks.add(position, s);
                } else
                    tasks.add(s);
                break;
            case LIST:
                System.out.println(this);
                break;
            case DELETE:
                position = Comamand.DELETE.getIndexComand(stringIn);
                if (position < tasks.size() && position > 0) {
                    tasks.remove(position);
                } else
                    System.out.println("Not deleted. There not task :" + position);
                break;
            case EDIT:
                s = stringIn.replaceFirst("EDIT\\s\\d+", "").trim();
                position = Comamand.EDIT.getIndexComand(stringIn);
                if (position < tasks.size() && position > 0) {
                    tasks.set(position,s);
                } else
                    System.out.println("Not edit. There not task :" + position);
                break;
            case NOT_COMAND:
                System.out.println(Comamand.NOT_COMAND);
                break;

        }
    }

    private Comamand parseComand(String s) {
        for (Comamand comand : Comamand.values()) {
            if (s.matches(comand.getRegexMatcher())) {
                System.out.println(comand);
                return comand;
            }
        }
        return Comamand.NOT_COMAND;
    }

}
