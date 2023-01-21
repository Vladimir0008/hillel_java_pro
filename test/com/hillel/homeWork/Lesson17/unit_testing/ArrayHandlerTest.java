package com.hillel.homeWork.Lesson17.unit_testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayHandlerTest {

    @Test
    void testOneFourArrayCheckerSimpleWithOneFourArray() {
        int[] arr5 = new int[]{1, 4};
        Assertions.assertEquals(true, ArrayHandler.oneFourArrayChecker(arr5));
    }

    @Test
    void testOneFourArrayCheckerSimpleWithOneFourArrayReverse() {
        int[] arr5 = new int[]{4, 1};
        Assertions.assertEquals(true, ArrayHandler.oneFourArrayChecker(arr5));
    }

    @Test
    void testOneFourArrayCheckerWithOtherFigure() {
        int[] arr5 = new int[]{4, 3, 1};
        Assertions.assertEquals(false, ArrayHandler.oneFourArrayChecker(arr5));
    }

    @Test
    void testOneFourArrayCheckerWithOnlyOne() {
        int[] arr5 = new int[]{1, 1, 1};
        Assertions.assertEquals(false, ArrayHandler.oneFourArrayChecker(arr5));
    }

    @Test
    void testOneFourArrayCheckerWithOnlyFour() {
        int[] arr5 = new int[]{4, 4, 4};
        Assertions.assertEquals(false, ArrayHandler.oneFourArrayChecker(arr5));
    }
}