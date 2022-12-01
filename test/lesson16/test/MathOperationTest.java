package lesson16.test;

import com.hillel.homeWork.lesson16.practicum.ItemSource;
import com.hillel.homeWork.lesson16.practicum.MathOperation;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MathOperationTest {

    @Test
    public void testSumNormalOrder() {
        ItemSource mockAWSItemSource = mock(ItemSource.class);
        when(mockAWSItemSource.getItems()).thenReturn(Arrays.asList(1,2,3));
        MathOperation mathOperation = new MathOperation(mockAWSItemSource);
        Assert.assertEquals(6, mathOperation.sum());
    }

    @Test
    public void testSumReverseOrder() {
        ItemSource mockAWSItemSource = mock(ItemSource.class);
        when(mockAWSItemSource.getItems()).thenReturn(Arrays.asList(3,2,1));
        MathOperation mathOperation = new MathOperation(mockAWSItemSource);
        Assert.assertEquals(6, mathOperation.sum());
    }

    @Test
    public void testSumTwoValues() {
        ItemSource mockAWSItemSource = mock(ItemSource.class);
        when(mockAWSItemSource.getItems()).thenReturn(Arrays.asList(1,2));
        MathOperation mathOperation = new MathOperation(mockAWSItemSource);
        Assert.assertEquals(3, mathOperation.sum());
    }

    @Test
    public void testSumTwoValuesReverse() {
        ItemSource mockAWSItemSource = mock(ItemSource.class);
        when(mockAWSItemSource.getItems()).thenReturn(Arrays.asList(2,1));
        MathOperation mathOperation = new MathOperation(mockAWSItemSource);
        Assert.assertEquals(3, mathOperation.sum());
    }

    @Test
    public void testAvgNormalOrder() {
        ItemSource mockAWSItemSource = mock(ItemSource.class);
        when(mockAWSItemSource.getItems()).thenReturn(Arrays.asList(8,9,10));
        MathOperation mathOperation = new MathOperation(mockAWSItemSource);
        Assert.assertEquals(9, mathOperation.avg());
    }

    @Test
    public void testAvgMixedOrder() {
        ItemSource mockAWSItemSource = mock(ItemSource.class);
        when(mockAWSItemSource.getItems()).thenReturn(Arrays.asList(10,8,9));
        MathOperation mathOperation = new MathOperation(mockAWSItemSource);
        Assert.assertEquals(9, mathOperation.avg());
    }

    @Test
    public void testMaxMixedOrder() {
        ItemSource mockAWSItemSource = mock(ItemSource.class);
        when(mockAWSItemSource.getItems()).thenReturn(Arrays.asList(3,357,1));
        MathOperation mathOperation = new MathOperation(mockAWSItemSource);
        Assert.assertEquals(357, mathOperation.max());
    }

    @Test
    public void testMaxPositiveValues() {
        ItemSource mockAWSItemSource = mock(ItemSource.class);
        when(mockAWSItemSource.getItems()).thenReturn(Arrays.asList(100,200,700));
        MathOperation mathOperation = new MathOperation(mockAWSItemSource);
        Assert.assertEquals( 700, mathOperation.max());
    }

    @Test
    public void testMaxDifferentSignOrder() {
        ItemSource mockAWSItemSource = mock(ItemSource.class);
        when(mockAWSItemSource.getItems()).thenReturn(Arrays.asList(700,-233,-157));
        MathOperation mathOperation = new MathOperation(mockAWSItemSource);
        Assert.assertEquals( 700, mathOperation.max());
    }

    @Test
    public void testMaxNegativeValues() {
        ItemSource mockAWSItemSource = mock(ItemSource.class);
        when(mockAWSItemSource.getItems()).thenReturn(Arrays.asList(-300,-256,-100));
        MathOperation mathOperation = new MathOperation(mockAWSItemSource);
        Assert.assertEquals(-100, mathOperation.max());
    }
}
