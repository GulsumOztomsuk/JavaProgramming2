package Day30_CustomClass;

public class Employee {
    public String name;
    public char gender;
    public int age;
    public int ID;
    public String jobTitle;
    public double salary;
    public boolean fullTime;

    public void setInfo(String name, char gender, int age, int ID, String jobTitle, double salary, boolean fullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.fullTime = fullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", fullTime=" + fullTime +
                '}';
    }


    public void work(){
        System.out.println(jobTitle+" "+name +" is working");
    }
}

/*
Employee Class:
		Attributes:
			name, id, gender, jobTitle, salary, isFullTime(boolean)
		Actions:
			toString(): to be able to print each employee object
			setInfo(): to be able to set all the attributes
			work()...
 */