package com.sgg.gmall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: dubbo-case01
 * @description:
 * @author: xb
 * @create: 2022-01-06 10:46
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc=new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();
        System.in.read();
    }
}
