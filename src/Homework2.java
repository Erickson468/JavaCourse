import java.util.Scanner;


public class Homework2 {
    public static void main(String[] args){

        //TASK1
        Scanner inputObject = new Scanner(System.in);  // შევქმენი სკანერის
        System.out.print("Enter animal specie: ");

        String speciesNames = inputObject.nextLine();  // შევინახე ინფუთი

        animalSpecies(speciesNames);
        animalSpeciesSwitch(speciesNames);

        //TASK2
        //პირველი რიცხვი
        Scanner firstInputNumber = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = Integer.valueOf(firstInputNumber.nextLine()); //დავგუგლე როგორ შეიძლება სტრინგის ინტეჯერში გადაყვანა

        //მეორე რიცხვი
        Scanner secondInputNumber = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        int secondNumber = Integer.valueOf(secondInputNumber.nextLine());

        exponentiationMethod(firstNumber, secondNumber);
        exponentiationMethodWhile(firstNumber, secondNumber);
    }

    //FIRST IF/ELSE
    static void animalSpecies(String species){
        if (species.toLowerCase().equals("dog")){
            System.out.println("I am the "+species.toLowerCase());
        } else if (species.toLowerCase().equals("cat")) {
            System.out.println("I am the "+species.toLowerCase());
        } else if (species.toLowerCase().equals("lion")) {
            System.out.println("I am the "+species.toLowerCase());
        }else if (species.toLowerCase().equals("pig")) {
            System.out.println("I am the "+species.toLowerCase());
        }else {
            System.out.println("I Am an Animal");
        }
    }
    //FIRST SWITCH CASE
    static void animalSpeciesSwitch(String species){
        switch (species.toLowerCase()){ //როგორც წინა ვარიანტში ყველა დავიყვანე ლოვერქეისში
            case "dog":
                System.out.println("I am the dog");
                break;
            case "cat":
                System.out.println("I am the cat");
                break;
            case "lion":
                System.out.println("I am the lion");
                break;
            case "pig":
                System.out.println("I am the pig");
                break;
            default:
                System.out.println("I Am an animal");
        }
    }

    //SECOND FOR LOOP
    static  void exponentiationMethod(int numberOne, int numberTwo){
        int exponentiation = 1; //შემოვიტანე საწყისი მნიშვნელობა
        for(int i =1; i<=numberTwo; i++){
           int value = exponentiation*numberOne; //ციკლის ყოველ იტერაციაზე შემოტანილი საწყისი მნიშვნელობა exponentiation იზრდება numberOne-ჯერ
           exponentiation = value; //ვინახავ შეცვლილ საწყის მნიშვნელობას
        }
        System.out.println(exponentiation);
    }

    //SECOND WHILE
    static  void  exponentiationMethodWhile(int numberOne, int numberTwo){
        int i = 1;
        int exponentiation = 1;
        while (i<=numberTwo){
            int value = exponentiation*numberOne;
            exponentiation = value;
            i++;
        }
        System.out.println(exponentiation);
    }

}
