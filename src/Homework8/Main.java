package Homework8;

public class Main {
    public static void main (String[] args){
        //TASK1
        String input = "99";
        int result = string_to_integer_method.convertStringToInteger(input);
        System.out.println("Converted number: " + result);

        //TASK2
        Vehicle myCar = new Vehicle("Toyota", "Corolla", 2020);

        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModelName());
        System.out.println("Release Year: " + myCar.getReleaseYear());

        // შევცვალოთ მოდელი და დავბეჭდოთ ხელახლა
        myCar.setModelName("Camry");
        System.out.println("Updated Model: " + myCar.getModelName());

        //შეცვლილი ბრედი
        myCar.setBrand("shecvlili");
        System.out.println("Updated Model: " + myCar.getBrand());

        //შეცვლილი გამოშვების წელი
        myCar.setReleaseYear(2015);
        System.out.println("Updated Model: " + myCar.getReleaseYear());

        //TASK3
        Car car1 = new Car("BMW", "X5", 2022, 4);

        System.out.println(car1); // გამოიძახებს გადატვირთულ toString()-ს
    }
}

