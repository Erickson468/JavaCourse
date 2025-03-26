package Homework4.Task3;

public class Main {

        public static void main(String[] args) {
            // Creating objects of different car types
            Car bmw = new BMW();
            Car mercedes = new Mercedes();

            // Calling methods for BMW
            System.out.println("BMW:");
            bmw.speed();
            bmw.color();
            bmw.wheelsCount();

            System.out.println("--------------------");


            // Calling methods for Toyota
            System.out.println("Mercedes:");
            mercedes.speed();
            mercedes.color();
            mercedes.wheelsCount();
        }
}


