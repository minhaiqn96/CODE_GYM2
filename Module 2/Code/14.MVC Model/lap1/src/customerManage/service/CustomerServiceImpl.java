package customerManage.service;

import customerManage.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customers = new HashMap<>();

    static {
        customers.put(1, new Customer(1, "Duc", "duc@gmail.com", "Quang Nam"));
        customers.put(2, new Customer(2, "Xuan", "xuan@gmail.com", "Da Nang"));
        customers.put(3, new Customer(3, "Hai", "hai@gmail.com", "Ha Noi"));
        customers.put(4, new Customer(4, "Na", "na@gmail.com", "Thanh Hoa"));
        customers.put(5, new Customer(5, "Tan", "tan@gmail.com", "Ninh Binh"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
