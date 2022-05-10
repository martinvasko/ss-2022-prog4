package at.ac.fhstp.springboot;

import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    private CustomerRepository customerRepository;
    
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Iterable<Customer> getAll() {
        return customerRepository.findAll();
    }

    public Customer findById(long id) {
        return customerRepository.findById(id);
    }
}
