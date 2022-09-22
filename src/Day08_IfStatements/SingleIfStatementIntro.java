package Day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number= 100;

        boolean evenNumber= number % 2 == 0;
        boolean oddNumber=  ! evenNumber; // not even number
        if(evenNumber){
            System.out.println(number + " is even number ");
        }
        if( oddNumber) {
            System.out.println(number + " is odd number");
        }
            System.out.println("-----------------------");

            int n=200;

            //posıtıve
            if (n > 0){ //if is the n is greater than zero, then it is positive
                System.out.println(n + " is positive number ");
            }
            //negtive
            if (n < 0){ // if is the n is less than zero, then it is negative
                System.out.println(n + " is negative number");
            }
            // zero
            if (n == 0){
                System.out.println(n + "is zero");
            }
        }
    }

