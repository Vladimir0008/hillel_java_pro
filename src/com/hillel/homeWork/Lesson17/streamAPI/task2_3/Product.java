package com.hillel.homeWork.Lesson17.streamAPI.task2_3;

import com.hillel.homeWork.Lesson17.streamAPI.task1.ProductType;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product extends com.hillel.homeWork.Lesson17.streamAPI.task1.Product {
    private boolean isDiscountAbility;

    public Product(ProductType type, BigDecimal price, boolean isDiscountAbility) {
        super(type,price);
        this.isDiscountAbility = isDiscountAbility;
    }

    public ProductType getType() {
        return super.getType();
    }

    public void setType(ProductType type) {
        super.setType(type);
    }

    public BigDecimal getPrice() {
        return super.getPrice();
    }

    public void setPrice(BigDecimal price) {
        super.setPrice(price);
    }

    public boolean isDiscountAbility() {
        return isDiscountAbility;
    }

    public void setDiscountAbility(boolean discountAbility) {
        isDiscountAbility = discountAbility;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type=" + super.getType() +
                ", price=" + super.getPrice().setScale(2, RoundingMode.FLOOR)+
                ", isDiscountAbility" + isDiscountAbility +
                '}';
    }

}
