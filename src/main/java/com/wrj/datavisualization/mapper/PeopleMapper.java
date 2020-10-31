package com.wrj.datavisualization.mapper;

import com.wrj.datavisualization.bean.People;

import java.util.List;
import java.util.Map;

public interface PeopleMapper {
    List<People> getAge(Map<String, Object> peopleMap);
}
