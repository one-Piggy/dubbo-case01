package com.sgg.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sgg.gmall.bean.UserAddress;
import com.sgg.gmall.service.OrderService;
import com.sgg.gmall.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: dubbo
 * @description:这是个消费者模块
 * @author: 作者
 * @create: 2022-01-05 22:39
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Reference
    UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
      //1.查询用户的收货地址，需要用到生产者的接口
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);

         return  userAddressList;
    }
}
