import java.util.List;

public interface CustomerDaoInterface {
    void add(Customer customer);

    List<Customer> getAll();
}
