package Day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("--------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

        ArraysUtility.printEachElement(arr2);

        System.out.println("--------------------------------");

        char[] arr3 = {'A', 'B', 'C', 'D'};

        ArraysUtility.printEachElement(arr3);

        System.out.println("--------------------------------");

        String[] names = {"David", "Elvira", "Ali", "Igor"};

        ArraysUtility.printEachElement(names);


        System.out.println("--------------------------------");

        int[] n1 = {10, 2, 4, 3, 1};
        int max1 = ArraysUtility.max(n1);
        System.out.println("max1 = " + max1);

        System.out.println("-----------------------");

        double[] n2={1.5,3.2,6.4};
        double max2=ArraysUtility.max(n2);
        System.out.println("max2 = " + max2);

        System.out.println("-----------------------");

        int[] num1={2,3,5,7,1};
        int min1=ArraysUtility.min(num1);
        System.out.println("min1 = " + min1);

        System.out.println("------------------------");

        double[] num2={1.2,3.5,6.2};
        double min2=ArraysUtility.min(num2);
        System.out.println("min2 = " + min2);

        System.out.println("---------------------");

        int[] a1 = {1,2,3,4,5,6,7};

        boolean r1 = ArraysUtility.contains(a1, 10);

        System.out.println("r1 = " + r1);

    }
}
