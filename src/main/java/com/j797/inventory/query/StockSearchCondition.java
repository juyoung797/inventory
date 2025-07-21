package com.j797.inventory.query;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockSearchCondition {
    private String productName;
    private String warehouseName;
    private Integer minQuantity;
    private Integer maxQuantity;
}