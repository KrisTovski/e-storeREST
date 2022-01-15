package com.kristovski.estorerest.productCategory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductCategoryServiceImplTest {

    @InjectMocks
    ProductCategoryServiceImpl categoryService;

    @Mock
    ProductCategoryRepository repository;

    public void setUp(){
        categoryService = new ProductCategoryServiceImpl(repository);
    }


    @Test
    public void getAllCategories() {
        // given
        int pageNumber = 0;
        int pageSize = 1;
        Pageable pageable = PageRequest.of(pageNumber,pageSize);
        ProductCategory category = new ProductCategory();
        PageImpl<ProductCategory> categoryPage = new PageImpl<>(Collections.singletonList(category));
        when(repository.findAll(pageable)).thenReturn(categoryPage);
        // when
        Page<ProductCategory> categories = categoryService.getAll(pageable);
        // then
        assertThat(categories).isNotNull();
        assertThat(categories.getTotalPages()).isEqualTo(1);
    }


}