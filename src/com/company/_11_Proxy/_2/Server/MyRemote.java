package com.company._11_Proxy._2.Server;

import java.rmi.Remote;

public interface MyRemote extends Remote {
    public String sayHello() throws RuntimeException;
}
