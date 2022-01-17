package com.kristovski.estorerest.product.mapper;

import com.kristovski.estorerest.product.Product;
import com.kristovski.estorerest.product.dto.ProductDto;
import org.springframework.data.domain.Page;

public class ProductDtoMapper {

    public static Page<ProductDto> getProductDto(Page<Product> products) {
        return products.map(product -> new ProductDto(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getUnitPrice(),
                product.getImageUrl(),
                product.getUnitsInStock(),
                product.getCategory().getId()));
    }

}
