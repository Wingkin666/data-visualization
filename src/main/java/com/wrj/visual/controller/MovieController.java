package com.wrj.visual.controller;

import com.wrj.visual.bean.MovieBean;
import com.wrj.visual.service.MovieQueryImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by WingKin on 2020/12/31 17:07
 */
@Slf4j
@Controller
public class MovieController {
    @Autowired
    private MovieQueryImpl movieQueryImpl;

    //组员信息
    @RequestMapping("/showCrew")
    public String showCrew() {
        return "crew";
    }

    /**
     * Hive可视化分析
     */
    //获取评分前十电影数据
    @RequestMapping( "/getTopTenData")
    @ResponseBody
    public List<MovieBean> queryTopTen() {
        log.info("执行MovieController中的queryTopTen方法");
        List<MovieBean> movieBean = movieQueryImpl.topTenMovieList();
        return movieBean;
    }

    //评分前十可视化
    @RequestMapping("/showTopTen")
    public String showTopTen() {
        log.info("执行MovieController中的showTopTen方法");
        return "topTenScore";
    }

    //获取评分倒数前十电影数据
    @RequestMapping( "/getLowTenData")
    @ResponseBody
    public List<MovieBean> queryLowTen() {
        log.info("获取评分倒数前十电影数据");
        List<MovieBean> movieBean = movieQueryImpl.lowTenMovieList();
        return movieBean;
    }

    //评分倒数前十可视化
    @RequestMapping("/showLowTen")
    public String showLowTen() {
        log.info("评分倒数前十可视化");
        return "lowTenScore";
    }


    /**
     * python可视化分析
     */
    //电影产量与平均评分走势图
    @RequestMapping("/showFilmMarket")
    public String showFilmMarket() {
        log.info("电影产量与平均评分走势图");
        return "filmMarket";
    }


    //不同评分与片长的电影产量柱状图
    @RequestMapping("/showFilmProduction")
    public String showFilmProduction() {
        log.info("不同评分与片长的电影产量柱状图");
        return "filmProduction";
    }

    //电影类型占比与评分
    @RequestMapping("/showFilmTypes")
    public String showFilmTypes() {
        log.info("电影类型占比与评分");
        return "filmTypes";
    }

    //电影产量最多的十个国家
    @RequestMapping("/showHighestYield1")
    public String showHighestYield1() {
        log.info("电影产量最多的十个国家");
        return "highestYield1";
    }

    //电影产量最多的前二十名主演和导演
    @RequestMapping("/showHighestYield2")
    public String showHighestYield2() {
        log.info("电影产量最多的前二十名主演和导演");
        return "highestYield2";
    }

    //电影数量最多的25名主演南丁格尔玫瑰图
    @RequestMapping("/showActorNightingaleRoseDiagram")
    public String showActorNightingaleRoseDiagram() {
        log.info("南丁格尔玫瑰图");
        return "numberActors";
    }

    //电影数量最多的25名导演南丁格尔玫瑰图
    @RequestMapping("/showDirectorNightingaleRoseDiagram")
    public String showDirectorNightingaleRoseDiagram() {
        log.info("南丁格尔玫瑰图");
        return "numberDirectors";
    }

    //电影评分区间漏斗图和不同等级的平行坐标系图
    @RequestMapping("/showMovieRank")
    public String showMovieRank() {
        log.info("电影评分区间漏斗图和不同等级的平行坐标系图");
        return "movieRank";
    }

    //电影产量随上映时间段变化折线图
    @RequestMapping("/showOutputChanges")
    public String showOutputChanges() {
        log.info("电影产量随上映时间段变化折线图");
        return "outputChanges";
    }



    //评分最高15部电影
    @RequestMapping("/showTopRat")
    public String showTopRat() {
        log.info("评分最高15部电影");
        return "topRat";
    }

}
