package Assignment4_2;

public class OnlineStore {
    public static void main(String[] args) {
        // Create a Product object using the constructor.
        Product p1 = new Product("l101","Laptop",4000,true);

                //Use getters to print initial product details.

        System.out.println("Initial Product Details: ");
        System.out.println("ID: "+p1.getProductId());
        System.out.println("Name: "+p1.getProductName());
        System.out.println("Price: "+p1.getPrice());
        System.out.println("Stock Status: " +p1.isInStock());
        System.out.println("------------------------");

        //Once with a valid value

        p1.setPrice(5000);
        System.out.println("------------------------");

        //Once with an invalid negative value (observe validation)

        p1.setPrice(-5000);
        System.out.println("------------------------");

        //Use setInStock() to change the stock status.

        p1.setInStock(false);



    }
}
