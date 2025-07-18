package com.j797.inventory.repository;

import com.j797.inventory.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long>, QuerydslPredicateExecutor<Warehouse> {

}
