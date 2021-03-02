package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

public class SymptomCounterImplementation implements ISymptomCounter{

    @Override
    public TreeMap<String, Integer> countSymptoms(ArrayList<String> symptoms)  {
        TreeMap<String, Integer> occurrences = new TreeMap<>();
        for (String symptom:symptoms) {
            if (occurrences.containsKey(symptom)) {
                occurrences.put(symptom, occurrences.get(symptom)+1);
            } else {
                occurrences.put(symptom, 1);
            }
        }
        return occurrences;
    }
}
