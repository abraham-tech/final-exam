package miu.edu.finalexam.repository;

import miu.edu.finalexam.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
