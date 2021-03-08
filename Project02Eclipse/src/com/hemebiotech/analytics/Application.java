package com.hemebiotech.analytics;

/**
 * A class responsible for launching AnalyticsCounter application.
 */
public class Application {

    /**
     * The main function for this application, using inputFilePath and outputFilePath.
     * Default value for inputFilePath is "symptoms.txt" and default value for outputFilePath is "results.out".
     * It reads data from inputFilePath, and writes output into the output file at outputFilePath.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String args[]) throws Exception {

        String inputFilePath = "symptoms.txt";
        String outputFilePath = "results.out";
        AnalyticsCounter analyticsCounter = new AnalyticsCounter(inputFilePath, outputFilePath);
        analyticsCounter.analyze();

    }
}
