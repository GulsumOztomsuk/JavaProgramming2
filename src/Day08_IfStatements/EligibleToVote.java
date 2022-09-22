package Day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name= "Nil";
        int age= 38;
        String citizen= "USA";

        boolean isEligible= age>= 21 &&  citizen == "USA"; //true

        //eligible
        if (isEligible){ // true
            System.out.println("eligible");
        }

        //not eligible

        if (!isEligible){ //!true ==> not true ==>false
            System.out.println("not eligible");
        }




    }
}
