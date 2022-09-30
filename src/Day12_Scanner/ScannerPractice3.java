package Day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        //123enter

        Scanner input=new Scanner(System.in);//
        System.out.println("enter your fullname");// name enter
        String fullName= input.nextLine();

        System.out.println("Enter your Programming Language :");//programmingname enter
        String programming=input.nextLine();

        System.out.println("Enter your age :");//age enter
        int age=input.nextInt();

        input.nextLine(); //capture the enterkey that userpressed for nextInt();

        System.out.println("Enter your school name");// school name enter
        String schoolName=input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
        input.close();


    }
}
