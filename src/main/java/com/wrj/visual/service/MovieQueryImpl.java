package com.wrj.visual.service;

import com.wrj.visual.bean.MovieBean;
import com.wrj.visual.mapper.MovieQueryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WingKin on 2020/12/31 17:01
 */
@Service
public class MovieQueryImpl {
    @Autowired
    private MovieQueryMapper movieQueryMapper;

    /*
     * 查询评分前十
     */
    public List<MovieBean> topTenMovieList(){
        return movieQueryMapper.topTenMovieList();
    }

    /*
     * 查询评分倒数前十
     */
    public List<MovieBean> lowTenMovieList(){
        return movieQueryMapper.lowTenMovieList();
    }

}
