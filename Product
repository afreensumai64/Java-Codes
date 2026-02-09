class Product {

    int productId;
    String productName;
    double price;
    int quantity;

    // Method to set product details
    void setProductDetails(int id, String name, double pr, int qty) {
        productId = id;
        productName = name;
        price = pr;
        quantity = qty;
    }

    // Method to calculate total cost
    double calculateTotal() {
        return price * quantity;
    }

    // Method to display product details
    void displayProductDetails() {
        System.out.println("Product ID       : " + productId);
        System.out.println("Product Name     : " + productName);
        System.out.println("Price per Item   : ₹" + price);
        System.out.println("Quantity         : " + quantity);
        System.out.println("Total Price      : ₹" + calculateTotal());
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product();

        p1.setProductDetails(201, "Wireless Mouse", 799, 2);
        p2.setProductDetails(202, "Bluetooth Headset", 1499, 1);

        System.out.println("E-COMMERCE APPLICATION");
        System.out.println("--------------------------------");

        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}
