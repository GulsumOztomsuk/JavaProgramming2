package Day14_String;

public class StringMethods2 {
    public static void main(String[] args) {
        String str="Java is fun, I love learning Java.";
        String str2=str.replace("Java", "Phyton");
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email="JohnSmith@yahoo.com";
        email=email.replace("yahoo", "gmail");
        System.out.println("email = " + email);

        String sentence="Java Java Phyton Phyton C# C# C++ C++ Phyton Phyton Phyton Phyton";
       String sentence2=sentence.replace("Phyton", "");
        sentence2=sentence2.replace("   ", " ");

        System.out.println("sentence2 = " + sentence2);

    }
}
