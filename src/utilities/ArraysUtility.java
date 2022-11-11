package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //print each integer of an integer array in separate line
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    //print each double of a double array in separate line
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    //print each char of a char array in separate line
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    //print each String of a String array in separate line
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);

        }
    }

    //returns the max number from integer array
    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    //returns the max number from double array
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    //returns the minimum number from integer array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    //returns the minimum number from double array
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    //check if the given integer is contained in the given array. returns boolean. contains int[], int
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
        //same goes for Double and char and String
        // for String if(each.equls(element) must be
    }

    // adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    // adds the given element to array, returns a new array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // adds the given element to array, returns a new array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // adds the given element to array, returns a new array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count=0;
        for (int each:array){
            if (each==element){
                count++;
            }
        }
        return count;
    }
    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element){
        int count=0;
        for (double each:array){
            if (each==element){
                count++;
            }
        }
        return count;
    }
    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element){
        int count=0;
        for (char each:array){
            if (each==element){
                count++;
            }
        }
        return count;
    }
    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){
        int count=0;
        for (String each:array){
            if (each.equals(element)){
                count++;
            }
        }
        return count;
    }

    //returns the uniqu element of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result={};
        for (int each:array){
            if (ArraysUtility.frequencyOfElement(array,each)==1){
                result= ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the uniqu element of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result={};//new int[0]
        for (double each:array){
            if (ArraysUtility.frequencyOfElement(array,each)==1){ //if the frequency is 1 the element is unique
                result= ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the uniqu element of the array as a new array
    public static char[] uniqueElements(char[] array){
        char[] result={};
        for (char each:array){
            if (ArraysUtility.frequencyOfElement(array,each)==1){
                result= ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the uniqu element of the array as a new array
    public static String[] uniqueElements(String[] array){
        String[] result={};
        for (String each:array){
            if (ArraysUtility.frequencyOfElement(array,each)==1){
                result= ArraysUtility.addElement(result, each);
            }
        }
        return result;
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

    //merge the given from to array, returns new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result=new int[arr1.length+ arr2.length];
        //int[] result={};
        for (int each:arr1) {
            result=addElement(result, each);
        }
        for (int each:arr2) {
            result=addElement(result, each);
        }
        return result;
    }

    // merge the given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2){

        double[] result = {};

        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }


    // merge the given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2){

        char[] result = {};

        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }


    // merge the given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2) {

        String[] result = {};

        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;

    }


    //replace the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }


    //replace the elements of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }


    //replace the elements of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }


    //replace the elements of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }


}