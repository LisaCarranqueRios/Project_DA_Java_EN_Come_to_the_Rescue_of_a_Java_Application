package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class SymptomWriterImplementation implements ISymptomWriter {

    @Override
    public void writeResult(TreeMap<String, Integer> symptoms, String outputFilePath)  {
        try (FileWriter writer = new FileWriter (outputFilePath)) {
            for (String s : symptoms.keySet()) {
                writer.write(s + " : " + symptoms.get(s) + "\n");
            }
        } catch (IOException e) {
            System.out.println("Erreur pendant l'écriture du résultat de l'analyse.");
            System.out.println("Vérifiez les droits d'écriture de l'application.");
        }
    }
}
