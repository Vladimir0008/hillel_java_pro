import com.hillel.homeWork.lesson15.practicum.RomanNumberConverter;
import org.junit.Assert;
import org.junit.Test;

public class RomanNumberConverterTest {

    @Test
    public void testConvertOneDigitOne() {
        RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
        Assert.assertEquals(1, romanNumberConverter.convert("I"));
    }

    @Test
    public void testConvertOneDigitFive() {
        RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
        Assert.assertEquals(5, romanNumberConverter.convert("V"));
    }

    @Test
    public void testConvertOneDigitTen() {
        RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
        Assert.assertEquals(10, romanNumberConverter.convert("X"));
    }

    @Test
    public void testConvertOneDigitHundred() {
        RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
        Assert.assertEquals(100, romanNumberConverter.convert("C"));
    }

    @Test
    public void testConvertOneDigitFiveHundreds() {
        RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
        Assert.assertEquals(500, romanNumberConverter.convert("D"));
    }

    @Test
    public void testConvertOneDigitThousand() {
        RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
        Assert.assertEquals(1000, romanNumberConverter.convert("M"));
    }

    @Test
    public void testConvertSeveralSimpleDigit() {
        RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
        Assert.assertEquals(16, romanNumberConverter.convert("XVI"));
    }

    @Test
    public void testConvertSeveralDigitWithFour() {
        RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
        Assert.assertEquals(14, romanNumberConverter.convert("XIV"));
    }

    @Test
    public void testConvertSeveralDigitWithThree() {
        RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
        Assert.assertEquals(58, romanNumberConverter.convert("LVIII"));
    }

    @Test
    public void testConvertSeveralHardDigit() {
        RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
        Assert.assertEquals(1994, romanNumberConverter.convert("MCMXCIV"));
    }
}
