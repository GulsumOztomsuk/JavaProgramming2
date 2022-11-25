package Day30_CustomClass;

public class Car {

    String brand;
    String model;
    String color;
    int year;
    double price;



    public void setInfo(String carBrand,String carModel,String carColor,int carYear, double carPrice){
        brand=carBrand;
        model=carModel;
        color=carColor;
        year=carYear;
        price=carPrice;

    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $ " + price +
                '}';
    }
    public void drive(){
        System.out.println("Driving " +brand + model);
    }
    public void start(){
        System.out.println(brand + model + " has started.");
    }
    public void stop(){
        System.out.println(brand + model + " has stopped.");
    }
}
