package org.adventofcode.one;

import java.util.ArrayList;

public class Calculator {
    int total = 0;

    public int calculateTotal(ArrayList<Integer> finalDigitList) {
        //loop to add to running total
        int length = finalDigitList.size();
        for (int i = 0; i < length; i++) {
            int val = finalDigitList.get(i);
            total+= val;
        }
        return total;
    }
}
