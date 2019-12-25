package com.newheart.serviceproduct.serviceproduct.service;



import com.newheart.serviceproduct.serviceproduct.domain.Product;
import java.util.List;

public interface ProductService {

    List<Product> listProduct();

    Product findById(int id);


}
