package com.hemebiotech.analytics;

public class Application {

    public static void main(String args[]) throws Exception {

        String inputFilePath = "symptoms.txt";
        String outputFilePath = "results.out";
        AnalyticsCounter analyticsCounter = new AnalyticsCounter(inputFilePath, outputFilePath);
        analyticsCounter.analyze();

    }
}
