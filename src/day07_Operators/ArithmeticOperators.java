package day07_Operators;

import java.sql.SQLOutput;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int num1=25;
        int num2=3;

        int division=num1 / num2;// division variable contains the result of num1 divided by num2
        int remainder= num1 % num2; //remainder variable contains the result of num1 divided by num2

       //10 divided by 3 is equal to 3 with a remainder of 1

        System.out.println(num1 + " divided by " + num2 + " is equal to "
                + division + " with a remainder of " + remainder);

        //what is the remainder of25 divided 4

        System.out.println( 25 % 4 );

    }
}
