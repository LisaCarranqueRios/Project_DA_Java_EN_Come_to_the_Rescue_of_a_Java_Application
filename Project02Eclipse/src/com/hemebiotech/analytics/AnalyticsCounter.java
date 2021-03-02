package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

public class AnalyticsCounter {

	private String inputFilePath;
	private String outputFilePath;

	private Analyze analyze;

	public AnalyticsCounter(String inputFilePath, String outputFilePath) {
		this.inputFilePath = inputFilePath;
		this.outputFilePath = outputFilePath;
		this.analyze = new Analyze(new SymptomReaderImplementation(this.inputFilePath),
				new SymptomCounterImplementation(), new SymptomWriterImplementation());
	}




	public void analyze() throws Exception {
		// first get input
		ArrayList<String> symptoms = analyze.symptomReader.getSymptoms();
		//sort data with a TreeMap
		//count occurrences for each symptoms with countSymptoms method
		TreeMap<String, Integer> occurrences = analyze.symptomCounter.countSymptoms(symptoms);

		// next generate output
		if (occurrences.size() != 0) {
			analyze.symptomWriter.writeResult(occurrences, this.outputFilePath);
		} else {
			TreeMap<String, Integer> emptyData = new TreeMap<>();
			emptyData.put("Empty input file - size of input file : ", occurrences.size());
			analyze.symptomWriter.writeResult(emptyData, this.outputFilePath);
		}

	}
}