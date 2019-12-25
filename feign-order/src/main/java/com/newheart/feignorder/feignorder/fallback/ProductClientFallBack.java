package com.newheart.feignorder.feignorder.fallback;

import com.newheart.feignorder.feignorder.service.ProductClient;
import org.springframework.stereotype.Component;

/**
 * @author hanjie
 * @date 2019/12/25 9:08
 */
@Component
public class ProductClientFallBack implements ProductClient {
    @Override
    public String findById(int id) {
        System.out.println("feign 调用product-service findbyid 异常");
        return null;
    }
}
