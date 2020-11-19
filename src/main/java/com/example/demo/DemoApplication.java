package com.example.demo;

import com.example.demo.netty.NettyServer;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.tools.jar.CommandLine;

import java.net.InetAddress;
import java.net.InetSocketAddress;


@SpringBootApplication
@MapperScan({"com.example.demo.provider.dao"})
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private NettyServer nettyServer;

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    @Override
    public void run(String... strings) throws Exception{
        InetAddress inetAddress = InetAddress.getLocalHost();
        InetSocketAddress address = new InetSocketAddress(inetAddress.getHostAddress(),8085);
        log.info("netty服务的启动地址为："+"127.0.0.1"+":"+"8085" );
        nettyServer.start(address);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


}
