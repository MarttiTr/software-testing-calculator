package org.example.test;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void shouldReturnSumWhenAddArrayIsCalled() {
        float[] array = {3, 45, 6.7f, 12, 4.2f, 8.9f};

        Calculator calculator = new Calculator();
        float result = calculator.addArray(array);

        Assertions.assertEquals(79.799995f,result);
    }

    @Test
    public void shouldReturnDividedSumWhenDivideArrayIsCalled() {
        float[] array = {25, 5, 2};

        Calculator calculator = new Calculator();
        float result = calculator.divideArray(array);

        Assertions.assertEquals(2.5f,result);
    }

    @Test
    public void shouldReturnMultipliedSumWhenMultiplyArrayIsCalled() {
        float[] array = {2, 2, 4, 1, 5, 2};

        Calculator calculator = new Calculator();
        float result = calculator.multiplyArray(array);

        Assertions.assertEquals(160,result);
    }
}