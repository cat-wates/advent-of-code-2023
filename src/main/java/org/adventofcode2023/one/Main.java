package org.adventofcode2023.one;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "fullList.txt"; //define file as variable
        ArrayList<String> calibrationValues = ReadFile.readFile(filePath); //read file into readFile method - assigned as calibrationValues
        StringNumbers string = new StringNumbers();
        ArrayList<String> paddedCalibrationValues = string.addPaddingToStringNumbers(calibrationValues);
        ArrayList<String> convertedCalibrationValues = string.convertStringToNumber(paddedCalibrationValues);
        Calibrations extract = new Calibrations(convertedCalibrationValues); //instance of Calibrations with cV fed in
        extract.setDigitList(); //uses cV in Calibrations class to run method
        ArrayList<Integer> finalDigitList = extract.findCorrectDigits();
        Calculator calc = new Calculator();
        System.out.println(calc.calculateTotal(finalDigitList));

    }
}



/*
Approach:
1. Read in text file
2. Turn it into a list?
3. Remove non-digit characters
3. Create a loop which looks for the first and last digit in every element of the list
4. Join the two digits together
5. Sum the value of each element in digitList
 */