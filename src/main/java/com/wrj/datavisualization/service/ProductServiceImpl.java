package com.wrj.datavisualization.service;

import com.wrj.datavisualization.bean.Product;
import com.wrj.datavisualization.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl {
    //将DAO注入Service层
    @Autowired
    private ProductMapper productMapper;

    public List<Product> getProduct(Map<String, Object> productMap) {
        return productMapper.getInfo(productMap);
    }

}
