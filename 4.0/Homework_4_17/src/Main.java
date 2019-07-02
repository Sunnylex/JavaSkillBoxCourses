import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int containersInCar = 25;
        int boxesInContainer = 10;
        int allBoxes = 311;

        int numberOfBox = 0;
        int numberOfContainer = 0;

        int containers = (int) Math.ceil((double) allBoxes / boxesInContainer);
        int cars = (int) Math.ceil((double) containers / containersInCar);
        System.out.println(containers + " " + cars);
        for (int i = 1; i <= cars; i++) {
            System.out.println("Грузовик №: " + i);
            for (int j = 0; j < containersInCar; j++) {
                System.out.println("\tКонтейнер №: " + ++numberOfContainer);
                for (int k = 0; k < boxesInContainer; k++) {
                    System.out.println("\t\tЯщик №: " + ++numberOfBox);
                    if (numberOfBox == allBoxes) {
                        return;
                    }
                }
            }
        }
    }
}
