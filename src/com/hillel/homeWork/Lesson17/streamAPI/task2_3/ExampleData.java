package com.hillel.homeWork.Lesson17.streamAPI.task2_3;

import com.hillel.homeWork.Lesson17.streamAPI.task1.ProductType;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static com.hillel.homeWork.Lesson17.streamAPI.task1.ProductType.*;

public class ExampleData {
    private static final List<Product> PRODUCTS = Arrays.asList(
            new Product(ELECTRONIC, new BigDecimal(500),true),
            new Product(BOOK, new BigDecimal(300),true),
            new Product(CHEMICAL, new BigDecimal(100),true),
            new Product(FOOD, new BigDecimal(5),true),
            new Product(BOOK, new BigDecimal(249.99),true),
            new Product(BOOK, new BigDecimal(350),true),
            new Product(ELECTRONIC, new BigDecimal(499),false),
            new Product(CHEMICAL, new BigDecimal(100.01),false),
            new Product(ProductType.FOOD, new BigDecimal(5.99),false),
            new Product(BOOK, new BigDecimal(259.99),false)
    );

    public static List<Product> getProducts() {
        return PRODUCTS;
    }
}
