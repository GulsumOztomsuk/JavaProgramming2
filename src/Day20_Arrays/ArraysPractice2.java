package Day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        char[] letters=new char[26];
       /* letters[0]='A';
          letters[1]='B';
          letters[2]='C';

        */

        /*for (char i='A', j=0; i <='Z' && j<=letters.length; i++, j++) {
             letters[j]=i;
           }
         */
        char ch='A';
        for (int i = 0;  i< letters.length ;i++, ch++) {
           letters[i]=ch;
        }
        System.out.println(Arrays.toString(letters));//(A~Z)

        System.out.println("-------------------------");
        char[] letters2=new char[26]; //[Z ~A]
    }
}