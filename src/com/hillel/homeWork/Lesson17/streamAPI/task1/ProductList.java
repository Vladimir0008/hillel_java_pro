package com.hillel.homeWork.Lesson17.streamAPI.task1;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import static com.hillel.homeWork.Lesson17.streamAPI.task1.ProductType.BOOK;

public class ProductList {
    private List<Product> productList;

    public ProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getBooksWithPriceOver250Dollars() {
        return productList.stream()
                .filter(product -> product.getPrice().compareTo(new BigDecimal(250)) > 0 &&
                        product.getType().equals(BOOK))
                .collect(Collectors.toList());
    }

    public List<Product> getProductList() {
        return productList;
    }
}
