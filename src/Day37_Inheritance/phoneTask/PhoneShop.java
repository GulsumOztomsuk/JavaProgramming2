package Day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone=new Iphone("Iphone 12","6.7 Inches",1000,"Black");
        Samsung samsung=new Samsung("Galaxy S19","6 Inches",900,"White");
        Nokia nokia=new Nokia("Brick","4 Inches",50,"Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(789456123);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("------------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("--------------------------------------------------");

        nokia.call(432109876);
        nokia.text(321098765);
        nokia.selfDefense();

        System.out.println("-------------------------------------------------");

        System.out.println( Phone.hasBattary );
        System.out.println( Iphone.hasBattary );
        System.out.println( Samsung.hasBattary );
        System.out.println( Nokia.hasBattary);

    }
}
