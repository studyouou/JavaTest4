package org.ougen.exam1.service.impl;

import org.ougen.exam1.mapper.FilmMapper;
import org.ougen.exam1.model.Film;
import org.ougen.exam1.model.Page;
import org.ougen.exam1.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 10:46 2019/7/26
 */
@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmMapper filmMapper;
    @Override
    public List<Film> getFilm(Page page) {
        int offset = page.getPageSize()*(page.getPage()-1);
        return filmMapper.getFile(offset,page.getPageSize(),page.getSort());
    }
}
