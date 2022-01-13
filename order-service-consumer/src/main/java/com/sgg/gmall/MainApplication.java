package com.sgg.gmall;

import com.sgg.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: dubbo-case01
 * @description:
 * @author: xb
 * @create: 2022-01-06 14:02
 */
public class MainApplication {
    public static void main(String[] args) throws IOException, InterruptedException {
        ClassPathXmlApplicationContext ios = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService bean = ios.getBean(OrderService.class);
        bean.initOrder("1");

        System.out.println("调用完成");
        System.in.read();
    }
}
