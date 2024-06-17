package miu.edu.finalexam.service;

import miu.edu.finalexam.dto.request.ProductRequestDto;
import miu.edu.finalexam.model.Product;

import java.util.Optional;

public interface ProductService {
    Optional<Product> findById(Long id);
    Optional<Product> create(Product product);
}
