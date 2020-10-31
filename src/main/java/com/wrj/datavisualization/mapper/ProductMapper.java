package com.wrj.datavisualization.mapper;

import com.wrj.datavisualization.bean.Product;

import java.util.List;
import java.util.Map;

public interface ProductMapper {
    List<Product> getInfo(Map<String, Object> productMap);
}
