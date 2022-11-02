package Day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {

        //evenOrOdd();// the method demans additionaşl info to coplete its task
        evenOrOdd(10);
        System.out.println("-------------------------");
        ageOfPerson(2021);
        System.out.println("-------------");
        printNumbers(1000,2000);
    }
    //creare a function that can check if a number is odd number or even number

    public static void evenOrOdd(int number){
        if(number % 2 ==0){
            System.out.println(number+" is even number.");
        }else {
            System.out.println(number+ " is odd number.");
        }
    }
    //create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
        int age=2021-birthYear;
        System.out.println("Your age is "+ age);
    }
    //create a function that can print all the number between X and Y
    public static void printNumbers(int x,int y){
        System.out.println(x);
        System.out.println(y);
    }
}
