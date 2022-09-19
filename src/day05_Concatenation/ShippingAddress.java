package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
         /*
        String name = "James";
        String buildingNumber = "1123B";
         */
        String name="Jimmy King",
               buldingNumber="324G",
                streetName="Jones Branch Dr",
                city="McLean",
                state="VA",
                zipcode="42636A";


         /*
        String name = "James King";
        String buildingNumber = "11821B";
        String  streetName = "Jones Branch Dr";
        String city = "McLean";
        String state = "VA";
        String zipCode = "22031A";
        */

       // System.out.println(name + "\n" + buldingNumber + " "+ streetName + "\n" +city + ", " + state + " " +zipcode );

        String address=name + "\n" + buldingNumber + " "+ streetName + "\n" +city + ", " + state + " " +zipcode;
        System.out.println(address);

    }
}
/*
        Declare the following variables:
        name
        buildingNumber
        streetName
        city
        state
        zipCode
        Use concatenation to print the full shipping address
        EX:
        Jimmy Joe
        7925 Jones Branch Dr
        McLean, VA 20125
*/