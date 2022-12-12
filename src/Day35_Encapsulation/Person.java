package Day35_Encapsulation;

public class Person {

    public String name;   //instance variable
    public int age;
    public char gender;
    public String language;

    public static String planet;    //static variable
    public static boolean isHuman,hasNose;
    public static int numberOfWings,numberOfHead;

   //
    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static {      //static block
        planet="Earth";
        isHuman=true;
        hasNose=true;
        numberOfHead=1;
        numberOfWings=0;
    }

    public static void printPlanetName(){   // static method
        System.out.println("Planet name is "+ planet);
    }

    public void eat(String food){   //not static because name is instance so it can not be static
        System.out.println(name+" is eating " +food);
    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+ drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet= "+ planet + '\'' +
                '}';
    }
}


/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead
			Add a constructor to initialize all the fields
			Add a static block to initialize all the statics
			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */
