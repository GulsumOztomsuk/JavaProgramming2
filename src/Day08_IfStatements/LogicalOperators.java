package Day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        String name="Alice";
        int age= 19;
        String citizen= "USA";

        boolean isEligibleVote= age >=18 && citizen == "UK";
        //  19 >= 18 && "USA" == "UK"
        //   true    && false ==> false

        System.out.println(name +" is eligible to vote = " + isEligibleVote);
        System.out.println("-------------------------------------");

        String name2 = "Josh";

        int creditScore=720;
        int age2= 23;
        int income=40000;

        boolean isEligable2= creditScore >= 700 && age2 >= 21 && income >= 35000;

        System.out.println(name2 + " is eligable for loan " +isEligable2);
        System.out.println("-----------------------------");

        String name3="Jimmy";
        int age3= 21;
        char gender='F';

        boolean isEligible= age3 >=18 && (gender == 'M' || gender =='F');
                     //     21 >= 18  &&  ('F'=='M'  || 'F'=='F'
                     //      true     &&  ( false    || true )
                     //      true     &&   true ==> true

        System.out.println(name3 + " is eligible for register = " + isEligible);
        System.out.println("------------------------------");

        String name4="Carter";
        String countryOfBirth ="UK";
        boolean marriedOfUSACitizen=false;

        boolean isEligible4= countryOfBirth == "USA"  || marriedOfUSACitizen == true;
                        //     false                  || false

        System.out.println(name + " is eligible to apply for US citizenShip = " + isEligible4);
        System.out.println("----------------------------------------------------------------");

        String student = "Ali";

        double gpa = 2.5;
        int familyIncome = 50000;

        boolean isEligible5 =  gpa >= 3.5 || familyIncome <= 60000;
        //                      false || true

        System.out.println(student +" is eligible for scholarship: "+isEligible5);

        System.out.println("-------------------------------------------");

        boolean result2= true;
        System.out.println("result2 = " + result2);
        boolean result3=!result2;
        System.out.println("result3 = " + result3);
        System.out.println("-----------------------------");

        int score=85;
        boolean passed= score >= 60;
        boolean failed= !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

    }
}
