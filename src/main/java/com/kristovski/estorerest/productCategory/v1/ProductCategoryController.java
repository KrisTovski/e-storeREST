package com.kristovski.estorerest.productCategory.v1;

import com.kristovski.estorerest.productCategory.ProductCategory;
import com.kristovski.estorerest.productCategory.ProductCategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(ProductCategoryController.BASE_URL)
public class ProductCategoryController {

    public static final String BASE_URL = "/api/v1/categories";

    private final ProductCategoryServiceImpl productCategoryService;

    @Autowired
    public ProductCategoryController(ProductCategoryServiceImpl productCategoryService) {
        this.productCategoryService = productCategoryService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<ProductCategory> getAll(Pageable page) {
        return productCategoryService.getAll(page);
    }
}
