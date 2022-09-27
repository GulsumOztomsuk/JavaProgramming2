package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
            int n=100;

            if (n % 2 == 0) {
                System.out.println("even");//string
            }else
                System.out.println("odd"); // string

        System.out.println("-----------------");

        String result1 =(n % 2 == 0)? "even" : "odd";
        System.out.println(result1);

        int age=23;
        /*
        if (age >= 21){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }
        */
       // System.out.println((age >= 21)? "Eligible" : "Not eligible");

        String result2=(age >= 21)? "Eligible" : "Not eligible";
        System.out.println(result2);

        System.out.println("-------------------------");


        int number = 100;

        /*
        if(number>0){
            System.out.println("Positive");
        }else if(number <0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
          */

       String result3 =(number>0)? "Possitive" :? (number<0) "Negative" : "Zero";
        System.out.println(result3);

    }
}
