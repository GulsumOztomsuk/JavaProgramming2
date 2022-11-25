package Day34_GarbageCollection_AccessModifiers;

public class AccessModifier_Test {
    public static void main(String[] args) {

        System.out.println(AccessModifier.publicData);
        System.out.println(AccessModifier.defaultData);
        //System.out.println(AccessModifier.privateData); // private is not visible outside the class

        AccessModifier.method1();
        AccessModifier.method2();
        //AccessModifier.method3(); //private is not visible outside the class
    }
}
