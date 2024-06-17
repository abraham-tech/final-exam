package miu.edu.finalexam.repository;

import miu.edu.finalexam.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
