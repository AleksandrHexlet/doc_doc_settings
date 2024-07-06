package com.docdoc.settings.repository;

import com.docdoc.settings.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {
    List<Order> findAllByIsActiveTrue();
}
