package org.adventofcode2023.one;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadFileTest {

    @Test
    public void shouldReadOneLineOfInputFile() throws IOException {
//        Given
        String filePath = "oneLineFile.txt";
//        When
        ArrayList<String> calibrationValues = ReadFile.readFile(filePath);
//        Then
        assertEquals(calibrationValues.size(), 1);
        assertEquals(calibrationValues.get(0), "9sixsevenz3");
    }

    @Test
    public void shouldReadMultipleLinesOfInputFile() throws IOException {
//        Given
        String filePath = "multiLineFile.txt";
//        When
        ArrayList<String> calibrationValues = ReadFile.readFile(filePath);
//        Then
        assertEquals(calibrationValues.size(), 3);
        assertEquals(calibrationValues.get(0), "9sixsevenz3");
        assertEquals(calibrationValues.get(1), "seven1cvdvnhpgthfhfljmnq");
        assertEquals(calibrationValues.get(2), "6tvxlgrsevenjvbxbfqrsk4seven");
    }
}

