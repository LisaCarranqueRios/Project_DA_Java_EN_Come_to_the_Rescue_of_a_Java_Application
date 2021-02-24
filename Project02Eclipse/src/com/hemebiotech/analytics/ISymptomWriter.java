package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.HashMap;
import java.util.TreeMap;

public interface ISymptomWriter {

    void writeResult(TreeMap<String, Integer> symptoms) throws IOException;
}
