package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static ISymptomReader symptomReader = new SymptomReaderImplementation("symptoms.txt");
	public static ISymptomCounter symptomCounter = new SymptomCounterImplementation();
	public static ISymptomWriter symptomWriter = new SymptomWriterImplementation();

	public static void main(String args[]) throws Exception {
		// first get input
		ArrayList<String> symptoms;
		symptoms = symptomReader.getSymptoms();
		//sort data with a TreeMap
		TreeMap<String, Integer> occurrences;
		//count occurences for each symptoms with countSymptoms method
		occurrences = new TreeMap<String, Integer>(symptomCounter.countSymptoms(symptoms));

		// next generate output
		if (occurrences.size() != 0) {
			symptomWriter.writeResult(occurrences);
		} else {
			TreeMap<String, Integer> emptyData = new TreeMap<>();
			emptyData.put("Empty input file - size of input file : ", occurrences.size());
			symptomWriter.writeResult(emptyData);
		}

	}
}