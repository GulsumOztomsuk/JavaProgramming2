package Day43_Abstraction.Employee;

public abstract class Person {
    private String name;  //instance vriable name, age, gender
    private int age;
    private char gender;

    public Person(String name, int age, char gender) { //constructor
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            throw new RuntimeException("Invalid age: "+ age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public abstract void sleep(); //abstract method must be in abstract class //abstract method
    //abstract methots do not have method body
    //abstract class or methot u daha genel hale getirir dataylari vermez

    public void eat(){ //instance method
        System.out.println(name+" is eating baklava ");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
