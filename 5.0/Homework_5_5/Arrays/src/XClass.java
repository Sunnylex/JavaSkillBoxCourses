import java.util.Scanner;

public class XClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер Х");
        int size = scanner.nextInt();
        Character[][] graphicArr = new Character[size][size];
        Character x = 'X';
        Character space = '-';

        /**
         * (size+1)/2 чтобы пробигаться не по всему двумерному массиву
         * а пробегать четверть захватывая при этом ее границу в случае
         * нечетного значения размерности массива
         */
        for (int i = 0; i < (size + 1) / 2; i++) {
            for (int j = 0; j < (size + 1) / 2; j++) {
                if (i == j) {
                    graphicArr[i][j] = x;
                    graphicArr[size - i - 1][size - j - 1] = x;
                    graphicArr[i][size - j - 1] = x;
                    graphicArr[size - i - 1][j] = x;
                } else {
                    graphicArr[i][j] = space;
                    graphicArr[size - i - 1][size - j - 1] = space;
                    graphicArr[i][size - j - 1] = space;
                    graphicArr[size - i - 1][j] = space;
                }
            }
        }
        for (Character[] characters : graphicArr) {
            System.out.println();
            for (Character character : characters) {
                System.out.print(character);
            }
        }

    }
}
