package Day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char[] alphabet=new char[26]; //[Z~A]
        /*       i   ch
        alphabet[0]='Z';
        alphabet[1]='Y';
        alphabet[2]='X';
         */
        char ch='Z';
        for (int i = 0; i < alphabet.length ; i++, ch--) {
         alphabet[i]=ch;
        }
         /*
        for (char i = 0, j='Z'; i < alphabet.length ; i++, j--) {
          alphabet[i]=j;
        }*/

       // System.out.println(alphabet);
        System.out.println(Arrays.toString(alphabet));// print the whole array
       // System.out.println(alphabet[0]);// printing the elemnt of array

          }
}
