public class Main {
    public static void main(String[] args) {
        presentPerson("Rogor","Datvli", "Bevria?");
        averageNumber(5,4,2,5);
    }

    static void averageNumber(int firstNumber, int secondNumber, int thirdNumber, int forthNumber){
        System.out.println("Average number is: "+(firstNumber+secondNumber+thirdNumber+forthNumber)/4);
    }

    static void presentPerson( String firstWord, String secondWord, String thirdWord){
        int stringLength = firstWord.length() + secondWord.length()+ thirdWord.length();
        System.out.println("First word: "+ firstWord.length());
        System.out.println("Second word: "+secondWord.length());
        System.out.println("Third word: "+thirdWord.length());
        System.out.println("Result: "+firstWord.length()+" + "+secondWord.length()+" + "+thirdWord.length()+" = "+stringLength);
    }
}