package com.hemebiotech.analytics;

public class Analyze {

    public  ISymptomReader symptomReader;
    public  ISymptomCounter symptomCounter;
    public  ISymptomWriter symptomWriter;

    public Analyze(ISymptomReader symptomReader, ISymptomCounter symptomCounter,
                   ISymptomWriter symptomWriter) {
        this.symptomReader = symptomReader;
        this.symptomCounter = symptomCounter;
        this.symptomWriter = symptomWriter;
    }


}
