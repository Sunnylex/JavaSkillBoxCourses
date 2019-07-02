public class Main {
    public static void main(String[] args) {
        printMaxAndMin((byte) 12);
        printMaxAndMin(12);
        printMaxAndMin((double) 12);
        printMaxAndMin((long) 12);
        printMaxAndMin((float)12);
        printMaxAndMin((short)12);
    }

    public static void printMaxAndMin(Double d) {
        System.out.println("Max Double: " + Double.MAX_VALUE + "\t" + "Min Double: " + Double.MIN_VALUE);
    }
    public static void printMaxAndMin(Byte b) {
        System.out.println("Max Byte: " + Byte.MAX_VALUE + "\t" + "Min Byte: " + Byte.MIN_VALUE);
    }
    public static void printMaxAndMin(Integer i) {
        System.out.println("Max Integer: " + Integer.MAX_VALUE + "\t" + "Min Integer: " + Integer.MIN_VALUE);
    }
    public static void printMaxAndMin(Short s) {
        System.out.println("Max Short: " + Short.MAX_VALUE + "\t" + "Min Short: " + Short.MIN_VALUE);
    }
    public static void printMaxAndMin(Long l) {
        System.out.println("Max Double: " + Double.MAX_VALUE + "\t" + "Min Double: " + Double.MIN_VALUE);
    }
    public static void printMaxAndMin(Float f) {
        System.out.println("Max Float: " + Float.MAX_VALUE + "\t" + "Min Float: " + Float.MIN_VALUE);
    }

}
