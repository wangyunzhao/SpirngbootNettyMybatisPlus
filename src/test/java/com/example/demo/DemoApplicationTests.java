package com.example.demo;

import com.example.demo.client.NettyClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class DemoApplicationTests {

//    @Test
    void contextLoads() {
        //开启10条线程，每条线程就相当于一个客户端
//        for (int i = 1; i <= 10; i++) {
//
//            new Thread(new NettyClient("thread" + "--" + i)).start();
//        }
        new Thread(new NettyClient("thread" + "--2" )).start();
    }

    public static void main(String[] args) {
        new Thread(new NettyClient("thread" + "--2" )).start();
    }

}
