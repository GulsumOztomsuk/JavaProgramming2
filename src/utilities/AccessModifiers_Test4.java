package utilities;

import Day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {
      //  System.out.println(AccessModifiers_Test4.name1);//default access is not visible outside the package
        System.out.println(AccessModifiers_Test4.name2);//protected access is visible outside package in subClass ONLY

        //AccessModifiers_Test4.mehod1();
        AccessModifiers_Test4.method2();
    }

}
