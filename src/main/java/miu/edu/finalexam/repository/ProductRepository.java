package miu.edu.finalexam.repository;

import miu.edu.finalexam.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
