package com.demo.idea.socketNetDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: 史传正
 * @Create: 2024-11-13-20:36
 * -------------------------
 * className: NetAddressDemo
 * Description:
 */
public class NetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("LAPTOP-3B0AVLFC");
        System.out.println(address);
        String name = address.getHostName();
        System.out.println(name);
        String ip = address.getHostAddress();
        System.out.println(ip);


    }
}
