package Homework7;
import java.util.HashSet;
import java.util.Set;

public class SetIntersection {

        public static Set<Integer> findCommonElements(Set<Integer> set1, Set<Integer> set2) {
            // ვქმნით ახალ სეტს, რომელიც შეიცავს set1-ის მონაცემებს
            Set<Integer> commonSet = new HashSet<>(set1);

            // ვტოვებთ მხოლოდ იმ ელემენტებს, retaubAll-ით რომლებიც set2-შიცაა
            commonSet.retainAll(set2);

            return commonSet; // ბრუნდება შედეგი
        }


}

