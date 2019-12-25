package com.newheart.feignorder.feignorder.service.impl;

import com.newheart.feignorder.feignorder.service.ProductClient;

import com.newheart.feignorder.feignorder.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductOrderServiceImpl implements ProductOrderService {


    @Autowired
    private ProductClient productClient;

    @Override
    public String save(int userId, int productId) {
        String response = productClient.findById(productId);
        return response;
    }




}
