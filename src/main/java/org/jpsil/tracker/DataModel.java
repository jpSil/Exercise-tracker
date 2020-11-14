package org.jpsil.tracker;

import java.time.LocalDate;

public class DataModel {

    private String exerciseType;
    private LocalDate date;
    private int duration;

    public DataModel(String exerciseType, LocalDate date, int duration) {
        this.exerciseType = exerciseType;
        this.date = date;
        this.duration = duration;
    }

    public DataModel(String exerciseType, int duration) {
        this.exerciseType = exerciseType;
        this.duration = duration;
    }

    // Getters and Setters

    public String getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int length) {
        this.duration = length;
    }
}
