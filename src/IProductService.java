import java.util.HashMap;

public interface IProductService {
    void createProduct(int id, Product product, HashMap<Integer, Product> hm);
    void deleteProduct(int id, HashMap<Integer, Product> hm);
    void updateProduct(int id, double price, double rating, HashMap<Integer, Product> hm);
    Product readProduct(int id, HashMap<Integer, Product> hm);
}
