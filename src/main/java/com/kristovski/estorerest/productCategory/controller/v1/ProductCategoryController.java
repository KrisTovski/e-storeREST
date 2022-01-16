package com.kristovski.estorerest.productCategory.controller.v1;

import com.kristovski.estorerest.productCategory.ProductCategoryServiceImpl;
import com.kristovski.estorerest.productCategory.dto.ProductCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static com.kristovski.estorerest.productCategory.mapper.ProductCategoryDtoMapper.getProductCategoryDto;

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
    public Page<ProductCategoryDto> getAll(Pageable page) {
        return getProductCategoryDto(productCategoryService.getAll(page));
    }

}
