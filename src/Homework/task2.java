package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> firstNumbers=new ArrayList<>();
        firstNumbers.addAll(Arrays.asList(1,2,3));

        ArrayList<Integer> secondNumbers=new ArrayList<>();
        secondNumbers.addAll(Arrays.asList(4,5,6));

        ArrayList<Integer> sum=new ArrayList<>();

        sum.addAll(firstNumbers);
        sum.addAll(secondNumbers);
        System.out.println(sum);
    }
}

/*Task 2 :

        Create a method that get two arraylists as a parameters the return the array which has contains all elements in it.

        input:

        first arraylist :1,2,3

        second arraylist :4,5,6

        output:

        1,2,3,4,5,6

 */