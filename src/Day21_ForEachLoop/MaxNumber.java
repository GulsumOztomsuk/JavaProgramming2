package Day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {
        int[] number= {10, 5, 4, 20, 1, 0};
        int max=number[0];

       /* for (int i = 0; i < number.length; i++) {
            if(numbers[i] > max ){ // if there is element in the array that's greater than the current max number
                max = numbers[i]; // assigning greater number to variable max
            }
        }*/

        for (int each:number){
            if (each> max){
                max=each;
            }
        }
        System.out.println(max);
    }
}
