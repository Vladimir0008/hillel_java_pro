package com.hillel.homeWork.Lesson17.streamAPI.task4_5_6;


public class Main {
    public static void main(String[] args) {
        ProductList productList = new ProductList(ExampleData.getProducts());
       // System.out.println(productList.getThreeLastAddedProduct());
       // System.out.println(productList.getListBooksAddedInCurrentYearWithPriceLess75Dollars());
        // System.out.println(productList.getMapProductsWithTypeKey());
        productList.getMapProductsWithTypeKey().forEach((productType, products) -> {
            System.out.println(productType);
            products.forEach(System.out::println);
        });

    }
}
