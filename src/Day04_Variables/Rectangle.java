package Day04_Variables;

public class Rectangle {
    public static void main(String[] args) {
        // lenght, width, area, primeter
        double lenght= 10.5;
        double width=5.5;

        double area= lenght * width;
        double primeter= 2 * (lenght+width);

        System.out.println("lenght = " + lenght);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("primeter = " + primeter);

    }


}

/*
2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
						length
						width
						area = length * width
						perimeter =  2 * (length + width)
 */