package day05_Concatenation;

public class fullName {
    public static void main(String[] args) {
        String firstName="Alice";
        String lastName="Can";
        int age= 25;
        String jobTitle="SDET";
        String companyName="NASA";
        double salary=1200000.98;

        String fullName= firstName + " " + lastName;
        System.out.println(fullName);

        //FullName of the person is ______
        System.out.println("fullname of the person is " + fullName);

        // ___is ___ years old.
        System.out.println(fullName + " is " + age + " years old.");
        // fullname is jobTitle, works at companyName and fullname salary is salary.
        System.out.println(fullName + " is " + jobTitle + ", "
                +" works at " + companyName + ", and " +fullName +
                "'s salary$" + salary);
    }
}
