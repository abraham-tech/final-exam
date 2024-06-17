package miu.edu.finalexam.service.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.finalexam.dto.request.ProductRequestDto;
import miu.edu.finalexam.model.Product;
import miu.edu.finalexam.repository.ProductRepository;
import miu.edu.finalexam.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImple implements ProductService{

    private final ProductRepository productRepository;

    @Override
    public Optional<Product> findById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()){
            return product;
        }
        return Optional.empty();
    }

    @Override
    public Optional<Product> create(Product product) {
        Product newProduct = productRepository.save(product);
        return Optional.of(newProduct);
    }
}
