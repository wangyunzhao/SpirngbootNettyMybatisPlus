package com.example.demo;

import com.example.demo.client.NettyClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

@SpringBootTest
public class DemoApplicationTest {

    @Test
    void contextLoads() {
        //开启10条线程，每条线程就相当于一个客户端
//        for (int i = 1; i <= 10; i++) {
//
//            new Thread(new NettyClient("thread" + "--" + i)).start();
//        }
        new Thread(new NettyClient("thread" + "--1" )).start();
    }

    public static void main(String[] args) {
//        InetAddress address = null;
//        try {
//            address = InetAddress.getLocalHost();
//        } catch (UnknownHostException e) {
//            e.printStackTrace();
//        }
//        System.out.println(address.getHostAddress());//获取IP地址
        new Thread(new NettyClient("thread" + "--1" )).start();




    }

}
