package ru.gb.persist;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class ProductDto {

    private Long id;
    private String title;
    private BigDecimal price;

}