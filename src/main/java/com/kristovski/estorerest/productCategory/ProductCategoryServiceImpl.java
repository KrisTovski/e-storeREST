package com.kristovski.estorerest.productCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{

    private final ProductCategoryRepository productCategoryRepository;

    @Autowired
    public ProductCategoryServiceImpl(ProductCategoryRepository productCategoryRepository) {
        this.productCategoryRepository = productCategoryRepository;
    }
    @Override
    public Page<ProductCategory> getAll(Pageable page) {
        return productCategoryRepository.findAll(page);
    }
}
