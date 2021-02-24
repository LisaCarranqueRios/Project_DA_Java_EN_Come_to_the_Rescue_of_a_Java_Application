package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.HashMap;

public interface ISymptomWriter {

    void writeResult(HashMap<String, Integer> symptoms) throws IOException;
}
