package Day39_Recap.ShapeTask;

public class Shape {

    private String name;

   public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            System.err.println("Name can not be null");
            System.exit(1); // 1: some thing went wrong
        }
        //"" --> this is an object
        //null --> is not an object === null and "" not same things

        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }

        this.name = name;
    }


    public Shape(String name) {
        setName(name);
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0; // at this return never used another where so 0 or another sayı does not matter
    }


    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }

}
/*
	Shape:
	variables:
			name
	Encapsulate the field
	Add a constructor to set the filed
	Methods:
		area(){}
		perimeter(){}
 */