package com.wrj.datavisualization.controller;

import com.wrj.datavisualization.bean.People;
import com.wrj.datavisualization.bean.Product;
import com.wrj.datavisualization.service.PeopleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PeopleController {
    @Autowired
    private PeopleServiceImpl peopleService;

    @ResponseBody
    @RequestMapping("/sheyou")
    public List<People> showAge(){
        Map<String,Object> result = new HashMap<>();
        List<People> list = peopleService.getAge(result);
        //request.getSession().setAttribute("LIST",list);
        //  return result;
        return list;

    }

    @RequestMapping("/ageView")
    public String myView2(){
        return "age";
    }

}
