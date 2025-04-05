package Homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<String>();

        Scanner inputWord = new Scanner(System.in);
        for(int i = 0; i<10; i++){
            System.out.print("Enter the word: ");
            String addWord = inputWord.nextLine();
            System.out.println("added word: "+addWord);
            words.add(addWord);
        }
        inputWord.close();
        System.out.println(words);

        //Task1method task1method = new Task1method();
        Task1method.printMethod(words);

        //TASK2
        ArrayList<Integer> list_a = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,33));
        ArrayList<Integer> list_b = new ArrayList<>(Arrays.asList(7,24,51,6,3,0));

        Task2Method.compare_method(list_a,list_b);
        Task2Method.compare_method2(list_a,list_b);
    }
}
