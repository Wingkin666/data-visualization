package com.wrj.datavisualization.service;

import com.wrj.datavisualization.bean.People;
import com.wrj.datavisualization.bean.Product;
import com.wrj.datavisualization.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PeopleServiceImpl {
    //将DAO注入Service层
    @Autowired
    private PeopleMapper peopleMapper;

    public List<People> getAge(Map<String, Object> peopleMap) {
        return peopleMapper.getAge(peopleMap);
    }
}
