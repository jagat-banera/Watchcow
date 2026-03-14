package com.watchcow.injector.DTOs;



import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

public class NetworkMetrcis {

    private final List<NetworkIntefaceData> intefaceData ;



    public NetworkMetrcis(List<NetworkIntefaceData> intefaceData) throws UnknownHostException {



        // Get this form constructor
        this.intefaceData = intefaceData;
    }

    public List<NetworkIntefaceData> getIntefaceData() {
        return intefaceData;
    }

}
