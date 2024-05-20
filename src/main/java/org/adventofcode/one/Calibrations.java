package org.adventofcode.one;

import java.util.ArrayList;

public class Calibrations {
    ArrayList<String> calibrationValues;
    ArrayList<String> digitList = new ArrayList<>();

    public Calibrations(ArrayList<String> calibrationValues) {
        this.calibrationValues = calibrationValues;
    }

    public void setDigitList() {
        for (String element : calibrationValues) { //for each element of the array
            String digits = element.replaceAll("[^0-9]", "");
            digitList.add(digits);
        }
    }

    public ArrayList<Integer> findCorrectDigits() {
        ArrayList<Integer> finalDigitList = new ArrayList<>();
        for (String element : digitList) {
            char[] firstAndLastChar = {element.charAt(0), element.charAt(element.length()-1)};
//            List<Character> firstAndLastChar = List.of(element.charAt(0), element.charAt(element.length()-1));  alternate approach
            String finalString = new String(firstAndLastChar);
            finalDigitList.add(Integer.parseInt(finalString));
        }
        return finalDigitList;

    }
}

//how do i pick the first and last?