package com.j797.inventory.service;

import com.j797.inventory.dto.ProductDto;
import com.j797.inventory.model.Product;
import com.j797.inventory.query.ProductQueryRepository;
import com.j797.inventory.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductQueryRepository queryRepository;

    public Product create(ProductDto dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        return productRepository.save(product);
    }
}
