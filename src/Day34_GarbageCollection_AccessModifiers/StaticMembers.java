package Day34_GarbageCollection_AccessModifiers;

public class StaticMembers {  //outer class    access modifier

    class class1{   //inner class          default access modifier

    }

    public static int num=100;   //variable

    public static void method(){     //method

    }
    static {

    }
}


class A { // outer class

    static class B { // inner class

        public static void method1(){

        }

    }

}


class C{
    public static void main(String[] args) {
        A.B.method1();
    }
}






class X{

}

class Y{

}

class Z{
    static class Q{

    }
}








