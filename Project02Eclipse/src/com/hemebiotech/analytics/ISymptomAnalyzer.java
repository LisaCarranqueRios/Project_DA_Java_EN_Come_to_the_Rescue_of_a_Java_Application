package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

/**
 * An interface which contains functions responsible for analyzing an input file.
 */
public interface ISymptomAnalyzer {

    /**
     * A method which reads data from an input file and stores it into a TreeMap.
     *
     * @return A TreeMap containing the number of occurrences for each symptom as a pair (symptom, occurrences).
     * @throws IOException throwing an exception occurring if there is a problem of file reading.
     * @see SymptomAnalyzerImplementation
     */
    TreeMap<String, Integer> getSymptoms() throws IOException;

    /**
     * A method which writes data contained in the TreeMap resulting of the getSymptoms method
     * into an output file located at outputFilePath.
     *
     * @param symptoms The TreeMap containing the pairs (symptoms, occurrences).
     * @throws IOException throwing an exception occurring if there is a problem of file writing.
     * @see SymptomAnalyzerImplementation
     */
    void writeResult(TreeMap<String, Integer> symptoms) throws IOException;

}
