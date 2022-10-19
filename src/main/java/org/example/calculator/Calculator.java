package org.example.calculator;

public class Calculator {
    public float addArray(float[] inputArray) {

        float result = 0;
        for (float input: inputArray) {
            result += input;
        }

        return result;
    }

    public float divideArray(float[] inputArray) {

        float result = inputArray[0];

        for(int i = 1; i < inputArray.length; i++) {
            result /= inputArray[i];
        }

        return result;
    }

    public float multiplyArray(float[] inputArray) {

        float result = inputArray[0];

        for(int i = 1; i < inputArray.length; i++) {
            result *= inputArray[i];
        }
        return result;
    }
}
