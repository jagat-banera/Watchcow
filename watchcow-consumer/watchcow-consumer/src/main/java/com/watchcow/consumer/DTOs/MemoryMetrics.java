package com.watchcow.consumer.DTOs;


public class MemoryMetrics {

    private  double totalMemory;
    private   double freeMemory ;
    private   double usedMemory ;


    public MemoryMetrics() {
    }

    public void setTotalMemory(double totalMemory) {
        this.totalMemory = totalMemory;
    }

    public void setFreeMemory(double freeMemory) {
        this.freeMemory = freeMemory;
    }

    public void setUsedMemory(double usedMemory) {
        this.usedMemory = usedMemory;
    }

    public double getTotalMemory() {
        return totalMemory;
    }

    public double getFreeMemory() {
        return freeMemory;
    }

    public double getUsedMemory() {
        return usedMemory;
    }
}
