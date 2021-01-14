package com.wrj.visual.bean;

import lombok.Data;

import java.util.Date;

/**
 * Created by WingKin on 2020/12/31 16:43
 */
@Data
public class MovieBean {
    private int id;
    private int movie_id ;
    private String movie_name;
    private double score ;
    private String url;
    private String director;
    private String scriptwriter;
    private String actor;
    private String type;
    private String country;
    private String language;
    private Date release_date;
    private int movie_length;
    private int evaluator_num;
}
