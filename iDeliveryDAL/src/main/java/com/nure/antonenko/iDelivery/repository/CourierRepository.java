package com.nure.antonenko.iDelivery.repository;

import com.nure.antonenko.iDelivery.model.Courier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourierRepository extends JpaRepository<Courier, Long> {
}
