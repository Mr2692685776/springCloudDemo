package com.newheart.feignorder.feignorder.service;


/**
 * 订单业务类
 */
public interface ProductOrderService {
    /**
     * 下单接口
     * @param userId
     * @param productId
     * @return
     */
     String save(int userId, int productId);


}
