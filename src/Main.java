import java.util.HashMap;

public class Main {

    static HashMap<Integer, Product> hm = new HashMap<>();

    public static void main(String[] args) {


        Product product = new Product(1, "Iphone11", "Apple", "6.2 inch display", "Black", "Dailiy use", 90000.67, 4.6, "Glass back");
        Product product1 = new Product(2, "Iphone12", "Apple", "6.8 inch display", "Blue", "Dailiy use", 120000.97, 4.5, "Glass back");
        Product product2 = new Product(3, "Iphone13", "Apple", "7 inch display", "White", "Dailiy use", 140500.67, 4.7, "Glass back");
        Product product3 = new Product(4, "S22 Ultra", "Samsung", "7 inch display", "Black", "Dailiy use", 90500.67, 4.7, "Glass back");


        ProductService productService = new ProductService();

        productService.createProduct(1, product, hm);
        productService.createProduct(2, product1, hm);

        System.out.println(productService.readProduct(1, hm));

        productService.updateProduct(1, 100000.09, 4.7, hm);
        System.out.println(hm.get(1));

        productService.deleteProduct(2, hm);
        System.out.println(hm.get(2));
    }


}

