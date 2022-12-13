package Day38_Inheritance.carTask;

public class BMW extends Car{
    public BMW(String brand, String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }
    public void breaksDown(){
        System.out.println(brand+" "+model+" is breaking down");
    }
    public void racing(){
        System.out.println(brand+" "+model+" is a racing car");
    }
    public void start(){
        System.out.println(brand+" "+model+" is starting");
    }
}
/*
2. BMW:
					extra methods:
						breaksDown()
						racing()
 */