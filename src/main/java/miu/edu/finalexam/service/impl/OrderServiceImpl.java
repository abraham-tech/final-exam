package miu.edu.finalexam.service.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.finalexam.dto.request.OrderRequestDto;
import miu.edu.finalexam.dto.response.OrderResponseDto;
import miu.edu.finalexam.model.Order;
import miu.edu.finalexam.repository.OrderRepository;
import miu.edu.finalexam.service.OrderService;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;
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

    @Override
    public Page<Order> findAll(int pageNumber, int pageSize, String direction, String orderBy) {
        Pageable pageable = PageRequest.of(
                pageNumber,
                pageSize,
                Sort.Direction.fromString(direction),
                orderBy
        );

        Page<Order> orderPage = orderRepository.findAll(pageable);
//
        return new PageImpl<>(
                orderPage.getContent(),
                pageable,
                orderPage.getTotalElements());
    }
}
