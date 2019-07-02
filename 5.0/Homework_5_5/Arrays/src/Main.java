public class Main {
    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";
        String[] colors = text.split(",?\\s+");
        String[] inversColor = new String[colors.length];
        for (int i = 0; i < colors.length; i++) {
            inversColor[colors.length - i - 1] = colors[i];
        }
        for (String color : inversColor) {
            System.out.println(color);
        }

        //OR

        String variable;
        int middleOfArray = colors.length / 2;
        for (int i = 0; i < middleOfArray; i++) {
            variable = colors[i];
            colors[i] = colors[colors.length - i - 1];
            colors[colors.length - i - 1] = variable;
        }
        for (String s :
                colors) {
            System.out.println(s);
        }
    }
}
