package com.hillel.homeWork.Lesson17.streamAPI.task1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    private ProductType type;
    private BigDecimal price;

    public Product(ProductType type, BigDecimal price) {
        this.type = type;
        this.price = price;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type=" + type +
                ", price=" + price.setScale(2, RoundingMode.FLOOR)+
                '}';
    }
}
