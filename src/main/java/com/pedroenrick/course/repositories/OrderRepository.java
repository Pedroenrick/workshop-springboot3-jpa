package com.pedroenrick.course.repositories;

import com.pedroenrick.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order, Long> {
}
