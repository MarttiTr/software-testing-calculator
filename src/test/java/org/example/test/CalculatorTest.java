package org.example.test;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;
    private static float[] testArray;


    @BeforeAll      // This method will be called before all the methods below
    public static void setuoGlobal () {
        System.out.println("Starting calculator tests...");
        testArray = new float[]{3, 45, 6.7f, 12, 4.2f, 8.9f};
    }

    @BeforeEach    // This method is called before the start of run of EACH test
    public void setupEach() {
        calculator = new Calculator();
    }

    @AfterEach      // This method is called after the run of EACH test
    public void finalSetupEach() {
        System.out.println("This test is finished running!");
    }

    @AfterAll
    public static void finalSetupGlobal() {
        System.out.println("Calculator tests are finished succesfully!");
    }

    @Test
    public void shouldReturnSumWhenAddArrayIsCalled() {
        float[] array = testArray;

        float result = calculator.addArray(array);

        Assertions.assertEquals(79.799995f,result);
    }

    @Test
    public void shouldReturnDividedSumWhenDivideArrayIsCalled() {
        float[] array = testArray;

        float result = calculator.divideArray(array);

        Assertions.assertEquals(2.218265E-5f,result);
    }

    @Test
    @Disabled
    public void shouldReturnMultipliedSumWhenMultiplyArrayIsCalled() {
        float[] array = testArray;

        float result = calculator.multiplyArray(array);

        Assertions.assertAll(() -> Assertions.assertTrue(result > 0));


    }
}