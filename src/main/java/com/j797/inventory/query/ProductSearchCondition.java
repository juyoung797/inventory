package com.j797.inventory.query;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductSearchCondition {
    private String name;
    private BigDecimal minPrice;
    private BigDecimal maxPrice;
}
