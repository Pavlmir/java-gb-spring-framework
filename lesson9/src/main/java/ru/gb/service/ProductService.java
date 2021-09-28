package ru.gb.service;

import ru.gb.controller.ProductListParam;
import ru.gb.persist.Product;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Page<Product> findWithFilter(ProductListParam productListParam);

    Optional<Product> findById(Long id);

    void save(Product product);

    void deleteById(Long id);

    List<Product> findAll();

}