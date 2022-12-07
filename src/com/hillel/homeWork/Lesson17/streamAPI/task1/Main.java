package com.hillel.homeWork.Lesson17.streamAPI.task1;


public class Main {
    public static void main(String[] args) {
        ProductList productList = new ProductList(ExampleData.getProducts());
        System.out.println(productList.getBooksWithPriceOver250Dollars());
    }
}
