package ru.netology.services;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalcTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/calc.csv")
    public void test(int expected, int income, int expenses, int threshold) {
        CalcService service = new CalcService();
        int actual = service.calculate(income, expenses, threshold);
        Assert.assertEquals(expected, actual);
    }
}
