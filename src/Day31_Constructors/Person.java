package Day31_Constructors;

public class Person {    //instance veriable
    public String name;
    public char gender;
    public int age;

    public Person(String name, char gender, int age){  //constructor
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public String toString() {     //toString Method
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
