package org.adventofcode2023.one;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static ArrayList<String> readFile(String filePath) throws IOException {
        ArrayList<String> calibrationValues;
        calibrationValues = new ArrayList<>();
        InputStream is = ClassLoader.getSystemResourceAsStream(filePath);
        Scanner scanner = new Scanner(is);
//        scanner.useDelimiter("&& ");

        while (scanner.hasNext()) {
            String next = scanner.next();
            calibrationValues.add(next);
        }
        scanner.close();
        return calibrationValues;
    }
}


