package com.kristovski.estorerest.config;

import com.kristovski.estorerest.product.Product;
import com.kristovski.estorerest.product.ProductCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};

        // disable HTTP methods PUT POST, DELETE for Product
        disableHTTPMethods(config, theUnsupportedActions, Product.class);

        // disable HTTP methods PUT POST, DELETE for ProductCategory
        disableHTTPMethods(config, theUnsupportedActions, ProductCategory.class);
    }

    private void disableHTTPMethods(RepositoryRestConfiguration config,
                                    HttpMethod[] theUnsupportedActions,
                                    Class<?> categoryClass) {
        config.getExposureConfiguration()
                .forDomainType(categoryClass)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
    }
}
