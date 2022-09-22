package Day08_IfStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number=65;
        boolean disibleBy2= 65 % 2 == 0; // ıf the remainder of a number divided by 2 is zero,then it is evenly
        boolean disibleBy3= 65 % 3 == 0;
        boolean disibleBy5= 65 % 5 == 0;

        System.out.println(number + " is disible by 2: " + disibleBy2);
        System.out.println(number + " is disible by 3 :" + disibleBy3);
        System.out.println(number + " is disible by 5 :" + disibleBy5);

        System.out.println("--------------------------");

        int year=2000;

        boolean isLeapYear= year % 4 ==0;

        System.out.println(year + " is leap year : " + isLeapYear);


    }
}

/*
2. Create a class called EvenlyDivisible,and write a program that can check if a number is evenly divisible by 2, 3, 5
    		Ex:
				number = 65;
			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
 */