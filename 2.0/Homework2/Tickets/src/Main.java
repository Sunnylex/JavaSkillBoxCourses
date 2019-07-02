public class Main {
    public static void main(String[] args) {
        int leftBorder = 200_000;
        int rightBoarder = 235_000;
        int leftMiddle = 210_000;
        int rightMiddle = 220_000;

        for (int i = leftBorder; i <= rightBoarder; i++) {
            System.out.println(i);
            i = i == leftMiddle ? rightMiddle - 1 : i;
        }
        int i = leftBorder;
        while (i <= rightBoarder) {
            System.out.println(i++);
            i = i == leftMiddle + 1 ? rightMiddle : i;
        }
    }
}
