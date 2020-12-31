package com.wrj.visual.mapper;

import com.wrj.visual.bean.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface productMapper {
    Product findall();

    List<Product> plist();

    Product findProductById(int pid);
}
