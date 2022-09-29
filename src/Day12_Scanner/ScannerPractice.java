package Day12_Scanner;

//import java.util.*; //wild imports:imports everything from the package
import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args) {
        /*
        Scanner scan= new Scanner(System.in);
        new Scanner(System.in).nextInt();
        new Scanner(System.in).nextInt();
        ...
         */
       Scanner scan=new Scanner(System.in);

        System.out.println("enter a number between 1 to 7:");

        int num=scan.nextInt();
        String result="";
        if (num>=1 && num<=7){
            result=(num==1)? "Monday" : (num==2)?"Tuesday" :(num==3)? "Wednesday" :(num==4)? "Tuesday" :(num==5)? "Friday" :(num==6)? "Saturday" : "sunday";
        }else {
            result="Invalid Number";
        }
        System.out.println(result);
        scan.close();


    }
}
