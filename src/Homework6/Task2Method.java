package Homework6;

import java.util.ArrayList;
import java.util.Collections;

public class Task2Method {
    public Task2Method(){

    }
    static void compare_method(ArrayList<Integer> list_a, ArrayList<Integer> list_b){
        int greatest = 0;
        for(int i = 0; i < list_a.size(); i++){
            for(int j = 0; j < list_b.size(); j++){
                if(list_a.get(i) >= list_b.get(j) && list_a.get(i) > greatest){
                    greatest = list_a.get(i);

                } else if (list_a.get(i) < list_b.get(j) && list_b.get(j) > greatest) {
                    greatest = list_b.get(j);
                }
            }
        }
        System.out.println(greatest);

    }

    // მეორე ვარიანტი სორტირებით და ციკლის გარეშე
    static void compare_method2(ArrayList<Integer> list_a, ArrayList<Integer> list_b) {
       Collections.sort(list_a);
       Collections.sort(list_b);
       int a_index = list_a.size() - 1;
       int b_index = list_b.size() - 1;
       int max = 0;
       if (list_a.get(a_index)> list_b.get(b_index)){
           max = list_a.get(a_index);
       }
       else {
           max = list_b.get(b_index);
       }
       System.out.println(max);
    }
}
