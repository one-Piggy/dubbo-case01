package com.sgg.gmall.controll;

import com.sgg.gmall.bean.UserAddress;
import com.sgg.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: dubbo-case01
 * @description:
 * @author: xb
 * @create: 2022-01-11 17:37
 */
@RestController
public class OrderControll {
    @Autowired
    OrderService orderService;
    @GetMapping("/initOrder")
   public List<UserAddress> initOrder(@RequestParam("userId") String userId){
        return orderService.initOrder(userId);
    }
}
