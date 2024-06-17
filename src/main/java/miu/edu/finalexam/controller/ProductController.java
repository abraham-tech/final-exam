package miu.edu.finalexam.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.finalexam.model.Product;
import miu.edu.finalexam.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long id) {
        Optional<Product> product = productService.findById(id);
        if (product.isPresent()) {
            return ResponseEntity.ok(product.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Optional<Product> newProduct = productService.create(product);
        if (newProduct.isPresent()) {
            return ResponseEntity.ok(newProduct.get());
        }
        return ResponseEntity.internalServerError().build();
    }
}
