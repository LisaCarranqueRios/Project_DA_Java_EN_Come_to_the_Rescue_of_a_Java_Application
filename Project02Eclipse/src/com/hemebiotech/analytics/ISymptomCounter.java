package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

public interface ISymptomCounter {

    TreeMap<String, Integer> countSymptoms (ArrayList<String> symptoms);

}
