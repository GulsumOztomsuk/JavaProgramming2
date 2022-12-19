package Day39_Recap.ShapeTask;

public class Rectangle extends Shape{

    private double length,width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0){
            System.err.println("Invalid length: " + length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0){
            System.err.println("Invalid width: "+ width);
            System.exit(1);
        }
        this.width = width;
    }

    /*public Rectangle(String name, double length, double width) {
        super(name);*/
    public Rectangle(double length,double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);

       /* this.length = length;
        this.width = width;
        this part length ant width condition ı eklenmeli tekrar if ile condition eklemek yerine yukarıda set e eklediğimiz icin set seklinde yazarız
        */
    }
    //subClass a extends keyword yazıldıgında hata veriri bunun duzelmesi için contructor yapılır ve relation hatası gider

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}

/*
Rectangle extends Shape:
	variables:
		length
		width
	Encapsulate the fields
	Add a constructor to set the filed
	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter
 */