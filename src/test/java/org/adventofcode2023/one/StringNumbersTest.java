package org.adventofcode2023.one;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.assertj.core.api.Assertions.*;

public class StringNumbersTest {

    @Test
    public void shouldPadOne() {
//        Given
        ArrayList<String> calibratedValuesTest = new ArrayList<>();
        calibratedValuesTest.add("one");
//        When
        StringNumbers sn = new StringNumbers();
        ArrayList<String> paddedCalibrationValues = sn.addPaddingToStringNumbers(calibratedValuesTest);
//        Then
        assertThat(paddedCalibrationValues).containsExactly("oonee");
    }

    @Test
    public void shouldPadTwo() {
//        Given
        ArrayList<String> calibratedValuesTest = new ArrayList<>();
        calibratedValuesTest.add("two");
//        When
        StringNumbers sn = new StringNumbers();
        ArrayList<String> paddedCalibrationValues = sn.addPaddingToStringNumbers(calibratedValuesTest);
//        Then
        assertThat(paddedCalibrationValues).containsExactly("ttwoo");
    }

    @Test
    public void shouldPadThree() {
//        Given
        ArrayList<String> calibratedValuesTest = new ArrayList<>();
        calibratedValuesTest.add("three");
//        When
        StringNumbers sn = new StringNumbers();
        ArrayList<String> paddedCalibrationValues = sn.addPaddingToStringNumbers(calibratedValuesTest);
//        Then
        assertThat(paddedCalibrationValues).containsExactly("tthreee");
    }

    @Test
    public void shouldPadFour() {
//        Given
        ArrayList<String> calibratedValuesTest = new ArrayList<>();
        calibratedValuesTest.add("four");
//        When
        StringNumbers sn = new StringNumbers();
        ArrayList<String> paddedCalibrationValues = sn.addPaddingToStringNumbers(calibratedValuesTest);
//        Then
        assertThat(paddedCalibrationValues).containsExactly("ffourr");
    }

    @Test
    public void shouldPadFive() {
//        Given
        ArrayList<String> calibratedValuesTest = new ArrayList<>();
        calibratedValuesTest.add("five");
//        When
        StringNumbers sn = new StringNumbers();
        ArrayList<String> paddedCalibrationValues = sn.addPaddingToStringNumbers(calibratedValuesTest);
//        Then
        assertThat(paddedCalibrationValues).containsExactly("ffivee");
    }

    @Test
    public void shouldPadSix() {
//        Given
        ArrayList<String> calibratedValuesTest = new ArrayList<>();
        calibratedValuesTest.add("six");
//        When
        StringNumbers sn = new StringNumbers();
        ArrayList<String> paddedCalibrationValues = sn.addPaddingToStringNumbers(calibratedValuesTest);
//        Then
        assertThat(paddedCalibrationValues).containsExactly("ssixx");
    }

    @Test
    public void shouldPadSeven() {
//        Given
        ArrayList<String> calibratedValuesTest = new ArrayList<>();
        calibratedValuesTest.add("seven");
//        When
        StringNumbers sn = new StringNumbers();
        ArrayList<String> paddedCalibrationValues = sn.addPaddingToStringNumbers(calibratedValuesTest);
//        Then
        assertThat(paddedCalibrationValues).containsExactly("ssevenn");
    }

    @Test
    public void shouldPadEight() {
//        Given
        ArrayList<String> calibratedValuesTest = new ArrayList<>();
        calibratedValuesTest.add("eight");
//        When
        StringNumbers sn = new StringNumbers();
        ArrayList<String> paddedCalibrationValues = sn.addPaddingToStringNumbers(calibratedValuesTest);
//        Then
        assertThat(paddedCalibrationValues).containsExactly("eeightt");
    }

    @Test
    public void shouldPadNine() {
//        Given
        ArrayList<String> calibratedValuesTest = new ArrayList<>();
        calibratedValuesTest.add("nine");
//        When
        StringNumbers sn = new StringNumbers();
        ArrayList<String> paddedCalibrationValues = sn.addPaddingToStringNumbers(calibratedValuesTest);
//        Then
        assertThat(paddedCalibrationValues).containsExactly("nninee");
    }

    @Test
    public void shouldNotPadEmptyString() {
//        Given
        ArrayList<String> calibratedValuesTest = new ArrayList<>();
        calibratedValuesTest.add("");
//        When
        StringNumbers sn = new StringNumbers();
        ArrayList<String> paddedCalibrationValues = sn.addPaddingToStringNumbers(calibratedValuesTest);
//        Then
        assertThat(paddedCalibrationValues).containsExactly("");
    }

    @Test
    public void shouldReturnAnEmptyList() {
//        Given
        ArrayList<String> calibratedValuesTest = new ArrayList<>();
//        When
        StringNumbers sn = new StringNumbers();
        ArrayList<String> paddedCalibrationValues = sn.addPaddingToStringNumbers(calibratedValuesTest);
//        Then
        assertThat(paddedCalibrationValues).hasSize(0);
    }

//    @Test
//    public void shouldSwapStringNumbersWithDigits() {
////        Given
//        ArrayList<String> calibratedValuesTest = new ArrayList<>();
//        calibratedValuesTest.add("9sixseventwonez3");
//        calibratedValuesTest.add("seven1cvdvnhpgthfhfljmnq");
//        calibratedValuesTest.add("6tvxlgrsevenjvbxbfqrsk4seven");
////        When
//        StringNumbers sn = new StringNumbers();
//        ArrayList<String> convertedCalibratedValuesTest = sn.convertStringToNumber(calibratedValuesTest);
////        Then
//        assertEquals(convertedCalibratedValuesTest.get(0), "96721z3");
////        assertEquals(convertedCalibratedValuesTest.get(1), "71cvdvnhpgthfhfljmnq");
//    }
}
