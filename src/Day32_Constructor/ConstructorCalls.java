package Day32_Constructor;

public class ConstructorCalls {
    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }
    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls(String str){
        this(12);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        ConstructorCalls Obj1=new ConstructorCalls();
        System.out.println("-----------------------------");

        ConstructorCalls Obj2=new ConstructorCalls(12);

        System.out.println("-----------------------------------");

        ConstructorCalls obj3=new ConstructorCalls("JAVA");
    }
}
