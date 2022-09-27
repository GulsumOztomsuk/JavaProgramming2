package Day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        int number=7;
        String result=(number>=0 && number<=9)?
                (number == 0)? "Zero" :(number ==1)? "One" :(number==2)? "Two" :(number==3)? "three" :(number==4)? "four" :(number==5)? "five" :(number==6)? "six" :(number==7)? "seven":(number==8)? "eight" : "nine"
                :"Invalid number";
        System.out.println(result);
    }
}
