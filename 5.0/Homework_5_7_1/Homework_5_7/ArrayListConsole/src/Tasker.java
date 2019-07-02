import java.util.ArrayList;

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
            case ADD:
                s = stringIn.replaceFirst("ADD\\s", "");
                tasks.add(s);
                break;
            case ADD_AT:
                s = stringIn.replaceFirst("ADD\\s\\d+", "").trim();
                position = parseFirstInt(stringIn);
                if (position < tasks.size() && position > 0) {
                    tasks.add(position, s);
                } else
                    tasks.add(s);
                break;
            case LIST:
                System.out.println(this);
                break;
            case DELETE:
                position = parseFirstInt(stringIn);
                if (position < tasks.size() && position > 0) {
                    tasks.remove(position);
                } else
                    System.out.println("Not deleted. There not task :" + position);
                break;
            case EDIT:
                s = stringIn.replaceFirst("EDIT\\s\\d+", "").trim();
                position = parseFirstInt(stringIn);
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

    private Comamand parseComand(String s, boolean b) {
        return parseComand(s);
    }

    private Comamand parseComand(String s) {
        for (Comamand comand : Comamand.values()) {
            if (s.matches(comand.getRegex())) {
                System.out.println(comand);
                return comand;
            }
        }
        return Comamand.NOT_COMAND;
    }

    private int parseFirstInt(String s) {

        int k = Integer.parseInt((s.split("\\D+"))[1]);

        return k;
    }
}
