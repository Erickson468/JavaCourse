package Homework4.Task2;

public class HelloImplTask2 implements interfaceHelloTask2 {
    @Override
    public void hello(String message) {
        System.out.println("Message: " + message);
    }

    @Override
    public void hello(String message, int number) {
        for (int i = 1; i <= number; i++) {
                System.out.println("Message: " + message+" Print count: " +i);
        }
    }
}
