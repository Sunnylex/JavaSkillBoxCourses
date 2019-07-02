import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CarNumbers {
    private final String SORT_LETTERS[] = {"A", "B", "C", "E", "H", "K", "M", "N", "O", "P", "T", "X", "Y"};
    private String regions[];
    private final int REGION_COUNT = 197;
    private ArrayList<String> numbers;


    public CarNumbers() {
        numbers = new ArrayList<>();
        regions = new String[REGION_COUNT];
        for (int i = 0; i < REGION_COUNT; i++) {
            regions[i] = (i + 1) + "";
        }
        Collections.sort(Arrays.asList(regions));
        for (String s1 : SORT_LETTERS) {
            for (int i = 0; i < 10; i++) {
                for (String s2 : SORT_LETTERS) {
                    for (String s3 : SORT_LETTERS) {
                        for (String region : regions) {
                            numbers.add(s1 + i + i + i + s2 + s3 + region);
                        }
                    }
                }
            }
        }
    }

    public ArrayList<String> getNumbers(){
        return numbers;
    }


}
