package com.hillel.homeWork.Lesson17.streamAPI.task2_3;


public class Main {
    public static void main(String[] args) {
        ProductList productList = new ProductList(ExampleData.getProducts());
        System.out.println(productList.getBooksWithDiscount());
        System.out.println(productList.getTheCheapestBook());
    }
}
