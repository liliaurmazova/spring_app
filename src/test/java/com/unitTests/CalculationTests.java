package com.unitTests;

import com.utils.Calculations;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class CalculationTests {

    Calculations calculations = new Calculations();

    @Test
    public void testAvgNameLength() {
        int avgLength = calculations.getAverageNameLength();
        Assert.assertTrue(avgLength == 13, "AvgNameLength is not equal to 13");
    }

    @Test
    public void testMinValue() {
      int minValue = calculations.getMinValue();
      Assert.assertTrue(minValue == 1, "minValue is not 1");
    }

    @Test
    public void testMaxValue() {
        int maxValue = calculations.getMaxValue();
        Assert.assertTrue(maxValue == 1000, "maxValue is not 1000");
    }

    @Test
    public void testMinDate() {
        String minDate = calculations.getMinDate().toString();
        Assert.assertTrue(minDate.indexOf("Jan 31") != -1);
        Assert.assertTrue(minDate.indexOf("2010") != -1);
    }

    @Test
    public void testMaxDate() {
        String maxDate = calculations.getMaxDate().toString();
        Assert.assertTrue(maxDate.indexOf("Jan 31") != -1);
        Assert.assertTrue(maxDate.indexOf("2012") != -1);
    }

}
