package org.adventofcode2023.one;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldReturnSumOfArrayIntegers() {
//        Given
        ArrayList<Integer> digitList = new ArrayList<>();
        digitList.add(11);
        digitList.add(12);
        digitList.add(13);
//        When
        Calculator calc = new Calculator();
        int total = calc.calculateTotal(digitList);
//        Then
        assertEquals(total, 36);
    }
}
