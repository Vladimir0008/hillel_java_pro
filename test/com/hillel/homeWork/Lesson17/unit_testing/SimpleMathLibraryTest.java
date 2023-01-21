package com.hillel.homeWork.Lesson17.unit_testing;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SimpleMathLibraryTest {

    @Test
    public void addTestSimple() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(5, simpleMathLibrary.add(2, 3));
        if(simpleMathLibrary.add(2, 3) == 5){
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }

    @Test
    public void addTestSimpleReverse() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(5, simpleMathLibrary.add(3, 2));
        if(simpleMathLibrary.add(3, 2) == 5){
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }

    @Test
    public void addTestNegativeValues() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(-5, simpleMathLibrary.add(-3, -2));
        if(simpleMathLibrary.add(-3, -2) == -5){
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }

    @Test
    public void addTestZeroValues() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(0, simpleMathLibrary.add(0, 0));
        if(simpleMathLibrary.add(0, 0) == 0){
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }

    @Test
    public void addTestPositiveValueAndZero() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(1, simpleMathLibrary.add(1, 0));
        if(simpleMathLibrary.add(1, 0) == 1){
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }

    @Test
    public void minusSimple() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(3, simpleMathLibrary.minus(5,2));
        if(simpleMathLibrary.minus(5,2) == 3){
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }

    @Test
    public void minusSimpleReverse() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(-3, simpleMathLibrary.minus(2,5));
        if(simpleMathLibrary.minus(2,5) == -3){
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }

    @Test
    public void minusNegativeValues() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(3, simpleMathLibrary.minus(-2,-5));
        if(simpleMathLibrary.minus(-2,-5) == 3){
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }

    @Test
    public void minusTheSameValues() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(0, simpleMathLibrary.minus(2,2));
        if(simpleMathLibrary.minus(2,2) == 0){
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }

    @Test
    public void minusPositiveAndNegativeValues() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(4, simpleMathLibrary.minus(2,-2));
        if(simpleMathLibrary.minus(2,-2) == 4){
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }

    @Test
    public void minusNegativeAndPositiveValues() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        Assertions.assertEquals(-4, simpleMathLibrary.minus(-2,2));
        if(simpleMathLibrary.minus(-2,2) == -4){
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }
}