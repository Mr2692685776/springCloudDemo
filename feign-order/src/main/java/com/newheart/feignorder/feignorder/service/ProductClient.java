package com.newheart.feignorder.feignorder.service;

import com.newheart.feignorder.feignorder.fallback.ProductClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 商品服务客户端
 */
@FeignClient(name = "SERVICE-PRODUCT", fallback = ProductClientFallBack.class )
public interface ProductClient {
    @GetMapping("/api/v1/product/find")
    String findById(@RequestParam(value = "id") int id);
}
