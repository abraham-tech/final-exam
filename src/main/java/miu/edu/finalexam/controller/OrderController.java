package miu.edu.finalexam.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.finalexam.model.Order;
import miu.edu.finalexam.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable Long id) {
        Optional<Order> order = orderService.findById(id);
        if (order.isPresent()){
            return ResponseEntity.ok(order.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        Optional<Order> newOrder = orderService.create(order);
        if (newOrder.isPresent()){
            return ResponseEntity.ok(newOrder.get());
        }
        return ResponseEntity.internalServerError().build();
    }
}
