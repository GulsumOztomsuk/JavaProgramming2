package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        /*
        90 ~ 100: excellent
        80 ~ 89: Great
        70 ~ 79: Good
        60 ~ 69: Passed
        0 ~ 59 : Failed
         */
        int score=95;

        if (score >= 0 && score <= 100){ // if the score is valid
            // 5 possibilities : A, B, C, D, F
            if (score >= 90){ // false if score< 90
                System.out.println("Excellent");
            } else if (score >= 80) { // false if score <80
                System.out.println("Great");
            } else if (score >= 70) {// false if score < 70
                System.out.println("Good");
            } else if (score >= 60) { // fase if score < 60
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        }else {
            System.out.println("Invalid"); // ıf the score is not valid
        }
        System.out.println("---------------------------");

        String result= ""; // temproray

        if (score >= 0 && score <= 100){ // if the score is valid

            if (score >= 90){ // false if score< 90
                 result= "excellent";
            } else if (score >= 80) { // false if score <80
                result="Great";
            } else if (score >= 70) {// false if score < 70
               result="Good";
            } else if (score >= 60) { // fase if score < 60
               result="Passed";
            }else {
               result="Failed";
            }
        }else {
            result="Invalid"; // ıf the score is not valid
        }
        System.out.println("result");

    }
}
