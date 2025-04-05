package Homework7;

import java.util.*;

import static Homework7.CarProduction.findYearWithMostCars;

public class Main {
    public static void main(String[] args) {

        //TASK1
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        Set<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);

        Set<Integer> result = SetIntersection.findCommonElements(setA, setB);
        System.out.println("Common Elements: " + result);


        //TASK2
        Map<Integer, List<Car>> carProduction = new HashMap<>();
        Random random = new Random();

        //მინდა ყოველ ჯერზე რენდომ რაოდენობის მანქანები დავამატო
        //შემოვიღე მანქანების მოდელები
        List<String> carModels = Arrays.asList("BMW", "Audi", "Toyota", "Honda", "Ford", "Mercedes", "Tesla", "Mazda", "Nissan", "Chevrolet");
        //შემოვიღე წლების ლისტი
        List<Integer> years = Arrays.asList(2019, 2020, 2021, 2022, 2023);
        //ერთ წელს დუბლირებების გამოსარიცხად, გამოყენებული მანქანების სია
        Set<Integer> usedCarCounts = new HashSet<>();

        for (int year : years) {
            List<Car> carsForYear = new ArrayList<>();
            Set<String> usedCarModels = new HashSet<>(); // უნიკალური მოდელები წლის ჭრილში

            int carCount;
            do {
                carCount = random.nextInt(5) + 1;
            } while (usedCarCounts.contains(carCount)); // ვჩეკავ ხომ არ არის ეს მოდელი დამატებული

            usedCarCounts.add(carCount);

            while (carsForYear.size() < carCount) {
                String randomCar = carModels.get(random.nextInt(carModels.size()));

                if (!usedCarModels.contains(randomCar)) {
                    carsForYear.add(new Car(randomCar));
                    usedCarModels.add(randomCar);
                }
            }

            carProduction.put(year, carsForYear);
        }


//        for (int year : years) {
//            List<Car> carsForYear = new ArrayList<>();
//            Set<String> usedCarModels = new HashSet<>();
//            int carCount = random.nextInt(5) + 1; // Random number of cars (1 to 5)
//
//            for (int i = 0; i < carCount; i++) {
//                String randomCar = carModels.get(random.nextInt(carModels.size())); // Pick a random car model
//                carsForYear.add(new Car(randomCar));
//            }
//
//            carProduction.put(year, carsForYear);
//        }

//        carProduction.put(2020, Arrays.asList(new Car("BMW"), new Car("Audi")));
//        carProduction.put(2021, Arrays.asList(new Car("Toyota"), new Car("Honda"), new Car("Ford")));
//        carProduction.put(2019, Arrays.asList(new Car("Mercedes")));

        int resultYear = findYearWithMostCars(carProduction);
        System.out.println("Year with the most cars: " + resultYear);
    }
}