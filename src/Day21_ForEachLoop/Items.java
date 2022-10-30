package Day21_ForEachLoop;

public class Items {
    public static void main(String[] args) {
        //                   0         1           2         3
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
         //  4           5
        //                   0        1       2       3        4
        double[] prices = {99.99,   150.0,  9.99,   250.0 ,  439.50,  39.99};
             // 5
        //                   0        1       2       3       4
        int[] itemIDs =   {12345 ,  12346,  12347,  12348,  12349,   12350};
        // 5

        for (int i = 0; i < items.length; i++) {
            String item=items[i];
            double price=prices[i];
            int id=itemIDs[i];
            System.out.println(item + " - "+id+" - $"+price);

            
        }
    }
}
