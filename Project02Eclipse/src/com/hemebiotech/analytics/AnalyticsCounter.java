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
		if (symptoms.size() != 0) {
			symptomWriter.writeResult(symptoms);
		} else {
			HashMap<String, Integer> emptyData = new HashMap<>();
			emptyData.put("Empty input file - size of input file : ", symptoms.size());
			symptomWriter.writeResult(emptyData);
		}

	}
}