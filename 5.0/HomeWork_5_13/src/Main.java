import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        CarNumbers carNumbers = new CarNumbers();
        HashSet<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        hashSet.addAll(carNumbers.getNumbers());
        treeSet.addAll(carNumbers.getNumbers());
        Scanner scanner = new Scanner(System.in);

        long start;
        long duration;

        for (; ; ) {
            String tamp = scanner.nextLine();

            start = System.currentTimeMillis();
            System.out.println(
                    carNumbers.getNumbers().contains(tamp)
            );
            duration = System.currentTimeMillis() - start;
            System.out.println(duration + "----");

            start = System.currentTimeMillis();
            System.out.println(
                    Collections.binarySearch(carNumbers.getNumbers(), tamp)
            );
            duration = System.currentTimeMillis() - start;
            System.out.println(duration + "----");

            start = System.currentTimeMillis();
            System.out.println(
                    hashSet.contains(tamp)
            );
            duration = System.currentTimeMillis() - start;
            System.out.println(duration + "----");

            start = System.currentTimeMillis();
            System.out.println(
                    treeSet.contains(tamp)
            );
            duration = System.currentTimeMillis() - start;
            System.out.println(duration + "----");


        }

    }
}
