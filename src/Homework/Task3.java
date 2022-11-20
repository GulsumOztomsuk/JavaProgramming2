package Homework;

import java.util.ArrayList;
import java.util.Arrays;


public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> firstArray = new ArrayList<>();
        firstArray.addAll(Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<Integer> secondArray = new ArrayList<>();
        secondArray.addAll(Arrays.asList(4, 5, 6));
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : firstArray) {
            result.add(each);
        }
        for (Integer each : secondArray) {
            if (!result.contains(each)) {
                result.add(each);
            }
        }
        System.out.println(result);
    }
}


/*Task 3 :

        Create a method that get two arrays as a parameters then return the arraylist which has contains unique elements in it.

        first array :1,2,3,4,5

        second array :4,5,6

        output:

        1,2,3,4,5,6

 */
