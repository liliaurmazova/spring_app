package com.unitTests;

/**
 * Created by lurmazova on 25.06.17.
 */
public class TestSuiteRun {

    public static void main(String args[]) {
      CalculationTests calculationTests = new CalculationTests();
        calculationTests.testAvgNameLength();
        calculationTests.testMaxValue();
        calculationTests.testMaxValue();
        calculationTests.testMinDate();
        calculationTests.testMaxDate();
    }
}
