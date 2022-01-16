package com.kristovski.estorerest.productCategory.mapper;

import com.kristovski.estorerest.productCategory.ProductCategory;
import com.kristovski.estorerest.productCategory.dto.ProductCategoryDto;
import org.springframework.data.domain.Page;

public class ProductCategoryDtoMapper {

    public static Page<ProductCategoryDto> getProductCategoryDto(Page<ProductCategory> categories) {
        return categories.map(category -> new ProductCategoryDto(
                category.getId(),
                category.getName(),
                category.getDescription(),
                category.getImageUrl()));
    }
}
