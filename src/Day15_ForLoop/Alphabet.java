package Day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {
        // A~Z ===> 65~90
        for (int i=65; i<=90; i++){
            System.out.print((char)i+" ");
        }
        System.out.println();
        System.out.println("------------------");

        for(char i = 'A'; i <= 'Z'; i++){ //i: A, B, C, D .... Z
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("------------------------------------------");
        //a~z

        for(char i = 'a'; i <= 'z'; i++){ //i: a, b, c, d, e, ... z
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("------------------------------------------");

        //Z~A

        for(char i ='Z'; i >= 'A'; i--){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("------------------------------------------");


        for(char i ='z'; i >= 'a'; i--){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("---------------------------");

        for (char i=1; i<=40000; i++){
            System.out.print(i+" ");
        }
    }
}

 /*
        Print:
            A~Z
            a~z
            Z~A
            z~a
         */