package Homework8;


public class Car extends Vehicle {
    private int wheelCount;

    // კონსტრუქტორი: იღებს Vehicle-ის ველებს და ახალ ველს wheelCount
    public Car(String brand, String modelName, int releaseYear, int wheelCount) {
        super(brand, modelName, releaseYear); // super გამოძახება მშობელი Vehicle კლასისთვის
        this.wheelCount = wheelCount;
    }

    // გეთერი და სეთერი wheelCount-ისთვის (სურვილისამებრ)
    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    // გადატვირთული toString მეთოდი
    @Override
    public String toString() {
        return "Car {" +
                "Brand='" + getBrand() + '\'' +
                ", Model='" + getModelName() + '\'' +
                ", Release Year=" + getReleaseYear() +
                ", Wheel Count=" + wheelCount +
                '}';
    }
}

