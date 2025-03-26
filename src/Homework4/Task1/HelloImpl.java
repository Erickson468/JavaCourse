package Homework4.Task1;

// hello ინტერფეისების იმპლემენტაცია
public class HelloImpl implements interfaceHello {
    @Override
    public void hello(String message) {
        System.out.println("Message: " + message);
    }

    @Override
    public void hello(String message, int number) {
        System.out.println("Message: " + message + ", Number: " + number);
    }
}