package com.nure.antonenko.iDelivery.repository;

import com.nure.antonenko.iDelivery.model.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, Long> {
}
