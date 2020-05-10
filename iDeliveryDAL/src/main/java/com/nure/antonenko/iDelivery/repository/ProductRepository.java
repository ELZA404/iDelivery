package com.nure.antonenko.iDelivery.repository;

import com.nure.antonenko.iDelivery.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
