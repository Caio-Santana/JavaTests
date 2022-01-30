/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.universalservicebrowser;

import java.util.*;
import java.rmi.*;
import java.rmi.server.*;

/**
 *
 * @author Caio
 */
public class ServiceServerImpl extends UnicastRemoteObject implements ServiceServer {

    HashMap serviceList;
    
    public ServiceServerImpl() throws RemoteException {
        setUpServices();
    }
    
    private void setUpServices() {
        serviceList = new HashMap();
        serviceList.put("Dice Rolling Service", new DiceService());
        serviceList.put("Day of the Week Service", new DayOfTheWeekService());
        serviceList.put("Visual Music Service", new MiniMusicService());
    }
    
    @Override
    public Object[] getServiceList() throws RemoteException {
        System.out.println("in remote");
        return serviceList.keySet().toArray();
    }

    @Override
    public Service getService(Object serviceKey) throws RemoteException {
        return (Service) serviceList.get(serviceKey);
    }
    
    public static void main(String[] args) {
        try {
            Naming.rebind("ServiceServer", new ServiceServerImpl());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Remote service is running");
    }
    
}
