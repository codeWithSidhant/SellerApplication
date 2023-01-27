public class Product {
    private int productID;
    private String name;
    private String brand;
    private String size;
    private String colour;
    private String occasion;
    private double price;
    private double rating;
    private String material;

    public Product(int productID, String name, String brand, String size, String colour, String occasion, double price, double rating, String material) {
        this.productID = productID;
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.colour = colour;
        this.occasion = occasion;
        this.price = price;
        this.rating = rating;
        this.material = material;
    }

    public Product(Product Source) {
        this.productID = Source.productID;
        this.name = Source.name;
        this.brand = Source.brand;
        this.size = Source.size;
        this.colour = Source.colour;
        this.occasion = Source.occasion;
        this.price = Source.price;
        this.rating = Source.rating;
        this.material = Source.material;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "CommonProduct{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                ", occasion='" + occasion + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", material='" + material + '\'' +
                '}';
    }
}
