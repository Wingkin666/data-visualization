package com.wrj.visual.mapper;

import com.wrj.visual.bean.MovieBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by WingKin on 2020/12/31 16:53
 */
@Repository  //该注解是要与启动类中的@mapperscan配套使用
public interface MovieQueryMapper {
    /*
     * 查询评分前十
     */
    List<MovieBean> topTenMovieList();

    /*
     * 查询评分倒数前十
     */
    List<MovieBean> lowTenMovieList();

}
