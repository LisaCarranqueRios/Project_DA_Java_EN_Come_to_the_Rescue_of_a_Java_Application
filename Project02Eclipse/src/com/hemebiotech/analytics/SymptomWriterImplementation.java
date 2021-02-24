package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class SymptomWriterImplementation implements ISymptomWriter {

    @Override
    public void writeResult(HashMap<String, Integer> symptoms) throws IOException {
        FileWriter writer = new FileWriter ("result.out");
        for (String s: symptoms.keySet()) {
            writer.write(s + " : " + symptoms.get(s) + "\n");
        }
        writer.close();
    }
}
