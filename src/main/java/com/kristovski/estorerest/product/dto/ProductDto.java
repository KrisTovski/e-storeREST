package com.kristovski.estorerest.product.dto;

import java.math.BigDecimal;

public record ProductDto(Long id,
                         String name,
                         String description,
                         BigDecimal unitPrice,
                         String imageUrl,
                         int unitsInStock,
                         Long categoryId) {
}
