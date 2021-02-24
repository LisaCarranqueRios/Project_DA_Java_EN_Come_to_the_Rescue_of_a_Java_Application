package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;

public class SymptomCounterImplementation implements ISymptomCounter{

    @Override
    public HashMap<String, Integer> countSymptoms(ArrayList<String> symptoms)  {
        HashMap<String, Integer> occurrences = new HashMap<>();
        for (String s:symptoms) {
            if (occurrences.containsKey(s)) {
                occurrences.put(s, occurrences.get(s)+1);
            } else {
                occurrences.put(s, 1);
            }
        }
        return occurrences;
    }
}
