package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

/**
 * A class responsible for analyzing an input file and producing an output file.
 */
public class AnalyticsCounter {

    /**
     * A file path for an input file.
     */
    private String inputFilePath;
    /**
     * A file path for an output file.
     */
    private String outputFilePath;

    /**
     * The interface containing functions responsible for analyze.
     *
     * @see ISymptomAnalyzer
     */
    private ISymptomAnalyzer symptomAnalyzer;

    /**
     * A constructor for AnalyticsCounter.
     * It creates a SymptomAnalyzerImplementation with inputFilePath and outputFilePath as filepath attributes.
     *
     * @param inputFilePath The file path for input file.
     * @param outputFilePath The file path for output file.
     */
    public AnalyticsCounter(String inputFilePath, String outputFilePath) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
        this.symptomAnalyzer = new SymptomAnalyzerImplementation(this.inputFilePath, this.outputFilePath);
    }

    /**
     * The function which reads data input and writes data output into an output file located at outputFilePath.
     *
     * @throws IOException throwing an exception occurring if there is a problem of file reading or writing.
     */
    public void analyze() throws IOException {
        TreeMap<String, Integer> symptoms = symptomAnalyzer.getSymptoms();
        if (symptoms.size() != 0) {
            symptomAnalyzer.writeResult(symptoms);
        } else {
            TreeMap<String, Integer> emptyData = new TreeMap<>();
            emptyData.put("Empty input file - size of input file : ", symptoms.size());
            symptomAnalyzer.writeResult(emptyData);
        }

    }
}