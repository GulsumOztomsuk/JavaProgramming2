package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(2,3,4,5,6,8,9));

        for (int i = 0; i < numbers.size(); i++) {
           if (numbers.get(i) % 3 == 0){
               System.out.println(numbers.get(i));
           }
        }
    }
}
/*Task 1 :

        Create a method that which is get array list as a parameter then return the numbers which are divisible by 3.

        input:

        numbers : 2,3,4,5,6,8,9

        output:

        3,6,9

 */
