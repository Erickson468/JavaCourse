package Homework5;

import java.util.ArrayList;
import java.util.Scanner;

import static Homework5.printArray.printer;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();

        // შემოვიღე სკანერი სადაც მიეთითება რამდენი სიტყვა უნდა შევიდეს სიმრავლეში (ვჩეკავ რომ შეიყვანონ ციფრი)
        Scanner InputNumber = new Scanner(System.in);
        int number;
        while (true){
            System.out.print("Enter number of words: ");
            if(InputNumber.hasNextInt()){
                number = InputNumber.nextInt();
                InputNumber.nextLine();
                break;
            }
            else {
                System.out.println("ERROR - Please enter the integer");
                InputNumber.next();
            }
        }
        System.out.println("You entered: " + number);


        //int printNumber = Integer.parseInt(InputNumber.nextLine());

        // მომხმარებელს შეყავს სიტყვები:
        for(int i = 0; i < number; i++ ){
            Scanner inputWord = new Scanner(System.in);
            System.out.print("Enter the word: ");
            String addWord = inputWord.nextLine();
            System.out.println("added word: "+addWord);
            words.add(addWord);
        }
        System.out.println(words); //სიმრავლის მნიშვნელობები

        //TASK1
        for(int j =0; j < words.toArray().length; j++){
            System.out.println(words.toArray()[j]);
        }
        //მეთოდით
        printer(words);

        //TASK2 array
        int[] intArray = { 1, 2, 3, 4, 5 };

        new ArraySearch(intArray,3);
        }
    }
