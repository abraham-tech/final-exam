package miu.edu.finalexam.service;

import miu.edu.finalexam.dto.request.OrderRequestDto;
import miu.edu.finalexam.dto.response.OrderResponseDto;
import miu.edu.finalexam.model.Order;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface OrderService {
    Optional<Order> findById(Long id);
    Optional<Order> create(Order order);
    Page<Order> findAll(int pageNumber, int pageSize, String direction, String orderBy);
}
