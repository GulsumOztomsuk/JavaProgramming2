package Day31_Constructors;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1=new Student("Ayşe",23,'F','B',123);

        Student student2 = new Student("Ali",30,'M','A',42);

        System.out.println(student1);
        System.out.println(student2);
    }
}
