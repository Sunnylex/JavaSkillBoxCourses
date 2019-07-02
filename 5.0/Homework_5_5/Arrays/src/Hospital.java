public class Hospital {
    static final double LOW_BORDER_HEALTHY = 36.2;
    static final double UP_BORDER_HEALTHY = 36.9;

    static final double LEFT_BORDER_DEG = 32.0;
    static final double RIGHT_BORDER_DEG = 40.0;

    public static void main(String[] args) {
        double[] patients = new double[30];
        double sum = 0;
        double lowBorderHealthy = 36.2;
        double upBorderHealthy = 36.9;
        int healthyCount = 0;
        for (int i = 0; i < patients.length; i++) {
            patients[i] = (int) ((Math.random() * (RIGHT_BORDER_DEG - LEFT_BORDER_DEG) +
                    LEFT_BORDER_DEG) * 10) / 10.0;
            if (isHealthy(patients[i])) healthyCount++;
            sum += patients[i];
        }
        for (double p :
                patients) {
            System.out.print(p + "\t");
        }
        System.out.println();
        System.out.println("Average\t" + (sum / 30));
        System.out.println("There are " + healthyCount + " healthy patient");
    }

    double lowBorderHealthy = 36.2;
    double upBorderHealthy = 36.9;

    static boolean isHealthy(double temp) {
        return (temp >= LOW_BORDER_HEALTHY && temp <= UP_BORDER_HEALTHY);
    }
}
