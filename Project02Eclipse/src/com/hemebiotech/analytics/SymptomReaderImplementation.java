package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Simple brute force implementation
 *
 */
public class SymptomReaderImplementation implements ISymptomReader {

	private String filepath;

	/**
	 *
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public SymptomReaderImplementation(String filepath) {
		this.filepath = filepath;
	}

	@Override
	public ArrayList<String> getSymptoms()  {

		ArrayList<String> result = new ArrayList<>();

		if (filepath != null) {
			try (BufferedReader reader = new BufferedReader (new FileReader(filepath))) {
				String line = reader.readLine();
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
			} catch (IOException e) {
				System.out.println("Une erreur est survenue pendant l'analyse du fichier " + filepath);
				System.out.println("Vérifiez que le fichier est présent et lisible.");
			}
		}

		return result;
	}

}
