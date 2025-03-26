package com.example.randomnumbergenerator.model;

public class NumberRange {
    private int min;
    private int max;

    // Constructors
    public NumberRange() {
    }

    public NumberRange(int min, int max) {
        this.min = min;
        this.max = max;
    }

    // Getters and Setters
    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}