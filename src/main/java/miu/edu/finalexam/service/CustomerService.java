package miu.edu.finalexam.service;

import miu.edu.finalexam.dto.request.CustomerRequestDto;
import miu.edu.finalexam.dto.response.CustomerResponseDto;
import miu.edu.finalexam.model.Customer;

import java.util.Optional;

public interface CustomerService {
    Optional<Customer> findById(Long id);
    Optional<Customer> create(Customer customer);
}
