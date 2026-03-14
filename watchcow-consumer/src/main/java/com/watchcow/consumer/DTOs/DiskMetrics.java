package com.watchcow.consumer.DTOs;

public class DiskMetrics {

    private  double totalDiskSpace;
    private  double freeDiskSpace;
    private  double usedDiskSpace;

    public DiskMetrics() {
    }

    public void setTotalDiskSpace(double totalDiskSpace) {
        this.totalDiskSpace = totalDiskSpace;
    }

    public void setFreeDiskSpace(double freeDiskSpace) {
        this.freeDiskSpace = freeDiskSpace;
    }

    public void setUsedDiskSpace(double usedDiskSpace) {
        this.usedDiskSpace = usedDiskSpace;
    }

    public double getTotalDiskSpace() {
        return totalDiskSpace;
    }

    public double getFreeDiskSpace() {
        return freeDiskSpace;
    }

    public double getUsedDiskSpace() {
        return usedDiskSpace;
    }
}