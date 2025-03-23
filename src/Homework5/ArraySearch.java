package Homework5;

public class ArraySearch {
    public ArraySearch(int[] Array, int inputNumber) {
        int find = 0;
        for (int j : Array) {
            if (j == inputNumber) {
                System.out.println(j);
                find = 1;
            }
        }
        //ეს არ მომწონს, უკეთესი ვარიანტიც არსებობს
        if (find != 1) {
            System.out.println("ვერ ვიპოვე");
        }

    }

}