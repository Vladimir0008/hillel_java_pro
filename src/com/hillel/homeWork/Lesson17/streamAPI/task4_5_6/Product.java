package com.hillel.homeWork.Lesson17.streamAPI.task4_5_6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

public class Product {
    private long id;
    private ProductType type;
    private BigDecimal price;
    private boolean isDiscountAbility;
    private LocalDateTime dateTime;


    public Product(ProductType type, BigDecimal price, boolean isDiscountAbility) {
        this.type = type;
        this.price = price;
        this.isDiscountAbility = isDiscountAbility;
        this.dateTime = LocalDateTime.now();
    }

    public Product(ProductType type, BigDecimal price, boolean isDiscountAbility, LocalDateTime dateTime) {
        this.type = type;
        this.price = price;
        this.isDiscountAbility = isDiscountAbility;
        this.dateTime = dateTime;
    }

    public Product(long id, ProductType type, BigDecimal price, boolean isDiscountAbility, LocalDateTime dateTime) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.isDiscountAbility = isDiscountAbility;
        this.dateTime = dateTime;
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

    public boolean isDiscountAbility() {
        return isDiscountAbility;
    }

    public void setDiscountAbility(boolean discountAbility) {
        isDiscountAbility = discountAbility;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Product { " +
                "type=" + type +
                ", price=" + price.setScale(2, RoundingMode.FLOOR)+
                ", isDiscountAbility=" + isDiscountAbility +
                ", dateTime=" + dateTime +
                " }";
    }
}
