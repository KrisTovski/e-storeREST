package com.kristovski.estorerest.productCategory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductCategoryService {

    Page<ProductCategory> getAll(Pageable page);
}
