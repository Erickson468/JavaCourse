package Homework4.Task3;

// Abstract class Car
public abstract class Car {
    // Abstract methods
    public abstract void speed();
    public abstract void color();

    // Non-abstract method
    public void wheelsCount() {
        System.out.println("საერთო მახასიათებელი: ორივეს 4(ოთხი) საბურავი აქვს");
    }
}
