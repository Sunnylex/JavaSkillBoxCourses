public class Cat extends Exception implements Comparable<Cat>{
    private double originWeight;
    private double weight;
    private double foodEaten;
    private CatColor catColor;
    private String name;


    private static int count = 0;

    private final String NOT_ALIVE = "I can't do it, I'm not alive";
    public static final int EYE_COUNT = 2;
    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 9000.0;


    public Cat() {
        this(1500.0 + 3000.0 * Math.random());
        this.name = "Vasya";
    }
    public Cat(String name){
        this();
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

    private Cat(double weight) {
        this(weight, weight, 0, CatColor.NO_NAME_COLOR_CAT);
    }

    private Cat(double weight, double originWeight, double foodEaten, CatColor catColor) {
        if (weight > MIN_WEIGHT && weight < MAX_WEIGHT) {
            this.weight = weight;
            this.originWeight = originWeight;
            this.foodEaten = foodEaten;
            this.catColor = catColor;
            count++;
        } else
            System.out.println("Вес кошки не должен быть меньше 1000 и больше 9000");
    }

    public static final Cat newCatWithWeight(double weight) throws Exception {
        //return new Cat(weight);
        return newCat(weight,weight,0,CatColor.NO_NAME_COLOR_CAT);
    }

    private static final Cat newCat(double weight, double originWeight, double foodEaten, CatColor catColor) throws Exception {
        if (!(weight > MIN_WEIGHT && weight < MAX_WEIGHT))
            try{

        }catch (Exception ex) {
                throw new Exception("Вес кошки не должен быть меньше 1000 и больше 9000");
            }
        return new Cat(weight, originWeight, foodEaten, catColor);
    }


        public boolean isAlive () {
            if (this.getStatus() != "Dead" && this.getStatus() != "Exploded") {
                return true;
            } else
                return false;
        }

        public static int getCount () {
            return count;
        }

        public void meow () {
            if (isAlive()) {
                weight = weight - 1;
                System.out.println("Meow");
                if (!isAlive()) count--;
            } else
                System.out.println(NOT_ALIVE);
        }

        public void feed (Double amount){
            if (isAlive()) {
                weight = weight + amount;
                foodEaten += amount;
                if (!isAlive()) count--;
            } else
                System.out.println(NOT_ALIVE);
        }

        public double getFoodEaten () {
            return this.foodEaten;
        }

        public void setCatColor (CatColor color){
            this.catColor = color;
        }

        public String getCatColor () {
            return catColor.getRuColor();

            /*
            if (catColor == CatColor.BLACK_CAT) {
                return "Черный";
            } else if (catColor == CatColor.RED_CAT) {
                return "Рыжый";
            } else if (catColor == CatColor.SPOTY_CAT) {
                return "Пятнистый";

            } else if (catColor == CatColor.WHITE_CAT) {
                return "Белый";
            } else
                return "У меня нет цвета";
            */
        }

        public static Cat clone (Cat original) throws Exception {
            return Cat.newCat(original.weight,original.originWeight,original.foodEaten,original.catColor);
        }

        public void goToilet () {
            if (isAlive()) {
                weight -= 1.0;
                System.out.println("I do it and my new weight is " + this.weight);
                if (!isAlive()) count--;
            } else
                System.out.println(NOT_ALIVE);
        }

        public void drink (Double amount){
            if (isAlive()) {
                weight = weight + amount;
                if (!isAlive()) count--;
            } else
                System.out.println(NOT_ALIVE);
        }

        public Double getWeight () {
            return weight;
        }

        public String getStatus () {
            if (weight < MIN_WEIGHT) {
                return "Dead";
            } else if (weight > MAX_WEIGHT) {
                return "Exploded";
            } else if (weight > originWeight) {
                return "Sleeping";
            } else {
                return "Playing";
            }
        }

    @Override
    public int compareTo(Cat cat) {
            if(this.weight > cat.weight){
                return 1;
            }else if(this.weight < cat.weight){
                return -1;
            }else
                return 0;
    }
}