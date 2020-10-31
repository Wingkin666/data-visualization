package com.wrj.datavisualization.controller;

import com.wrj.datavisualization.bean.Product;
import com.wrj.datavisualization.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;
    //示例
    @ResponseBody
    @RequestMapping("/project")
    public List<Product> myProject(){
        ArrayList<Product> productArrayList = new ArrayList<Product>();
        Product product1 = new Product();
        product1.setProductName("袜子");
        product1.setNums("15");
        Product product2 = new Product();
        product2.setProductName("羊毛衫");
        product2.setNums("20");
        Product product3 = new Product();
        product3.setProductName("雪纺衫");
        product3.setNums("24");
        Product product4 = new Product();
        product4.setProductName("高跟鞋");
        product4.setNums("30");
        productArrayList.add(product1);
        productArrayList.add(product2);
        productArrayList.add(product3);
        productArrayList.add(product4);
        return productArrayList;
    }

    @RequestMapping("/viewTest")
    public String myView(){
        return "view";
    }

    //访问数据库
    @ResponseBody
    @RequestMapping("/product")
    public List<Product> showProduct(){
        Map<String,Object> result = new HashMap<>();
        List<Product> list = productService.getProduct(result);
        //request.getSession().setAttribute("LIST",list);
        //  return result;
        return list;

    }

    @RequestMapping("/view")
    public String myView2(){
        return "product";
    }





}
