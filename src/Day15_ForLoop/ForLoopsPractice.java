package Day15_ForLoop;

public class ForLoopsPractice {
    public static void main(String[] args) {
       // 15 16 17 18 19....45
       /* System.out.print("15");
        System.out.print("15");
        ....
        System.out.print("45");

        */

        for (int i = 15; i<=45; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("--------------------------");
        //100 99 98 ... 50
        for(int i=100; i>=50; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("--------------------------");

        //print all the even number 1~50

        for (int a=1; a<=50; a++){
            if(a % 2 == 0) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
        System.out.println("--------------------------");

        for (int x=2; x<=54; x += 2){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("----------------------");
        /*
        Print:
            A~Z
            a~z
            Z~A
            z~a
         */
        for (char x='A'; x<='Z'; x++){
            System.out.print(x+" ");
        }
        System.out.println();
        for (char y='a'; y<='z'; y++){
            System.out.print(y+" ");
        }
        System.out.println();
        for (char t='Z'; t>='A'; t--){
            System.out.print(t+" ");
        }
        System.out.println();
        for (char m='z'; m>='a'; m--){
            System.out.print(m+" ");
        }
    }
}
