package org.jpsil.tracker;

import java.util.ArrayList;

public class Dataset {

    private ArrayList<DataModel> rawDataset;
    private ArrayList<DataModel> processedDataset;

    // Getters and Setters

    public ArrayList<DataModel> getRawDataset() {
        return rawDataset;
    }

    public void setRawDataset(ArrayList<DataModel> dataset) {
        this.rawDataset = dataset;
    }

    // Process raw data from query
    public void processRawDataset() {
        for(int i = 0; i < rawDataset.size(); i++) {
            String exerciseType = rawDataset.get(i).getExerciseType();
            int duration = rawDataset.get(i).getDuration();
            DataModel processedDataModel = new DataModel(exerciseType, duration);
            processedDataset.add(processedDataModel);
        }
    }



}
