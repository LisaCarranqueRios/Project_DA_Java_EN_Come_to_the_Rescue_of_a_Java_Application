package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

public interface ISymptomWriter {

    void writeResult(TreeMap<String, Integer> symptoms, String outputFilePath) throws IOException;
}
