package com.sgg.gmall.service;

import com.sgg.gmall.bean.UserAddress;

import java.util.List;

public interface OrderService {
    /**
     * 初始化订单
     * @param userId
     * @return
     */
    public List<UserAddress> initOrder(String userId);
}
