package org.ougen.exam1.controller;

import com.github.pagehelper.IPage;
import com.github.pagehelper.PageHelper;
import org.ougen.exam1.model.Film;
import org.ougen.exam1.model.Model;
import org.ougen.exam1.model.Page;
import org.ougen.exam1.service.FilmService;
import org.ougen.exam1.util.ModelUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 10:34 2019/7/26
 */
@RestController
public class FilmController {
    private static final Logger logger = LoggerFactory.getLogger(FilmController.class);
    @Autowired
    private FilmService filmService;

    @GetMapping("/")
    public Model getFilmByPage(@Validated Page nowPage, BindingResult result){
        if (result.hasErrors()){
            logger.info("传入参数有误");
            return ModelUtil.getModel("参数传入有误",-1,"请重新传入参数");
        }
        return ModelUtil.getModel("获取成功",1,filmService.getFilm(nowPage));
    }
    @GetMapping("/pageHelper")
    public Model getFilmByPageHelp(@RequestParam("page")int page,@RequestParam("pageSize") int pageSize){
        Page ipPage = new Page();
        ipPage.setPage(page);
        ipPage.setPageSize(pageSize);
        PageHelper.startPage(ipPage);
        List<Film> filmList = filmService.getFilmByPageHelper();
        logger.info("查询成功{}");
        return ModelUtil.getModel("success",1,filmList);
    }
}
