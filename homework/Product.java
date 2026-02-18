// Product.java
public class Product {
    private int productId;
    private String productName;
    private double price;

    // Constructor to initialize product details
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Non-static method 
    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Static method
    public static void displayStoreName() {
        System.out.println("Store Name: SuperMart Inventory");
    }

    // Main 
    public static void main(String[] args) {
        Product.displayStoreName();

        Product product1 = new Product(101, "Laptop", 750.50);
        Product product2 = new Product(102, "Smartphone", 450.00);

        System.out.println("\nProduct 1 Details:");
        product1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        product2.displayProductDetails();
    }
}
