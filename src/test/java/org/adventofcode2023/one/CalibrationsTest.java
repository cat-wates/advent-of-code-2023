package org.adventofcode2023.one;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalibrationsTest {

    @Test
    public void shouldFindFirstAndLastDigitWhenStringLengthGreaterThanTwo() {
//        Given
        ArrayList<String> cVTest = new ArrayList<>();
        cVTest.add("1237");
        Calibrations calibrations = new Calibrations(cVTest);
        calibrations.setDigitList();
//        When
        ArrayList<Integer> finalDigitList = calibrations.findCorrectDigits();
//        Then
        assertEquals(finalDigitList.size(), 1);
        assertEquals(finalDigitList.get(0), 17);
    }
}

