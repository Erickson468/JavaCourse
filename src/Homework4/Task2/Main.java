package Homework4.Task2;

import Homework4.Task1.HelloImpl;
import Homework4.Task1.interfaceHello;

import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        interfaceHelloTask2 inHello = new HelloImplTask2();

        //დასაბეჭდი სიტყვა
        Scanner inputObject = new Scanner(System.in);
        System.out.print("Enter the word: ");

        String printWord = inputObject.nextLine();

        //დაბეჭდვის რიცხვი
        Scanner secondInputNumber = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        int printNumber = Integer.valueOf(secondInputNumber.nextLine());

        inHello.hello(printWord);
        inHello.hello(printWord, printNumber);
    }
}
