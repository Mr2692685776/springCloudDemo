package com.newheart.serviceorder.serviceorder.service.impl;


import com.newheart.serviceorder.serviceorder.domain.ProductOrder;
import com.newheart.serviceorder.serviceorder.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.UUID;

@Service
public class ProductOrderServiceImpl implements ProductOrderService {


    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ProductOrder save(int userId, int productId) {

        Object obj = restTemplate.getForObject("http://SERVICE-PRODUCT/api/v1/product/find?id="+productId, Object.class);

        System.out.println(obj);

        ProductOrder productOrder = new ProductOrder();
        productOrder.setCreateTime(new Date());
        productOrder.setUserId(userId);
        productOrder.setTradeNo(UUID.randomUUID().toString());

        return productOrder;
    }
}
