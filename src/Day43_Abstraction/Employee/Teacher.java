package Day43_Abstraction.Employee;

public final class Teacher extends Employee {

    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }
    public void work(){
        System.out.println(getName()+" is teaching.");
    }
    public void sleep(){
        System.out.println(getName()+" is sleeping 8 hours.");
    }
}
