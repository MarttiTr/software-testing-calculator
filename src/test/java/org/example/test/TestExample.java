package org.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExample {  //Class name should say what this test is about, also method should say what test are you doing. If testing calculator
                            //Then should use : TestCalculator
    @Test
    public void shouldReturnCorrectAddedNumbers() {
        //given
        final int a = 8;
        final int b = 55;

        //when
        final int addResult = a + b;

        //then
        Assertions.assertEquals(63, addResult);
    }
}
