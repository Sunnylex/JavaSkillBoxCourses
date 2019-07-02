import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vasyaAge = 25;
        int katyaAge = 22;
        int mishaAge = 25;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyaAge >= katyaAge) {
            if (vasyaAge >= mishaAge) {
                max = vasyaAge;
                if (mishaAge >= katyaAge) {
                    middle = mishaAge;
                    min = katyaAge;
                } else {
                    middle = katyaAge;
                    min = mishaAge;
                }
            } else {
                max = mishaAge;
                if (vasyaAge >= katyaAge) {
                    middle = vasyaAge;
                    min = katyaAge;
                } else {
                    middle = katyaAge;
                    min = vasyaAge;
                }
            }
        } else {
            if (katyaAge >= mishaAge) {
                max = katyaAge;
                if (mishaAge >= vasyaAge) {
                    middle = mishaAge;
                    min = vasyaAge;
                } else {
                    middle = vasyaAge;
                    min = mishaAge;
                }
            } else {
                max = mishaAge;
                if (vasyaAge >= katyaAge) {
                    middle = vasyaAge;
                    min = katyaAge;
                } else {
                    middle = katyaAge;
                    min = vasyaAge;
                }
            }
        }
        System.out.println(max + "," + middle + "," + min);
    }

}
