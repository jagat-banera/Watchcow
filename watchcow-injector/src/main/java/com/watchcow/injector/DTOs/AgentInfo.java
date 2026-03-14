package com.watchcow.injector.DTOs;

public class AgentInfo {

    private  String agentId ;
    private  String hostname ;
    private  String version ;


    public AgentInfo() {
    }


    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAgentId() {
        return agentId;
    }

    public String getHostname() {
        return hostname;
    }

    public String getVersion() {
        return version;
    }
}
