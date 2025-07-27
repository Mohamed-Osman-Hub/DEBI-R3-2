package Assignment4_2;

//Private Attributes:

public class Product {
    private final String productId;
    private final String productName;
    private double price;
    private boolean inStock;

//Constructor that initializes all attributes.

  public Product (String productId,String productName,double price,boolean inStock){
    this.productId = productId;
    this.productName = productName;
    this.price = price;
    this.inStock = inStock;
  }

   //Public getter methods: getProductId(), getProductName(), getPrice(), isInStock().

    public String getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public boolean isInStock() {
        return inStock;
    }

    //Public setter methods.


    public void setPrice(double newPrice) {
        System.out.println(" Current Price: "+price);

        if (price<0){
            System.out.println("Error: Price cannot be negative.");
            return;
        }
        price=newPrice;
        System.out.println("Updated Price: "+price);
    }

    //setInStock(boolean status).


    public void setInStock(boolean status) {
        System.out.println("Current Stock Status: ");
        if (inStock) {
            System.out.println("In Stock");
        }else {
            System.out.println("Out of Stock");
        }
        inStock = status;
        System.out.println("Current Stock Status: ");
        if (inStock) {
            System.out.println("In Stock");
        }else {
            System.out.println("Out of Stock");
        }
    }



}
