class Product {
    private static double discount = 10.0; // Static discount shared by all products
    private final int productID; // Final variable ensuring unique product ID
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' to initialize instance variables
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProductDetails() {
        if (this instanceof Product) { // Using instanceof
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("-------------------------");
        }
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("New Discount Updated to: " + discount + "%");
    }
}

// Main class
public class ShoppingCart {
    public static void main(String[] args) {
        Product prod1 = new Product(101, "Laptop", 1200, 2);
        Product prod2 = new Product(102, "Smartphone", 800, 5);

        System.out.println("Before Discount Update:");
        prod1.displayProductDetails();
        prod2.displayProductDetails();

        // Update discount
        Product.updateDiscount(15);

        System.out.println("After Discount Update:");
        prod1.displayProductDetails();
        prod2.displayProductDetails();
    }
}
