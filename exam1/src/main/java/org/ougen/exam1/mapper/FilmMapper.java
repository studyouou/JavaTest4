package org.ougen.exam1.mapper;

import org.apache.ibatis.annotations.Param;
import org.ougen.exam1.model.Film;
import org.ougen.exam1.model.Page;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 10:34 2019/7/26
 */
public interface FilmMapper {
    public List<Film> getFile(@Param("offset")int offset,@Param("limit")int limit,@Param("sort") String sort);
}
