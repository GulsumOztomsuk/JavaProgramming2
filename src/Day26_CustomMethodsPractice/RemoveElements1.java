package Day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {
    public static void main(String[] args) {

        int[] numbers={100,200,300,400,500,600};

        numbers=removeElements(numbers,1);//[100,300,400,500,600]
        numbers=removeElements(numbers,1);//[100,400,500,600]

        System.out.println(Arrays.toString(numbers));
    }
    //removes the index from the array, returns new array
    public static int[] removeElements(int[] array,int index){

        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index "+ index);
            System.exit(0);
        }
        int[] result=new int[array.length-1];
        int j=0;
        for(int i = 0; i < array.length; i++){
            if (i == index){//if the index of array is matching with the given index
                continue;//skip
            }
            result[j++]=array[i];
        }
        return result;
    }

    //removes the index from the array, returns new array
    public static double[] removeElements(double[] array,int index){

        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index "+ index);
            System.exit(0);
        }
        double[] result=new double[array.length-1];
        int j=0;
        for(int i = 0; i < array.length; i++){
            if (i == index){//if the index of array is matching with the given index
                continue;//skip
            }
            result[j++]=array[i];
        }
        return result;
    }

    //removes the index from the array, returns new array
    public static char[] removeElements(char[] array,int index){

        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index "+ index);
            System.exit(0);
        }
        char[] result=new char[array.length-1];
        int j=0;
        for(int i = 0; i < array.length; i++){
            if (i == index){//if the index of array is matching with the given index
                continue;//skip
            }
            result[j++]=array[i];
        }
        return result;
    }

    //removes the index from the array, returns new array
    public static String[] removeElements(String[] array,int index){

        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index "+ index);
            System.exit(0);
        }
        String[] result=new String[array.length-1];
        int j=0;
        for(int i = 0; i < array.length; i++){
            if (i == index){//if the index of array is matching with the given index
                continue;//skip
            }
            result[j++]=array[i];
        }
        return result;
    }

}
