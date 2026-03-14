package com.watchcow.consumer.DTOs;

public class ServerMetrics {

    private  AgentInfo agentInfo;
    private  CpuMetrics cpu ;
    private  DiskMetrics disk ;
    private  MemoryMetrics memory ;
    private  LoadAverageMetrics loadAverage ;
    private  long collectionTime ;

    public ServerMetrics() {
    }

    public AgentInfo getAgentInfo() {
        return agentInfo;
    }

    public void setAgentInfo(AgentInfo agentInfo) {
        this.agentInfo = agentInfo;
    }

    public void setCpu(CpuMetrics cpu) {
        this.cpu = cpu;
    }

    public void setDisk(DiskMetrics disk) {
        this.disk = disk;
    }

    public void setMemory(MemoryMetrics memory) {
        this.memory = memory;
    }

    public void setLoadAverage(LoadAverageMetrics loadAverage) {
        this.loadAverage = loadAverage;
    }

    public void setCollectionTime(long collectionTime) {
        this.collectionTime = collectionTime;
    }

    public CpuMetrics getCpu() {
        return cpu;
    }

    public DiskMetrics getDisk() {
        return disk;
    }

    public MemoryMetrics getMemory() {
        return memory;
    }

    public LoadAverageMetrics getLoadAverage() {
        return loadAverage;
    }

    public long getCollectionTime() {
        return collectionTime;
    }

}
