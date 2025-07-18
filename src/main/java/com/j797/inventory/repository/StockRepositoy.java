package com.j797.inventory.repository;

import com.j797.inventory.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.Optional;

public interface StockRepositoy extends JpaRepository<Stock, Long>, QuerydslPredicateExecutor<Stock> {
    Optional<Stock> findByProductIdAndWarehouseId(Long productId, Long warehouseId);
}
