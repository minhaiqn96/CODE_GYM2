package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);

    Product findByName(String name);
}

//productMap.put(1, new Product(1, "book", 10000, "cuon sach", "bookVendor"));
//        productMap.put(2, new Product(2, "noteBook", 15000, "cuon so", "noteBookVendor"));
//        productMap.put(3, new Product(3, "pencil", 20000, "but chi", "pencilVendor"));
//        productMap.put(4, new Product(4, "pen", 25000, "but bi", "penVendor"));
//        productMap.put(5, new Product(5, "erase", 30000, "cuc tay", "eraseVendor"));