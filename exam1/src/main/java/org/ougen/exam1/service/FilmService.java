package org.ougen.exam1.service;

import org.ougen.exam1.model.Film;
import org.ougen.exam1.model.Model;
import org.ougen.exam1.model.Page;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 10:46 2019/7/26
 */
public interface FilmService {
    public List<Film> getFilm(Page page);

    List<Film> getFilmByPageHelper();
}
