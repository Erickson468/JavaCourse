package Homework7;
import java.util.List;
import java.util.Map;

public class CarProduction {
    public static int findYearWithMostCars(Map<Integer, List<Car>> carMap) {
        int maxYear = -1;
        int maxCount = 0;

        for (Map.Entry<Integer, List<Car>> entry : carMap.entrySet()) {
            int year = entry.getKey();
            int count = entry.getValue().size();

            if (count > maxCount) {
                maxCount = count;
                maxYear = year;
            }
        }

        return maxYear;
    }
}
