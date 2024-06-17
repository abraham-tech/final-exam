package miu.edu.finalexam.service;

import miu.edu.finalexam.dto.request.OrderRequestDto;
import miu.edu.finalexam.dto.response.OrderResponseDto;
import miu.edu.finalexam.model.Order;

import java.util.Optional;

public interface OrderService {
    Optional<Order> findById(Long id);
    Optional<Order> create(Order order);
}
