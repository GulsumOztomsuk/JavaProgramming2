public class Car {
    public String brand,model;
    public int year;
    public double price;
    public String color;

    public Car(String brand){
        this.brand=brand;
    }
    public Car(String brand,String model){
        this(brand);
        this.model=model;
    }

    public Car(String brand, String model, int year){
        this(brand, model);
        this.year = year;
    }

    public Car(String brand, String model, int year, double price) {
        this(brand, model, year);
        this.price = price;
    }

    public Car(String brand, String model, int year, double price, String color) {
        this(brand, model, year, price);
        this.color = color;
    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

}

class carTest{
    public static void main(String[] args) {

        Day32_Constructor.Car car1 = new Day32_Constructor.Car("Toyota");

        Day32_Constructor.Car car2 = new Day32_Constructor.Car("Honda", "Accord");

        Day32_Constructor.Car car3 = new Day32_Constructor.Car("Lexus", "RX350", 2021);

        Day32_Constructor.Car car4 = new Day32_Constructor.Car("BMW", "X6", 2020, 50000);

        Day32_Constructor.Car car5 = new Day32_Constructor.Car("Tesla", "Model 3", 2019, 70000, "Black");


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);


    }

}
