package org.adventofcode2023.one;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringNumbersTest {

    @Test
    public void shouldSwapStringNumbersWithDigits() {
//        Given
        ArrayList<String> calibratedValuesTest = new ArrayList<>();
        calibratedValuesTest.add("9sixseventwonez3");
        calibratedValuesTest.add("seven1cvdvnhpgthfhfljmnq");
        calibratedValuesTest.add("6tvxlgrsevenjvbxbfqrsk4seven");
//        When
        StringNumbers sn = new StringNumbers();
        ArrayList<String> convertedCalibratedValuesTest = sn.convertStringToNumber(calibratedValuesTest);
//        Then
        assertEquals(convertedCalibratedValuesTest.get(0), "96721z3");
//        assertEquals(convertedCalibratedValuesTest.get(1), "71cvdvnhpgthfhfljmnq");
    }
}
