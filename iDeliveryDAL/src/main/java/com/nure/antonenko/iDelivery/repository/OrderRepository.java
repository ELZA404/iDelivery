package com.nure.antonenko.iDelivery.repository;

import com.nure.antonenko.iDelivery.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
