package Homework9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

import static java.awt.SystemColor.text;

public class Main {
    public static void main(String[] args) throws IOException {
        createFile();
        writeInFile("test text for file");
        readFile();
        //deleteFile();
    }

    private static void createFile() throws IOException {
        //ვიდეოში თქვეს ერთ მეთოდათ დაწერეთო ამიტომ შექმნა/წაკითხვა გავაერთიანე
        File myObj = new File("SampleFile.txt");
        try {
            if (myObj.createNewFile()) {
                System.out.println("File succesfully created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Exeption was thrown");
        }


    }
    private static void readFile(){
        File file = new File("SampleFile.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            System.out.println("All lines are displayed");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }

    private static void writeInFile(String text) throws IOException {
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter("SampleFile.txt",true); //რომ დაამატოს და არ გადააწეროს
            myWriter.write(text + "\n");//დავამატე ახალი ხაზიდან დაწყება
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println("Exeption was thrown!");
        } finally {
            if (myWriter!= null) {
                myWriter.close();
            }
        }
    }

    private static void  deleteFile(){
        File file = new File("SampleFile.txt");
        if (file.delete()){
            System.out.println("File deleted!");
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}

