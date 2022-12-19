package Day39_Recap.ShapeTask;

public class Circle extends Shape{

   private double radius;
   public static double pi=3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <=0){
            System.err.println("Invalid radius: "+ radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        Circle.pi = pi;
    }

    public Circle(String name, double radius) {
        super(name);
       setRadius(radius);
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=' " + pi + '\''+
                ", area=' " + area() + '\''+
                ", perimeter=" + perimeter() + '\''+
                '}';
    }
}

/*
Circle extends Shape:
		variables:
			radius
			pi (static)
		Encapsulate the field
		Add a constructor to set the filed
		area(): radius * radius * pi
		perimeter(): 2 * radius * pi
		toString(): r, pi, area, perimeter
 */