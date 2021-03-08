package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

/**
 * An implementation of ISymptomAnalyzer which is based on an input text file and produces an output file
 * using inputFilePath and outputFilePath.
 */
public class SymptomAnalyzerImplementation implements ISymptomAnalyzer {

    /**
     * The filepath of the input text file.
     */
    private String inputFilePath;

    /**
     * The filepath of the output file.
     */
    private String outputFilePath;

    /**
     * The filepath of the input file and the filepath of the output file are stored as attributes
     * of this implementation in order to use them in the following getSymptoms method.
     *
     * @param inputFilePath The filepath of the input file.
     * @param outputFilePath The filepath of the output file.
     */
    public SymptomAnalyzerImplementation(String inputFilePath, String outputFilePath) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
    }

    /**
     * A method responsible for analyzing an input file and producing the number of occurrences for each symptom.
     *
     * @return A TreeMap containing the sorted result of symptoms and occurrences as pairs (symptom, occurrences).
     * Each pair (symptom, occurrences) corresponds to a pair (key, value) in this TreeMap.
     *
     */
    @Override
    public TreeMap<String, Integer> getSymptoms() {
        TreeMap<String, Integer> symptoms = new TreeMap<>();
        if (inputFilePath != null) {
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
                String symptom = reader.readLine();
                int i = 0;
                while (symptom != null) {
                    i++;
                    if (symptoms.containsKey(symptom)) {
                        symptoms.put(symptom, symptoms.get(symptom) + 1);
                    } else {
                        symptoms.put(symptom, 1);
                    }
					symptom = reader.readLine();
                }
                System.out.println("L'analyse est bien terminée. Le résultat est disponible dans le fichier results.out.");
            } catch (IOException e) {
                System.out.println("Une erreur est survenue pendant l'analyse du fichier " + inputFilePath);
                System.out.println("Vérifiez que le fichier est présent et lisible.");
            }

        }
        return symptoms;
    }

    /**
     * A method responsible for writing the result stored in the TreeMap obtained with getSymptoms method
     * into the output text file located at outputFilePath.
     *
     * @param symptoms The TreeMap produced by the getSymptoms method.
     */
    @Override
    public void writeResult(TreeMap<String, Integer> symptoms) {
        try (FileWriter writer = new FileWriter(outputFilePath)) {
            for (String s : symptoms.keySet()) {
                writer.write(s + " : " + symptoms.get(s) + "\n");
            }
        } catch (IOException e) {
            System.out.println("Erreur pendant l'écriture du résultat de l'analyse.");
            System.out.println("Vérifiez les droits d'écriture de l'application.");
        }
    }
}
