package Day11_Switch_Scanner;

public class numberOfDays {
    public static void main(String[] args) {
        int year=2000;
        int number=9;
         String result = "";
        if (number>=1 && number<=12){
            switch (number) {
                case 2:
                    result =(number % 4 == 0)  ?"29 days" : "28 days";
                    break;
                case 4: case 6: case 9: case 11:
                    result = "30 days";
                    break;
                default:
                    result = "31 days";
                    break;
            }
        }else {
            System.out.println("Invalid number");
        }
        System.out.println(result);
    }
}
/*
        4. NumberOfDays
        28 Days: 2
        30 days: 4, 6, 9, 11
        31 days: 1, 3, 5, 7, 8, 10, 12
        If(1~12){
        }else{
        Invalid
        }
        */