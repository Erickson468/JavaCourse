package Homework4.Task1;

import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        interfaceHello inHello = new HelloImpl();

        //დასაბეჭდი სიტყვა
        Scanner inputObject = new Scanner(System.in);  // შევქმენი სკანერის
        System.out.print("Enter the word: ");

        String printWord = inputObject.nextLine();  // შევინახე ინფუთი

        //დასაბეჭდი რიცხვი
        Scanner secondInputNumber = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        int printNumber = Integer.valueOf(secondInputNumber.nextLine());

        inHello.hello(printWord);
        inHello.hello(printWord, printNumber);
    }
}
