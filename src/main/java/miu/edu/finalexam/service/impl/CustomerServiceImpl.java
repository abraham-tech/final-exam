package miu.edu.finalexam.service.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.finalexam.dto.request.CustomerRequestDto;
import miu.edu.finalexam.dto.response.CustomerResponseDto;
import miu.edu.finalexam.dto.response.OrderResponseDto;
import miu.edu.finalexam.model.Customer;
import miu.edu.finalexam.model.Order;
import miu.edu.finalexam.repository.CustomerRepository;
import miu.edu.finalexam.service.CustomerService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public Optional<Customer> findById(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if(customer.isPresent()) {
            return customer;
        }
        return Optional.empty();
    }

    @Override
    public Optional<Customer> create(Customer customer) {
        Customer newCustomer = customerRepository.save(customer);
        return Optional.of(newCustomer);
    }
}
