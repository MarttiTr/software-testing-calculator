package org.example.test;

import org.assertj.core.api.Assertions;
import org.example.calculator.Calculator;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * AssertJ examples
 * @author Martti Triksberg
 */

public class AssertJExamples {

    @Test
    public void testString() {
        final String str = "Estonia is a silicon valley of Europe!";
        final String expected = "Estonia is a silicon valley of Europe!";

        Assertions.assertThat(str).isEqualTo(expected);
    }

    @Test
    public void testIntegerList() {
        List<Integer> numList = List.of(1, 5, 8, 23, 100);

        Assertions.assertThat(numList).hasSize(5)
                .contains(23);
    }

    @Test
    public void testString2() {
        final String testString = "Stranger things is an awesome Netflix drama!";

        Assertions.assertThat(testString).endsWith("drama!")
                .doesNotStartWith("Estonia")
                .isNotBlank()
                .isMixedCase()
                .contains(" ");
    }

    @Test
    public void testFloatList() {
        List<Float> floatList = List.of(2.3f, 5.7f, 6.8f, 2.45f, 5.98f, 90.34f, 100.23f);

        Assertions.assertThat(floatList).hasSize(7)
                .contains(6.8f)
                .doesNotHaveDuplicates()
                .hasSizeBetween(1,200)
                .containsExactlyInAnyOrder(2.3f, 5.7f, 6.8f, 2.45f, 5.98f, 90.34f, 100.23f)
                .startsWith(2.3f);

    }
    @Test
    public void shouldReturnMultipliedAnswer() {
        Calculator calculator = new Calculator();

        float[] array = {1, 3, 5, 7};
        calculator.multiplyArray(array)
                Assertions.
    }
}
