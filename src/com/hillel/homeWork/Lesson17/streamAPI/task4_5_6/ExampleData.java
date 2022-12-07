package com.hillel.homeWork.Lesson17.streamAPI.task4_5_6;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static com.hillel.homeWork.Lesson17.streamAPI.task4_5_6.ProductType.*;

public class ExampleData {
    private static final List<Product> PRODUCTS = Arrays.asList(
            new Product(1, ELECTRONIC, new BigDecimal(500), true, LocalDateTime.of(1995, 1, 14, 13, 15)),
            new Product(2, BOOK, new BigDecimal(75), true, LocalDateTime.of(1996, 1, 14, 13, 15)),
            new Product(3, BOOK, new BigDecimal(65.99), false, LocalDateTime.of(2022, 1, 14, 13, 15)),
            new Product(4, BOOK, new BigDecimal(75.01), true, LocalDateTime.of(2022, 1, 14, 13, 15)),
            new Product(5, CHEMICAL, new BigDecimal(100), true, LocalDateTime.of(1995, 1, 14, 13, 15)),
            new Product(6, FOOD, new BigDecimal(5), true, LocalDateTime.of(1995, 1, 14, 13, 15)),
            new Product(7, BOOK, new BigDecimal(249.99), true, LocalDateTime.of(1995, 1, 14, 13, 15)),
            new Product(8, BOOK, new BigDecimal(350), true, LocalDateTime.of(1995, 1, 14, 13, 15)),
            new Product(9, ELECTRONIC, new BigDecimal(499), false, LocalDateTime.of(2023, 1, 14, 13, 15)),
            new Product(10, CHEMICAL, new BigDecimal(100.01), false, LocalDateTime.of(1995, 1, 14, 13, 15)),
            new Product(11, FOOD, new BigDecimal(5.99), false, LocalDateTime.of(1995, 1, 14, 13, 15)),
            new Product(12, BOOK, new BigDecimal(299.99), false, LocalDateTime.of(1995, 1, 14, 13, 15)),
            new Product(13, ELECTRONIC, new BigDecimal(590), true, LocalDateTime.of(1995, 1, 14, 13, 15)),
            new Product(14, BOOK, new BigDecimal(390), true, LocalDateTime.of(1995, 1, 14, 13, 15)),
            new Product(15, CHEMICAL, new BigDecimal(190), true, LocalDateTime.of(1995, 1, 14, 13, 15)),
            new Product(16, FOOD, new BigDecimal(9), true, LocalDateTime.of(1995, 1, 14, 13, 15)),
            new Product(17, BOOK, new BigDecimal(299.99), true, LocalDateTime.of(2022, 1, 14, 13, 15)),
            new Product(18, BOOK, new BigDecimal(5), true, LocalDateTime.of(2022, 1, 14, 13, 15)),
            new Product(19, ELECTRONIC, new BigDecimal(489), false, LocalDateTime.of(1995, 1, 14, 13, 15)),
            new Product(20, CHEMICAL, new BigDecimal(109.01), false, LocalDateTime.of(1995, 1, 14, 13, 15)),
            new Product(21, FOOD, new BigDecimal(8.99), false, LocalDateTime.of(2023, 1, 14, 13, 15)),
            new Product(22, BOOK, new BigDecimal(75.00), true, LocalDateTime.of(2022, 1, 14, 13, 15))
    );

    public static List<Product> getProducts() {
        return PRODUCTS;
    }
}
