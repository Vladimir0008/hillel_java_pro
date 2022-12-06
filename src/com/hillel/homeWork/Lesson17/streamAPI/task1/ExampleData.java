package com.hillel.homeWork.Lesson17.streamAPI.task1;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static com.hillel.homeWork.Lesson17.streamAPI.task1.ProductType.*;

public class ExampleData {
    private static final List<Product> PRODUCTS = Arrays.asList(
            new Product(BOOK, new BigDecimal(300)),
            new Product(ELECTRONIC, new BigDecimal(500)),
            new Product(CHEMICAL, new BigDecimal(100)),
            new Product(FOOD, new BigDecimal(5)),
            new Product(BOOK, new BigDecimal(249.99)),
            new Product(BOOK, new BigDecimal(350)),
            new Product(ELECTRONIC, new BigDecimal(499)),
            new Product(CHEMICAL, new BigDecimal(100.01)),
            new Product(ProductType.FOOD, new BigDecimal(5.99)),
            new Product(BOOK, new BigDecimal(259.99))
    );

    public static List<Product> getProducts() {
        return PRODUCTS;
    }
}
