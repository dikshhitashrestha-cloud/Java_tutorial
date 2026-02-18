class Mobile {
    String brandName;
    String model;
    double price;

    // Constructor to initialize values
    Mobile(String brandName, String model, double price) {
        this.brandName = brandName;
        this.model = model;
        this.price = price;
    }

    // Non-static method 
    void displayMobileDetails() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    // Static method 
    static void showWarrantyInfo() {
        System.out.println("Warranty: 1 Year Manufacturer Warranty");
    }

    public static void main(String[] args) {
        Mobile m = new Mobile("Iphone", "Iphone 17 pro max", 200000);

        showWarrantyInfo();
        m.displayMobileDetails();
    }
}
