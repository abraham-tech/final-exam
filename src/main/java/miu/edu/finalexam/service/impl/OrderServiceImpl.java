package miu.edu.finalexam.service.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.finalexam.dto.request.OrderRequestDto;
import miu.edu.finalexam.dto.response.OrderResponseDto;
import miu.edu.finalexam.model.Order;
import miu.edu.finalexam.repository.OrderRepository;
import miu.edu.finalexam.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public Optional<Order> findById(Long id) {
        Optional<Order> order = orderRepository.findById(id);
        if(order.isPresent()) {
            return order;
        }
        return Optional.empty();
    }

    @Override
    public Optional<Order> create(Order order) {
        Order newOrder = orderRepository.save(order);
        return Optional.of(newOrder);
    }
}
