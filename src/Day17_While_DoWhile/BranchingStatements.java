package Day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {
        for (char i = 'A'; i <='Z' ; i++) {
            System.out.println(i + "");//A B C D E F

            if (i =='F'){
                break; //exist the loop
            }
        }
        System.out.println();
        System.out.println("----------------------");

        Scanner scan=new Scanner(System.in);
        while (true){
            System.out.println("Enter your number: ");
            int n=scan.nextInt();

            if (n <0){
                break;
            }
        }

    }
}

/*
            if(true){
                break;
            }
*/