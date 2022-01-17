package com.kristovski.estorerest.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {

    Page<Product> getAll(Pageable page);

    Page<Product> getAllByCategoryId(Long id, Pageable page);

}
