package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> productMap = new HashMap<>();

    static {
        productMap.put(1, new Product(1, "book", 20000, "cuon sach ", "bookVendor"));
        productMap.put(2, new Product(2, "board", 30000, "bang den", "boardVendor"));
        productMap.put(3, new Product(3, "pencil", 40000, "but chi", "pencilVendor"));
        productMap.put(4, new Product(4, "erase", 50000, "cuc tay", "eraseVendor"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public Product findByName(String name) {
        for (Map.Entry me : productMap.entrySet()) {
            if (((Product) me.getValue()).getName().equals(name)) {
                return (Product) me.getValue();
            }
        }
        return null;
    }
}