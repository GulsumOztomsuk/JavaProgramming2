package Day42_Exceptions;

import Day31_Constructors.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {
    public static void main(String[] args) {
        throw new NoSuchElementException("No such element");//unchecked

        //throw new InterruptedException();//because checked

        //System.out.println("Hello world");


       // throw new Rectangle(5,7);
    }
}
