package org.adventofcode2023.one;

import java.util.ArrayList;

public class StringNumbers {

    public ArrayList<String> convertStringToNumber(ArrayList<String> calibrationValues) {
        ArrayList<String> convertedCalibrationValues = new ArrayList<>();
        for (String element : calibrationValues) {
            String newElement = element.replace("one", "1")
                    .replace("two", "2")
                    .replace("three", "3")
                    .replace("four", "4")
                    .replace("five", "5")
                    .replace("six", "6")
                    .replace("seven", "7")
                    .replace("eight", "8")
                    .replace("nine", "9");
            convertedCalibrationValues.add(newElement);
        }
        return convertedCalibrationValues;
    }
}
