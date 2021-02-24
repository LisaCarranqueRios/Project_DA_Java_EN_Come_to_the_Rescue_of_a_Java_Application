package com.hemebiotech.analytics;

import java.util.HashMap;

public class AnalyticsCounter {

	public static ISymptomReader symptomReader = new SymptomReaderImplementation("symptoms.txt");
	public static ISymptomWriter symptomWriter = new SymptomWriterImplementation();

	public static void main(String args[]) throws Exception {
		// first get input
		HashMap<String, Integer> symptoms = new HashMap<>();
		symptoms = symptomReader.getSymptoms();

		// next generate output
		symptomWriter.writeResult(symptoms);

	}
}