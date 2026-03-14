package com.watchcow.consumer.DTOs;

public class CpuMetrics {

    private double cpuLoad ;

    public CpuMetrics() {
    }

    public void setCpuLoad(double cpuLoad) {
        this.cpuLoad = cpuLoad;
    }

    public double getCpuLoad() {
        return cpuLoad;
    }
}
