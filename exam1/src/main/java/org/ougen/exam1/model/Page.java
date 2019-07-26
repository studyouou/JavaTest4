package org.ougen.exam1.model;

import com.github.pagehelper.IPage;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Author: OuGen
 * Discription:
 * Date: 10:20 2019/7/26
 */

public class Page implements IPage {
    @Min(0)
    @Max(20)
    @NotNull
    private int pageSize;
    @NotNull
    private int page;
    @NotEmpty
    private String sort = "ASC";

    @Override
    public Integer getPageNum() {
        return page;
    }
    @Override
    public Integer getPageSize(){
        return pageSize;
    }
    @Override
    public String getOrderBy() {
        return "film_id "+sort;
    }

    public void setPageSize(int pageSize){
        this.pageSize=pageSize;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
