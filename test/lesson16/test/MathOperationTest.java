package lesson16.test;

import com.hillel.homeWork.lesson16.practicum.ItemSource;
import com.hillel.homeWork.lesson16.practicum.MathOperation;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MathOperationTest {
    ItemSource mockAWSItemSource = new MockAWSItemSource(new ArrayList<>());
    MathOperation mathOperation = new MathOperation(mockAWSItemSource);

    @Test
    public void testSumNormalOrder() {
        mockAWSItemSource.getItems().add(1);
        mockAWSItemSource.getItems().add(2);
        mockAWSItemSource.getItems().add(3);
        Assert.assertEquals(6, mathOperation.sum());
    }

    @Test
    public void testSumReverseOrder() {
        mockAWSItemSource.getItems().add(3);
        mockAWSItemSource.getItems().add(2);
        mockAWSItemSource.getItems().add(1);
        Assert.assertEquals(6, mathOperation.sum());
    }

    @Test
    public void testSumTwoValues() {
        mockAWSItemSource.getItems().add(1);
        mockAWSItemSource.getItems().add(2);
        Assert.assertEquals(3, mathOperation.sum());
    }

    @Test
    public void testSumTwoValuesReverse() {
        mockAWSItemSource.getItems().add(2);
        mockAWSItemSource.getItems().add(1);
        Assert.assertEquals(3, mathOperation.sum());
    }

    @Test
    public void testAvgNormalOrder() {
        mockAWSItemSource.getItems().add(5);
        mockAWSItemSource.getItems().add(7);
        mockAWSItemSource.getItems().add(17);
        Assert.assertEquals(9, mathOperation.avg());
    }

    @Test
    public void testAvgMixedOrder() {
        mockAWSItemSource.getItems().add(17);
        mockAWSItemSource.getItems().add(5);
        mockAWSItemSource.getItems().add(7);
        Assert.assertEquals(9, mathOperation.avg());
    }

    @Test
    public void testMaxMixedOrder() {
        mockAWSItemSource.getItems().add(170);
        mockAWSItemSource.getItems().add(357);
        mockAWSItemSource.getItems().add(7);
        Assert.assertEquals(357, mathOperation.max());
    }

    @Test
    public void testMaxPositiveValues() {
        mockAWSItemSource.getItems().add(100);
        mockAWSItemSource.getItems().add(500);
        mockAWSItemSource.getItems().add(700);
        Assert.assertEquals( 700, mathOperation.max());
    }

    @Test
    public void testMaxDifferentSignOrder() {
        mockAWSItemSource.getItems().add(-100);
        mockAWSItemSource.getItems().add(0);
        mockAWSItemSource.getItems().add(700);
        Assert.assertEquals( 700, mathOperation.max());
    }

    @Test
    public void testMaxNegativeValues() {
        mockAWSItemSource.getItems().add(-100);
        mockAWSItemSource.getItems().add(-500);
        mockAWSItemSource.getItems().add(-700);
        Assert.assertEquals(-100, mathOperation.max());
    }
}
