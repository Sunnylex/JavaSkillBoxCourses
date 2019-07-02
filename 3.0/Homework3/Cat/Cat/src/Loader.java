import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.TreeSet;

public class Loader {
    public static void main(String[] args) throws Exception {

        // первый урок:

        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        System.out.println(cat.getWeight() + "\t" + cat1.getWeight() + "\t" +
                cat2.getWeight() + "\t" + cat3.getWeight() + "\t" + cat4.getWeight());


        for (; cat.getStatus() != "Exploded"; cat.feed(1000.0)) {

            System.out.println(cat.getStatus() + "\t" + cat.getWeight());
        }
        System.out.println(cat.getStatus());

        while (cat1.getStatus() != "Dead") {
            cat1.meow();
            System.out.println(cat1.getStatus() + "\t" + cat1.getWeight());
        }

        //второй урок

        System.out.println(cat.getFoodEaten());
        cat2.goToilet();

        // третий урок

        System.out.println(Cat.getCount());

        // четвертый урок

        cat3.setCatColor(CatColor.BLACK_CAT);

        // пятый урок

        Cat cat5 = Cat.newCatWithWeight(12);
        System.out.println(cat5.getStatus() + "\t" + cat5.getWeight());
        System.out.println(Cat.getCount());

        // шестой урок
        System.out.println("Lesson6\n");
        cat.setCatColor(CatColor.SPOTY_CAT);
        System.out.println(cat.getCatColor());
        System.out.println(cat3.getCatColor());
        System.out.println(cat2.getCatColor());

        // 7 lesson
        System.out.println("Lesson7\n");
        Cat cat6 = Cat.clone(cat);
        Cat cat7 = Cat.clone(cat6);
        Cat cat8 = new Cat("Frosya");
        Kithen kithen = new Kithen("Lapa");


        System.out.println(cat8);

        System.out.println(kithen);

        System.out.println(Cat.getCount());

        System.out.println(Cat.newCatWithWeight(4000.0).compareTo(Cat.newCatWithWeight(4001)));

        TreeSet<Cat> treeSet = new TreeSet<>();
        System.out.println("---");
        treeSet.add(cat);
        treeSet.add(cat1);
        treeSet.add(cat8);
        treeSet.add(kithen);

        for (Cat cati: treeSet) {
            System.out.println();
        }



    }
}