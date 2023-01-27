import java.util.HashMap;

public class ProductService implements IProductService {
    public void createProduct(int id, Product product, HashMap<Integer, Product> hm) {
        hm.put(id, product);
    }

    public Product readProduct(int id, HashMap<Integer, Product> hm) {
        return hm.get(id);
    }

    public void updateProduct(int id, double price, double rating, HashMap<Integer, Product> hm) {
        Product product = hm.get(id);
        product.setRating(rating);
        product.setPrice(price);
        hm.put(id, product);
    }

    public void deleteProduct(int id, HashMap<Integer, Product> hm) {
        Product product = hm.remove(id);

    }
}

