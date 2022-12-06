package com.hillel.homeWork.Lesson17.streamAPI.task2_3;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.hillel.homeWork.Lesson17.streamAPI.task1.ProductType.BOOK;

public class ProductList {
    private List<Product> productList;

    public ProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getBooksWithDiscount() {
        return productList.stream().filter(product -> product.getType().equals(BOOK) && product.isDiscountAbility())
                .map(product -> {
                    product.setPrice(product.getPrice().multiply(new BigDecimal(0.9)));
                    return product;
                })
                .collect(Collectors.toList());
    }


    public Product getTheCheapestBook() {
        return productList.stream().filter(product -> product.getType().equals(BOOK))
                .min(Comparator.comparing(Product::getPrice)).orElseThrow();
    }


    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "productList=" + productList +
                '}';
    }
}