package Day23_CustomMethods_Void;

public class CustomMerhodsPractice {
    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("--------------------");
        helloCydeo5Times();
        System.out.println("--------------------");
        evenNumbers();
    }
    //create a function that can print hello world 5 time
    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
    }

    //create a function that can print hello cydeo 5 time ==> helloCydeo5Times
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Hello Cydeo");

            //creat a function that can printall the even numbers from 1~10 ==>evenNumbers

                }
            }

    public static void evenNumbers(){
        for (int j = 2; j < 11 ; j+=2) {
            System.out.println(j);
        }
    }
}
