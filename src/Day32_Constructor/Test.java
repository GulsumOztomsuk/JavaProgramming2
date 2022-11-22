package Day32_Constructor;

public class Test {
    public Test(){//A
        System.out.println("A");
    }
    public Test(int a){ //A B
        this();
        System.out.println("B");
    }
    public Test(double b){ //A B C
        this(10);
        System.out.println("C");
    }
    public Test(String str){//A B C D
        this(12.5);
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Test("Java");
       /* Test test1=new Test();
        System.out.println("----------------------");
        Test test2=new Test(10);
        System.out.println("---------------------------");
        Test test3=new Test(12.5);
        System.out.println("------------------------------");
        Test test4=new Test("Alice");

        */
    }
}
