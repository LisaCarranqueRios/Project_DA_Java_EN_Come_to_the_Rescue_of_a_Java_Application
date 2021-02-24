package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static ISymptomReader symptomReader = new SymptomReaderImplementation("symptoms.txt");
	public static ISymptomWriter symptomWriter = new SymptomWriterImplementation();

	public static void main(String args[]) throws Exception {
		// first get input
		TreeMap<String, Integer> symptoms = new TreeMap<>();
		symptoms = new TreeMap<String, Integer>(symptomReader.getSymptoms());

		// next generate output
		if (symptoms.size() != 0) {
			symptomWriter.writeResult(symptoms);
		} else {
			TreeMap<String, Integer> emptyData = new TreeMap<>();
			emptyData.put("Empty input file - size of input file : ", symptoms.size());
			symptomWriter.writeResult(emptyData);
		}

	}
}