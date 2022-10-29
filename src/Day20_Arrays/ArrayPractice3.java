package Day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers whould you like to enter");
        int length=scan.nextInt();

        if (length<=0){
            System.out.println("Invalid entry");
            System.exit(0);
        }
        int[] number=new int[length]; //array needs to have enough capacity to contain all the elements user going to enter

        for (int i = 0; i < length; i++) {//i=0,1,2..
            System.out.println("Enter a number");
            number[i]=scan.nextInt();// each input user provided during each execution of the loop, will be assigned to the indexes of the array
        }
        System.out.println(Arrays.toString(number));
        scan.close();
    }
}
