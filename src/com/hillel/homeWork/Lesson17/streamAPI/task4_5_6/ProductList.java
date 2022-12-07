package com.hillel.homeWork.Lesson17.streamAPI.task4_5_6;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.hillel.homeWork.Lesson17.streamAPI.task4_5_6.ProductType.BOOK;
import static java.util.stream.Collectors.groupingBy;

public class ProductList {
    private List<Product> productList;

    public ProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getThreeLastAddedProduct() {
        return productList.stream().sorted(Comparator.comparing(Product::getDateTime).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Product> getListBooksAddedInCurrentYearWithPriceLess75Dollars() {
        return productList.stream()
                .filter(product -> product.getPrice().compareTo(new BigDecimal(75)) <= 0 &&
                        product.getType().equals(BOOK) && product.getDateTime().getYear() == LocalDateTime.now().getYear())
                .collect(Collectors.toList());
    }

    public Map<ProductType, List<Product>> getMapProductsWithTypeKey() {
        return productList.stream().collect(groupingBy(Product::getType));
    }

    public List<Product> getProductList() {
        return productList;
    }
}

