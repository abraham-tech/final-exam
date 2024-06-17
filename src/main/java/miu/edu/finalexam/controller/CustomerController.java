package miu.edu.finalexam.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.finalexam.model.Customer;
import miu.edu.finalexam.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findById(@PathVariable Long id) {
        Optional<Customer> customer = customerService.findById(id);
        if (customer.isPresent()){
            return ResponseEntity.ok(customer.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer customer) {
        Optional<Customer> newCustomer = customerService.create(customer);
        if(newCustomer.isPresent()){
            return ResponseEntity.ok(newCustomer.get());
        }
        return ResponseEntity.internalServerError().build();
    }
}
