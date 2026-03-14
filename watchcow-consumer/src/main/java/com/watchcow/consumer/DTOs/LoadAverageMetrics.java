package com.watchcow.consumer.DTOs;

public class LoadAverageMetrics {

    private  double loadAverage  ;

    public LoadAverageMetrics() {
    }

    public void setLoadAverage(double loadAverage) {
        this.loadAverage = loadAverage;
    }

    public double getLoadAverage() {
        return loadAverage;
    }
}
