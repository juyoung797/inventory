package com.j797.inventory.query;

import com.j797.inventory.model.Product;
import com.j797.inventory.model.QProduct;
import com.querydsl.core.BooleanBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import com.querydsl.jpa.impl.JPAQueryFactory;

import java.util.*;


@Repository
@RequiredArgsConstructor
public class ProductQueryRepository {
    private final JPAQueryFactory queryFactory;

    public List<Product> search(ProductSearchCondition condition) {
        QProduct product = QProduct.product;
        BooleanBuilder builder = new BooleanBuilder();

        if (condition.getName() != null && !condition.getName().isBlank()) {
            builder.and(product.name.containsIgnoreCase(condition.getName()));
        }
        if (condition.getMinPrice() != null) {
            builder.and(product.price.goe(condition.getMinPrice()));
        }
        if (condition.getMaxPrice() != null) {
            builder.and(product.price.loe(condition.getMaxPrice()));
        }

        return queryFactory.selectFrom(product).where(builder).orderBy(product.name.asc()).fetch();
    }
}