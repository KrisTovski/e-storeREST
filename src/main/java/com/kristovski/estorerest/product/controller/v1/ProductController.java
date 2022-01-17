package com.kristovski.estorerest.product.controller.v1;

import com.kristovski.estorerest.product.ProductServiceImpl;
import com.kristovski.estorerest.product.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.kristovski.estorerest.product.mapper.ProductDtoMapper.getProductDto;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(ProductController.BASE_URL)
public class ProductController {

    public static final String BASE_URL = "/api/v1/products";

    private final ProductServiceImpl productService;

    @Autowired
    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping
    public Page<ProductDto> getAll(Pageable page){
        return getProductDto(productService.getAll(page));
    }
}
